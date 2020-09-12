package hello3interrupt.ok;

/**
 * @author liuyanzhao
 * 演示如何正确的终止一个线程
 */
public class ThreadA extends Thread {
    private boolean isInterrupted = false;
    int count = 0;

    @Override
    public void interrupt() {
        isInterrupted = true;
        super.interrupt();
    }

    @Override
    public void run() {
        System.out.println(getName() + "将要运行...");
        while (isInterrupted) {
            System.out.println(getName() + "运行中" + count++);
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                System.out.println(getName() + "从阻塞中退出...");
                System.out.println("this.isInterrupted()=" + this.isInterrupted());

            }
        }
        System.out.println(getName() + "已经终止!");
    }
}

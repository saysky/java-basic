package hello3interrupt.bad;

/**
 * @author liuyanzhao
 */
public class ThreadA extends Thread {
    int count = 0;

    @Override
    public void run() {
        System.out.println(getName() + "将要运行...");
        while (!this.isInterrupted()) {
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

package hello3interrupt.ok;


/**
 * @author liuyanzhao
 * <p>
 * 这样ThreadDemo调用interrupt()方法，isInterrupted()为true，就会退出运行。
 * 但是如果线程正在执行wait,sleep,join方法，你调用interrupt()方法，这个逻辑就不完全了。
 * <p>
 * 如果一个正在sleep的线程，在调用interrupt后，会如何？wait方法检查到isInterrupted()为true，抛出异常，
 * 而你又没有处理。而一个抛出了InterruptedException的线程的状态马上就会被置为非中断状态，如果catch语句没有处理异常，
 * 则下一 次循环中isInterrupted()为false，线程会继续执行，可能你N次抛出异常，也无法让线程停止。
 */
public class Run {

    public static void main(String argv[]) throws InterruptedException {
        ThreadA ta = new ThreadA();
        ta.setName("ThreadA");
        ta.start();
        Thread.sleep(2000);
        System.out.println(ta.getName() + "正在被中断...");
        ta.interrupt();
        System.out.println("ta.isInterrupted()=" + ta.isInterrupted());
    }

}

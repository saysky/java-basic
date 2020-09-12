package hello3priority;

/**
 * 设置县城有限级
 */
public class ThreadPriorityDemo {
    public static void main(String[] args) {
        Thread0 t0 = new Thread0();
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();

        //t1.setPriority(Thread.MIN_PRIORITY);
        //t2.setPriority(Thread.NORM_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);

        t0.start();
        t1.start();
        t2.start();

    }
}

class Thread0 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 6;
             i++) {
            System.out.println(getName());
            Thread.yield();
        }
        System.out.println("0 Over!");
    }
}

class Thread1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 6;
             i++) {
            System.out.println(getName());
            Thread.yield();
        }
        System.out.println("1 Over!");
    }
}

class Thread2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 6;
             i++) {
            System.out.println(getName());
            Thread.yield();
        }
        System.out.println("2 Over!");
    }
}

package schedule.manager;


public class Run {

    public static void main(String[] args) {
        start();

        destoryed();

        start();

    }

    private static void start() {
        MybTimeTask.getInstance().start(true);
    }

    private static void destoryed() {
        MybTimeTask.getInstance().destroyed();
    }

}

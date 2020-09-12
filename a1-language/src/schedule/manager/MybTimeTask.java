package schedule.manager;


import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class MybTimeTask extends TimerTask {

    private Timer timer = null;
    private static boolean flag = false;

    private static MybTimeTask mybTimeTask = null;

    private MybTimeTask() {
    }

    /**
     * 0标识要延迟的时间，5000指毫秒
     * @return
     */
    public static MybTimeTask getInstance() {
        if (mybTimeTask == null || flag) {
            //当flag == true时，为了解决，timer.cancel()后，重新创建一个timer
            mybTimeTask = new MybTimeTask();
            if (flag) {
                flag = false;
            }
        }

        return mybTimeTask;
    }

    public void start(boolean flg) {
        //毫秒
        long time = this.getStartTime();

        if (timer == null) {
            timer = new Timer();

        } else {
            //从此计时器的任务队列中移除所有已取消的任务。
            timer.purge();
        }

        timer.scheduleAtFixedRate(this, new Date(), time);
        System.out.println("定时任务开始...............");
    }

    public void run() {
        System.out.println("定时任务执行：" + System.currentTimeMillis());
        //写自己的逻辑，略
    }

    public void destroyed() {
        System.out.println("定时任务销毁............................");
        //终止此计时器，丢弃所有当前已安排的任务。(不但结束当前schedule，连整个Timer的线程(即当前的定时任务)都会结束掉)
        timer.cancel();
        flag = true;
    }

    private long getStartTime() {
        //毫秒
        long i = 5 * 1000;

        return i;
    }
}

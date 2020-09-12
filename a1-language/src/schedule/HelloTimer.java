package schedule;

import java.util.Timer;
import java.util.TimerTask;

public class HelloTimer {

    public static void main(String[] args) throws java.io.IOException {
        TimerTask task = new TimerTask() {

            @Override
            public void run() {
                System.out.println("hello");

            }

        };
        Timer timer = new Timer();
        /**
         * 0标识要延迟的时间，5000指毫秒
         */
        timer.schedule(task, 0, 1000);
    }

}

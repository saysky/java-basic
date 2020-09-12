package hello2;

import java.util.Random;


/**
 * 场景2：并发响应
 */
public class Run {
    /**
     * 模拟不断有MQ消息过来
     *
     * @return
     */
    public static String getBusinessFromMq() {
        Random random = new Random();

        return "浙江有人充值" + random.nextInt(100) + "元";
    }

    public static void main(String[] args) throws InterruptedException {
        // 代表一直运行
        while (true) {
            String msg = getBusinessFromMq();
            System.out.println(msg);
            while (msg != null) {
                Thread threadChongzhi = new Thread(new Chongzhi(msg));
                threadChongzhi.start();
                msg = null;
            }
            // 每隔1秒查询下有没有交易过来
            Thread.sleep(1000);
            System.out.println("等待交易");
        }

    }

}

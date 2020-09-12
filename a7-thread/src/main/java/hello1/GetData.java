package hello1;


public class GetData implements Runnable {
    private final String url;

    public GetData(String name) {
        url = name;
    }

    /**
     * 场景1： 并行处理 服务器启动3个线程抓数据
     */
    @Override
    public void run() {
        try {
            while (true) {
                System.out.println("抓新闻：" + url);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

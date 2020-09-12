package hello2;

public class Chongzhi implements Runnable {
    private String business;

    public Chongzhi(String msg) {
        business = msg;
    }


    @Override
    public void run() {
        System.out.println("处理业务：" + business);

    }
}

package hello1;

/**
 * 场景1： 并行处理 服务器启动3个线程抓数据
 */
public class Run {

    public static void main(String[] args) {


        Thread thread1 = new Thread(new GetData("qq.com"));
        Thread thread2 = new Thread(new GetData("souhu.com"));
        Thread thread3 = new Thread(new GetData("163.com"));


        thread1.start();
        thread2.start();
        thread3.start();

        //代表一直运行
        while (true) {

        }

    }


}

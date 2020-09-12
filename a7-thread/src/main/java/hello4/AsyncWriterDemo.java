package hello4;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 异步写文件,一个线程读取用户让输入，一个线程在后台入文件
 *
 * @author liuyanzhao
 */
public class AsyncWriterDemo {

    public static void main(String[] args) {
        //缓冲区FIFO
        final Queue buf = new LinkedList();
        //t1 写入文件线程
        final Thread t1 = new Thread() {
            @Override
            public void run() {
                PrintWriter out = null;
                try {
                    out = new PrintWriter(
                            new OutputStreamWriter(
                                    new FileOutputStream("console.txt", true)));
                } catch (IOException e) {
                    e.printStackTrace();
                    return;//有异常就结束线程
                }
                while (true) {
                    if (buf.isEmpty()) {
                        try {
                            Thread.sleep(5000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    String s = (String) buf.poll();//取出一个数据
                    if (s != null) {
                        out.println(s);
                        out.flush();
                        System.out.println(s + "写入成功");
                    }
                }
            }
        };
        t1.setDaemon(true);
        t1.start();

        //t2 是读取控制台线程
        final Thread t2 = new Thread() {
            @Override
            public void run() {
                BufferedReader in =
                        new BufferedReader(
                                new InputStreamReader(System.in));
                while (true) {
                    try {
                        String str = in.readLine();//读取控制台
                        buf.offer(str);//写入到缓冲区
                        if (str.equalsIgnoreCase("quit")) {
                            t1.interrupt();
                            break;
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                        break;
                    }
                }
            }
        };
        t2.start();
    }

}

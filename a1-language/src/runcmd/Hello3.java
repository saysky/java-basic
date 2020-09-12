package runcmd;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hello3 {
    //参数"/c"表示命令执行后关闭Dos立即关闭窗口。
    public static void main(String[] args) throws Exception {
        String[] command = {"cmd", "/c", "D:/greensoft/ffmpeg-latest-win64-static/bin/ffmpeg -i D:/temp/1.flv -vcodec libx264 -c copy D:/temp/1.mp4ffmpeg -i D://temp//1.flv -vcodec libx264 -c copy D://temp//1.mp4"};

        Process proc = Runtime.getRuntime().exec(command);
        BufferedReader br = new BufferedReader(new InputStreamReader(new BufferedInputStream(proc.getInputStream())));

        System.out.println("执行完毕");
    }

}

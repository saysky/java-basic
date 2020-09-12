package runcmd;

import java.io.BufferedReader;
import java.io.InputStreamReader;



public class Hello6 {

    public static void main(String[] args) throws Exception {
        String[] command = {"run.bat"};//ffmpeg -i D://temp//1.flv -vcodec libx264 -c copy D://temp//1.mp4
        Process proc = Runtime.getRuntime().exec(command);
        BufferedReader br = new BufferedReader(new InputStreamReader(proc.getErrorStream()));
        StringBuffer sb = new StringBuffer();
        String line = "";
        while ((line = br.readLine()) != null) {
            sb.append(line);
            System.out.println(line);
        }
        br.close();


        System.out.println("执行完毕");
    }

}

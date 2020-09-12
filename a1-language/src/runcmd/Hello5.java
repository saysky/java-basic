package runcmd;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Hello5 {

    private static int getTimelen(String timelen) {
        int min = 0;
        String strs[] = timelen.split(":");
        if (strs[0].compareTo("0") > 0) {
            min += Integer.valueOf(strs[0]) * 60 * 60;//秒
        }
        if (strs[1].compareTo("0") > 0) {
            min += Integer.valueOf(strs[1]) * 60;
        }
        if (strs[2].compareTo("0") > 0) {
            min += Math.round(Float.valueOf(strs[2]));
        }
        return min;
    }

    public static void main(String[] args) throws Exception {
        String[] command = {"cmd", "/c", "D:/greensoft/ffmpeg-latest-win64-static/bin/ffmpeg -i D:/temp/1.flv "};//ffmpeg -i D://temp//1.flv -vcodec libx264 -c copy D://temp//1.mp4
        Process proc = Runtime.getRuntime().exec(command);
        BufferedReader br = new BufferedReader(new InputStreamReader(proc.getErrorStream()));
        StringBuffer sb = new StringBuffer();
        String line = "";
        while ((line = br.readLine()) != null) {
            sb.append(line);
            System.out.println(line);
            sb.append(line);
        }
        br.close();

        String regexDuration = "Duration: (.*?), start: (.*?), bitrate: (//d*) kb///s";
        Pattern pattern = Pattern.compile(regexDuration);
        Matcher m = pattern.matcher(sb.toString());
        if (m.find()) {
            int time = getTimelen(m.group(1));
            System.out.println("视频时长：" + time + ", 开始时间：" + m.group(2) + ",比特率：" + m.group(3) + "kb/s");

        }


        System.out.println("执行完毕");
    }

}

package runcmd;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hello2 {

    public static void main(String[] args) throws Exception {
        String[] command = {"cmd", "/c", "dir"};

        Process proc = Runtime.getRuntime().exec(command);
        BufferedReader br = new BufferedReader(new InputStreamReader(new BufferedInputStream(proc.getInputStream())));
        String s;
        while ((s = br.readLine()) != null) {
            System.out.println(s);
        }
        br.close();
        System.out.println("执行完毕");
    }

}

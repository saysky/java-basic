package runcmd;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hello1 {

    /**
     * 读取输出流数据
     *
     * @param p 进程
     * @return 从输出流中读取的数据
     * @throws IOException
     */
    public static final String getShellOut(Process p) throws IOException {

        StringBuilder sb = new StringBuilder();
        BufferedInputStream in = null;
        BufferedReader br = null;

        try {

            in = new BufferedInputStream(p.getInputStream());
            br = new BufferedReader(new InputStreamReader(in));
            String s;

            while ((s = br.readLine()) != null) {
                // 追加换行符
                //sb.append(ConstantUtil.LINE_SEPARATOR);

                sb.append(s);
                System.out.println(s);
            }

        } catch (IOException e) {
            throw e;
        } finally {
            br.close();
            in.close();
        }

        return sb.toString();
    }


    public static void main(String[] args) throws Exception {
        String[] command = {"cmd", "/c", "dir"};
        Process proc = Runtime.getRuntime().exec(command);
        getShellOut(proc);
        //System.out.println(getShellOut(proc));
			/*
			BufferedReader br = new BufferedReader(new InputStreamReader(proc.getInputStream()));
			String line = null;
			if ((line = br.readLine()) == null) {
				System.out.println(line);
			}
			*/

    }

}

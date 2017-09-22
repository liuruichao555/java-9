package com.liuruichao.proc;

import java.io.IOException;
import java.io.InputStream;

/**
 * Test1
 *
 * @author liuruichao
 * Created on 2017/9/22 12:20
 */
public class Test1 {
    public static void main(String[] args) throws IOException, InterruptedException {
        Process proc = Runtime.getRuntime().exec(new String[]{"/bin/sh", "-c", "echo $PPID"});
        if (proc.waitFor() == 0) {
            InputStream in = proc.getInputStream();
            int available = in.available();
            byte[] buffer = new byte[available];
            int len = in.read(buffer);
            String pid = new String(buffer, 0, len);
            System.out.println("pid: " + pid);
        }
    }
}

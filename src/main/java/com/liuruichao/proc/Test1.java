package com.liuruichao.proc;

import org.apache.commons.io.IOUtils;

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
            System.out.println(IOUtils.toString(in, "utf-8"));
        }

        /*Process proc = Runtime.getRuntime().exec("pwd");
        if (proc.waitFor() == 0) {
            InputStream in = proc.getInputStream();
            System.out.println(IOUtils.toString(in, "utf-8"));
        }*/
    }
}

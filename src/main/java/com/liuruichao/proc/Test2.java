package com.liuruichao.proc;

import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/**
 * Test2
 *
 * @author liuruichao
 * Created on 2017/9/27 14:00
 */
public class Test2 {
    public static void main(String[] args) throws IOException, InterruptedException {
        Process process = Runtime.getRuntime().exec("ls /Users/liuruichao");
        InputStream in = process.getInputStream();
        if (process.waitFor() == 0) {
            System.out.println(IOUtils.toString(in, Charset.forName("utf-8")));
        } else {
            System.out.println("执行失败！");
        }
    }
}

package com.liuruichao.http;

import jdk.incubator.http.HttpClient;
import jdk.incubator.http.HttpRequest;
import jdk.incubator.http.HttpResponse;

import java.net.URI;

/**
 * Test1
 *
 * @author liuruichao
 * Created on 2017/9/22 11:09
 */


public class Test1 {
    public static void main(String[] args) throws Exception {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder(URI.create("http://www.baidu.com")).GET().build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandler.asString());
        if (response.statusCode() == 200) {
            System.out.println(response.body());
        } else {
            System.out.println("请求失败！");
        }
    }
}

package com.liuruichao.http;


import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

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
        HttpResponse.BodyHandler responseBodyHandler = HttpResponse.BodyHandlers.ofString();
        HttpResponse<String> response = client.send(request, responseBodyHandler);
        if (response.statusCode() == 200) {
            System.out.println(response.body());
        } else {
            System.out.println("请求失败！");
        }
    }
}

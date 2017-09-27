package com.liuruichao.websocket;

import jdk.incubator.http.WebSocket;

import java.net.URI;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

/**
 * Test1
 *
 * @author liuruichao
 * Created on 2017/9/27 14:16
 */
public class Test1 {
    public static void main(String[] args) {
        // TODO
        /*WebSocket.newBuilder(new URI("ws://spring-sockets.herokuapp.com/stocks"),
                new EchoListener()).buildAsync().join();*/
    }

    private static class EchoListener implements WebSocket.Listener {
        @Override
        public CompletionStage<?> onText(WebSocket webSocket, CharSequence message, WebSocket.MessagePart part) {
            webSocket.request(1);
            return CompletableFuture.completedFuture(message).thenAccept(System.out::println);
        }
    }
}

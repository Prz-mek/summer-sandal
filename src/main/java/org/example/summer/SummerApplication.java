package org.example.summer;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpServer;

public class SummerApplication {

    HttpServer server;
    int serverPort = 8080;

    public SummerApplication() throws IOException {
        server = HttpServer.create(new InetSocketAddress(serverPort), 0);
    }

    public SummerApplication(int serverPort) throws IOException {
        this.serverPort = serverPort;
        server = HttpServer.create(new InetSocketAddress(serverPort), 0);
    }

    public void get(String path, ResponseMethod resFun) {
        server.createContext(path, exchange -> {
            if ("GET".equals(exchange.getRequestMethod())) {
                resFun.method(exchange);
            }
            exchange.close();
        });
    }

    public void post(String path, ResponseMethod resFun) {
        server.createContext(path, exchange -> {
            if ("POST".equals(exchange.getRequestMethod())) {
                resFun.method(exchange);
            }
            exchange.close();
        });
    }

    public void put(String path, ResponseMethod resFun) {
        server.createContext(path, exchange -> {
            if ("PUT".equals(exchange.getRequestMethod())) {
                resFun.method(exchange);
            }
            exchange.close();
        });
    }

    public void delete(String path, ResponseMethod resFun) {
        server.createContext(path, exchange -> {
            if ("DELETE".equals(exchange.getRequestMethod())) {
                resFun.method(exchange);
            }
            exchange.close();
        });
    }

    public void start() {
        server.setExecutor(null);
        server.start();
    }
}

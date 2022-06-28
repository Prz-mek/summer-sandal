package org.example.summer;

import com.sun.net.httpserver.HttpExchange;

import java.io.IOException;

public interface ResponseMethod {
    void method(HttpExchange exchange) throws IOException;
}

package org.example;

import com.sun.net.httpserver.HttpExchange;
import org.example.domain.DataMock;
import org.example.domain.Employee;
import org.example.summer.SummerApplication;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        DataMock db = new DataMock();
        try {
            SummerApplication app = new SummerApplication();

            app.get("/api/get", (exchange -> {
                String res = db.getAll().toString();
                exchange.sendResponseHeaders(200, res.getBytes().length);
                OutputStream output = exchange.getResponseBody();
                output.write(res.getBytes());
            }));

            app.get("/home", (exchange -> {
                String res = WebSites.HOME;
                exchange.sendResponseHeaders(200, res.getBytes().length);
                OutputStream output = exchange.getResponseBody();
                output.write(res.getBytes());
            }));

            app.post("/home", (exchange -> {
                String reqText = exchange.getRequestURI().getQuery();
                db.add(Employee.fromQuery(reqText));
                String res = "OK";
                exchange.sendResponseHeaders(200,0);
                OutputStream output = exchange.getResponseBody();
                output.write(res.getBytes());
            }));

            app.start();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
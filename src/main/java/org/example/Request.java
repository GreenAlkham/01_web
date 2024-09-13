package org.example;

import java.util.List;

public class Request {
    //    метод запроса, потому что на разные методы можно назначить один и тот же хендлер;
    private String method;
    private String path;
    private List<String> headers;

    private static final byte[] requestLineDelimiter = new byte[]{'\r', '\n'};

    public Request(String method, String path, List<String> headers) {
        this.method = method;
        this.path = path;
        this.headers = headers;
    }

    public String getMethod() {
        return method;
    }

    public String getPath() {
        return path;
    }

    public List<String> getHeaders() {
        return headers;
    }
}



package org.example;

import org.example.service.WriterService;

public class Main {
    public static void main(String[] args) {
        WriterService writerService = new WriterService();
        writerService.writerMethod();
    }
}
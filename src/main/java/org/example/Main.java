package org.example;

import org.example.service.WriterService;

public class Main {
    public static void main(String[] args) {
        System.out.println("Serializing and writing, please wait...");

        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WriterService writerService = new WriterService();
        writerService.writerMethod();

        System.out.println("Done!");
    }
}
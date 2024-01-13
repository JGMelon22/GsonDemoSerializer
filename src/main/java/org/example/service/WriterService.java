package org.example.service;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriterService {

    public void writerMethod() {

        SerielizerHelper serielizerHelper = new SerielizerHelper();
        String jsonCars = serielizerHelper.serializeMethod();

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("cars.json"))) {
            bufferedWriter.write(jsonCars);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

package org.example.service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.example.Car;

import java.util.ArrayList;

public class SerielizerHelper {
    public String serializeMethod() {

        Car camaro = new Car("Camaro SS", 250, 2011, "Chevrolet");
        Car mustang = new Car("Mustang GT500", 275, 2022, "Ford");
        Car camry = new Car("Camry XSE", 160, 2023, "Toyota");
        Car silverado = new Car("Silverado LTZ", 180, 2021, "Chevrolet");
        Car civic = new Car("Civic SI", 155, 2024, "Honda");
        Car explorer = new Car("Explorer Limited", 170, 2022, "Ford");
        Car wrangler = new Car("Wrangler Rubicon", 140, 2023, "Jeep");
        Car accord = new Car("Accord Touring", 165, 2022, "Honda");
        Car f150 = new Car("F-150 Raptor", 190, 2021, "Ford");
        Car rav4 = new Car("Rav4 Hybrid", 150, 2023, "Toyota");
        Car mustangMachE = new Car("Mustang Mach-E", 200, 2024, "Ford");
        Car grandCherokee = new Car("Grand Cherokee Laredo", 175, 2022, "Jeep");

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(camaro);
        cars.add(mustang);
        cars.add(camry);
        cars.add(silverado);
        cars.add(civic);
        cars.add(explorer);
        cars.add(wrangler);
        cars.add(accord);
        cars.add(f150);
        cars.add(rav4);
        cars.add(mustangMachE);
        cars.add(grandCherokee);

        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setPrettyPrinting();

        Gson gson = gsonBuilder.create();
        String jsonString = gson.toJson(cars);

        return jsonString;
    }
}

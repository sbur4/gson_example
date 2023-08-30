package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.example.models.Car;
import org.example.models.Dto;

public class PrettyPrinting {
    public static void main(String[] args) {
        Car car = new Car();
        car.setBrand("tesla");
        Dto dto = new Dto();
        dto.setCar(car);

        Gson gson = new GsonBuilder()
                .setPrettyPrinting() // Enable pretty printing
                .create();

        String json = gson.toJson(car);
        System.out.println(json);
    }
}
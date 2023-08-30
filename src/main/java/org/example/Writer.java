package org.example;

import com.google.gson.Gson;
import org.example.models.Car;
import org.example.models.Dto;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Writer {
    public static void main(String[] args) throws IOException {
        Car car = new Car();
        car.setBrand("tesla");
        Dto dto = new Dto();
        dto.setCar(car);

        Files.write(Paths.get("examples/output_data.json"), new Gson().toJson(dto).getBytes());
    }
}
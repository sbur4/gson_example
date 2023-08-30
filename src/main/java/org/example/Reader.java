package org.example;

import com.google.gson.Gson;
import org.example.models.Dto;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Reader {
    public static void main(String[] args) throws IOException {
        String jsonContent = new String(Files.readAllBytes(Paths.get("examples/input_data.json")));
        Dto convertedObject = new Gson().fromJson(jsonContent, Dto.class);
        System.out.println(convertedObject.toString());
    }
}
package org.example;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.example.models.Car;
import org.example.models.Dto;
import org.example.models.Engine;

public class FieldNamingPolice {
    public static void main(String[] args) {
        Car car = new Car();
        car.setBrand("teSla");
        car.setModel("hello epam");
        Engine engine = new Engine();
        engine.setType(new String[]{"java", "Java", "j a v a", "j_a_v_a", "JAVA", "jaVA"});
        Dto dto = new Dto();
        dto.setCar(car);
        dto.setEngine(engine);

        generateGson(dto, FieldNamingPolicy.IDENTITY);
        generateGson(dto, FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES);
        generateGson(dto, FieldNamingPolicy.LOWER_CASE_WITH_DASHES);
        generateGson(dto, FieldNamingPolicy.LOWER_CASE_WITH_DOTS);
        generateGson(dto, FieldNamingPolicy.UPPER_CAMEL_CASE);
        generateGson(dto, FieldNamingPolicy.UPPER_CAMEL_CASE_WITH_SPACES);
        generateGson(dto, FieldNamingPolicy.UPPER_CASE_WITH_UNDERSCORES);
    }

    private static void generateGson(Dto dto, FieldNamingPolicy fieldNamingPolicy) {
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(fieldNamingPolicy)
                .create();

        String json = gson.toJson(dto);
        System.out.println(json);
    }
}
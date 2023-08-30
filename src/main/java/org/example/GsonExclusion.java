package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.example.models.ExcludedFieldsDto;

public class GsonExclusion {
    public static void main(String[] args) {
        ExcludedFieldsDto dto = new ExcludedFieldsDto("Boston", 3, "boston_cat@google.com");

        Gson gson = new GsonBuilder()
                .excludeFieldsWithoutExposeAnnotation() // Exclude fields without @Expose annotation
                .create();

        String json = gson.toJson(dto);
        System.out.println(json); // -> {"email":"boston_cat@google.com"}
    }
}
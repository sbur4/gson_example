package org.example.models;

import com.google.gson.annotations.Expose;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ExcludedFieldsDto {
    private String name;
    private int age;
    @Expose
    private String email;
}
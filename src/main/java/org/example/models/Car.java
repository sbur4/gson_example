package org.example.models;

import lombok.Data;

import java.util.Map;

@Data
public class Car {
    private String brand;
    private String model;
    private Integer year;
    private Double speed;
    private Boolean hybrid;
    private Short tank;
    private Map<String, Boolean> features;
}
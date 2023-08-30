package org.example.models;

import lombok.Data;

import java.util.List;

@Data
public class Engine {
    private String[] type;
    private List<Long> power;
}
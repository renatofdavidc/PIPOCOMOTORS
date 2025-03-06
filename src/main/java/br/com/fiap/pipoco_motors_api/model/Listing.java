package br.com.fiap.pipoco_motors_api.model;

import java.util.Random;

public class Listing {

    private Long id;
    private String brand;
    private String name;
    private String plate;
    private String yearModel;
    private String color;
    private String description;
    private Double value;

    public Listing(Long id, String brand, String name, String plate, String yearModel, String color, String description, Double value) {
        this.id = Math.abs(new Random().nextLong());
        this.brand = brand;
        this.name = name;
        this.plate = plate;
        this.yearModel = yearModel;
        this.color = color;
        this.description = description;
        this.value = value;
    }

    public Long getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getName() {
        return name;
    }

    public String getPlate() {
        return plate;
    }

    public String getYearModel() {
        return yearModel;
    }

    public String getColor() {
        return color;
    }

    public String getDescription() {
        return description;
    }

    public Double getValue() {
        return value;
    }
    
    
}

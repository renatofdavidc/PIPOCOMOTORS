package br.com.fiap.money_control_api.model;

import java.util.Random;

public class Listing {

    private Long id;
    private String brand;
    private String name;
    private String plate;
    private String yearModel;
    private String color;
    private Double value;

    public Listing(Long id, String brand, String name, String plate, String yearModel, String color, Double value) {
        this.id = Math.abs(new Random().nextLong());
        this.brand = brand;
        this.name = name;
        this.plate = plate;
        this.yearModel = yearModel;
        this.color = color;
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

    public Double getValue() {
        return value;
    }
    
    
}

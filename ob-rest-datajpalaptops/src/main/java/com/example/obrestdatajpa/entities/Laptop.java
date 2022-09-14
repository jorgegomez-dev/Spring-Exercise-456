package com.example.obrestdatajpa.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "laptops")
public class Laptop {

    // atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String brand;
    private String model;
    private Double screenInches;
    private Double price;
    private LocalDate releaseDate;
    private Boolean onLine;

    // constructores
    public Laptop() {
    }

    public Laptop(Long id, String brand, String model, Double screenInches, Double price, LocalDate releaseDate, Boolean onLine) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.screenInches = screenInches;
        this.price = price;
        this.releaseDate = releaseDate;
        this.onLine = onLine;
    }

    // getter & setter

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Double getScreenInches() {
        return screenInches;
    }

    public void setScreenInches(Double screenInches) {
        this.screenInches = screenInches;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Boolean getOnLine() {
        return onLine;
    }

    public void setOnLine(Boolean onLine) {
        this.onLine = onLine;
    }

    // toString


}

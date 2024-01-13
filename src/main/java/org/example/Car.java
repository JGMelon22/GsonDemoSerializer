package org.example;

import java.util.Objects;

public class Car {
    private String name;
    private int maxSpeed;
    private int releaseYear;
    private String brand;

    public Car() {
    }

    public Car(String name, int maxSpeed, int releaseYear, String brand) {
        this.name = name;
        this.maxSpeed = maxSpeed;
        this.releaseYear = releaseYear;
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getBrand() {
        return name;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return maxSpeed == car.maxSpeed && Objects.equals(name, car.name) && Objects.equals(releaseYear, car.releaseYear) && Objects.equals(brand, car.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, maxSpeed, releaseYear, brand);
    }
}

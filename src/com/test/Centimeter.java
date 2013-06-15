package com.test;

public class Centimeter {
    private final int centimeter;

    public Centimeter(int centimeter) {
        this.centimeter = centimeter;
    }

    public String theCentimeter() {
        return centimeter+"cm";
    }

    public String toMeter() {
        return (centimeter/100)+"m";
    }

    public String toMillimeter() {
        return (centimeter*10)+"mm";
    }
}

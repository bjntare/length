package com.test;


public class Meter {

    private final int meter;

    public Meter(int meter) {
        this.meter = meter;
    }

    public String theMeter() {
        return meter+"m";
    }

    public String toCentimeter() {
        return (meter*100)+"cm";
    }


    public String toMillimeter() {
        return (meter*1000)+"mm";
    }


}

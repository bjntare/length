package com.test;


public class Meter {

    private final int meter;

    public Meter(int meter) {
        this.meter = meter;
    }

    public Meter(int meter1, int meter2){
        meter = 0;
        int m = meter1;
        int m1 = meter2;

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


    public int sum(int meter1, int meter2) {
        return meter1+meter2;
    }
}

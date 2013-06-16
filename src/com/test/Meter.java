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


    public static int sum(int meter1, int meter2) {
        return meter1+meter2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Meter meter1 = (Meter) o;

        if (meter != meter1.meter) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return meter;
    }

    public int subtract(int meter1, int meter2) {
        return meter1-meter2;
    }
}

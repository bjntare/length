package com.test;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class Centimeter_Test {
    @Test
    public void represents_length_in_centimeters(){
        Centimeter centimeter = new Centimeter(6);
        String centimeter1 = centimeter.theCentimeter();
        assertThat(centimeter1,is("6cm"));
    }

    @Test
    public void converts_centimeters_meters(){
        Centimeter centimeter = new Centimeter(100);
        Meter meter = new Meter(1);
        String centimeter_value = centimeter.toMeter();
        assertThat(centimeter_value.equals(meter.theMeter()),is(true));

    }

}

package com.test;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class Meter_Test {
    @Test
    public void represent_length_in_meter(){
        Meter meter = new Meter(6);
        String meters = meter.theMeter();
        assertThat(meters, is("6m"));
    }

    @Test
    public void converts_meters_to_centimeter(){
        Meter meter = new Meter(1);
        Centimeter centimeter = new Centimeter(100);
        String meter_value = meter.toCentimeter();
        assertThat(meter_value.equals(centimeter.theCentimeter()), is(true));
    }

    @Test
    public void converts_meters_to_millimeter(){
        Meter meter = new Meter(1);
        Millimeter millimeter = new Millimeter(1000);
        String meter_value_mm = meter.toMillimeter();
        assertThat(meter_value_mm.equals(meter.theMeter()), is(true));
    }

    @Test
    public void add_meter_lengths(){
        Meter meter =  new Meter(2,3);
        int sum_meter = meter.sum(1,4);
        assertThat(sum_meter,is(5) );
    }

    @Test
    public void subtract_meter_length(){
        Meter meter_diff = new Meter(Meter.sum(1,4),1);
        int diff_in_meter = meter_diff.subtract(5,1);
        assertThat(diff_in_meter,is(4));

    }
}

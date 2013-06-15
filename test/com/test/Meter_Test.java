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

}

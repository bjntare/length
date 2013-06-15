package com.test;


import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class Millimeter_Test {
    @Test
    public void represents_length_in_millimeter(){
        Millimeter millimeter = new Millimeter(6);
        String millimeter1 = millimeter.theMillimeter();
        assertThat(millimeter1,is("6mm"));
    }

    @Test
    public void converts_centimeters_to_meters(){
        Millimeter millimeter = new Millimeter(10);
        Centimeter centimeter = new Centimeter(1);
        String millimeter_value_cm = millimeter.toCentimeter();
        assertThat(millimeter_value_cm.equals(centimeter.theCentimeter()),is(true));
    }


}

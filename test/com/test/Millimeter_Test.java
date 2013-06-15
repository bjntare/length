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


}

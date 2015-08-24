package com.barclays;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SquareTest {

    @Test
    public void shouldCalculatePerimeter(){
        Square square = new Square(5);
        assertEquals(20,square.perimeter(),0.0d);
    }

    @Test
    public void shouldCalculateArea(){
        Square square = new Square(5);
        assertEquals(25,square.area(),0.0d);
    }

}

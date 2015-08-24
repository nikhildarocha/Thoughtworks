package com.barclays;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RectangleTest {

    @Test
    public void shouldCalculatePerimeter() {
        Rectangle rectangle = new Rectangle(10,12);
        assertEquals(44, rectangle.perimeter(), 0.0d);
    }

    @Test
    public void shouldCalculateArea() {

        Rectangle rectangle = new Rectangle(10,12);
        assertEquals(120, rectangle.area(), 0.0d);
    }
}

package com.barclays;


public class Rectangle {

    private double height;
    private double breadth;

    public Rectangle(double breadth, double height) {
        this.breadth = breadth;
        this.height = height;
    }

    public  double perimeter(){
        return 2*(height+breadth);
    }

    public  double area(){
        return (height*breadth);
    }


}

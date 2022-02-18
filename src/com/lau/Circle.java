package com.lau;

public class Circle {

    public static  final double RADIUS=1;
    public static  final String COLOR = "Красный";

    private double radius;
    private String color;

    public Circle(){
        radius = RADIUS;
        color = COLOR;
    }

    public Circle(double radius){
        this.radius = radius;
        color = COLOR;
    }

    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public String toString() { return "Круг радиуса: "+radius+" и цвета: "+color; }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){return radius * radius * Math.PI;}

}

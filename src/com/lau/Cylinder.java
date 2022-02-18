package com.lau;

public class Cylinder extends Circle {
    private  double height;

    public  Cylinder(){
        super();
        height = 1;
    }

    public Cylinder(double radius,double height){
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea(){

        return 2*Math.PI*getRadius()*height+2*super.getArea();
    }

    public double getVolume(){
        return  super.getArea()*height;
    }

    public String toString(){
        return "Радиус = "+getRadius()+
               "\nВысота = "+getHeight()+
               "\nЦвет = " +getColor()+
               "\nПлощадь основания = "+super.getArea()+
               "\nПлощадь поверхности цилиндра = "+getArea()+
               "\nОбъем = "+ getVolume();
    }
}

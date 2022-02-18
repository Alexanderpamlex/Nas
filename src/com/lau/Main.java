package com.lau;

public class Main {

    public static void main(String[] args) {

        Cylinder cy1 = new Cylinder();
        System.out.println(cy1);
        Cylinder c2 = new Cylinder(5,2);
        System.out.println(c2);

        Point3D p1 = new Point3D(3,4,5);
        System.out.println(p1);
        Point3D p2 = new Point3D(1,3,4);
        System.out.println(p1.distance(2,4,1));
        System.out.println(p1.distance(p2));
    }
}

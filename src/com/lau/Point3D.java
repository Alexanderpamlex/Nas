package com.lau;

public class Point3D extends  Point{

    private int z;

    public Point3D(){
        super();
        z=0;
    }
    public Point3D(int x,int y,int z){
        super(x,y);
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public String toString() {
        return "Point3D{"+ "x=" + getX() + ",y=" + getY() +",z=" + z +'}';
    }

    public double distance(int x,int y,int z){
        int xDiff = getX() - x;
        int yDiff = getY() - y;
        int zDiff = this.z - z;
        System.out.print("Расстояние между точками= " );
        return Math.sqrt(xDiff*xDiff+yDiff*yDiff+zDiff*zDiff);
    }

    public double distance(Point3D another){
        int xDiff = getX() - another.getX();
        int yDiff = getY() - another.getY();
        int zDiff = this.z - another.z;
        System.out.print("Расстояние между точками= ");
        return Math.sqrt(xDiff*xDiff+yDiff*yDiff+zDiff*zDiff);
    }



}

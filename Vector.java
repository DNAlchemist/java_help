package com.max.idea;

//import java.lang.String;
public class Vector {
    private double x, y, z;

    Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }


    public void print() {
        System.out.println("x= " + x);
        System.out.println("y= " + y);
        System.out.println("z= " + z);
    }

    public double lengths()
    {
        double len=Math.sqrt(x+y+z);

        return len;
    }
}

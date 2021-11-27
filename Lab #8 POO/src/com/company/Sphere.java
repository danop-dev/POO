package com.company;

public class Sphere implements GeometricBody {
    int r;

    public Sphere(int r) {
        this.r = r;
    }

    @Override
    public double getSurface() {
        return 4 * Math.PI * Math.pow(r, 2);
    }

    @Override
    public double getVolume() {
        return (4.0/3.0) * Math.PI * Math.pow(r, 3);
    }

    @Override
    public String toString() {
        return "Sphere: " + "r = " + r;
    }
}

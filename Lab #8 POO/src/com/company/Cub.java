package com.company;

public class Cub implements GeometricBody {
    int a;

    public Cub(int a) {
        this.a = a;
    }

    @Override
    public double getSurface() {
        return 6 * Math.pow(a, 2);
    }

    @Override
    public double getVolume() {
        return Math.pow(a, 3);
    }

    @Override
    public String toString() {
        return "Cub: " + "a = " + a;
    }
}

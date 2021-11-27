package com.company;

public class Parallelepiped implements GeometricBody {
    int a, b, c;

    public Parallelepiped(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getSurface() {
        return 2 * (a*b + a*c + b*c);
    }

    @Override
    public double getVolume() {
        return a * b * c;
    }

    @Override
    public String toString() {
        return "Parallelepiped: " + "a = " + a + ", b = " + b + ", c = " + c;
    }
}

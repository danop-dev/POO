package com.company;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Cub cub = new Cub(1550);
        Parallelepiped parallelepiped = new Parallelepiped(20,10,5);
        Sphere sphere = new Sphere(5);

        ArrayList<GeometricBody> geometricBodiesList = new ArrayList<>();

        geometricBodiesList.add(cub);
        geometricBodiesList.add(parallelepiped);
        geometricBodiesList.add(sphere);

        GeometricBodyController geometricBodyController = new GeometricBodyController();

        System.out.println("Biggest Surface Object --->  " + geometricBodyController.biggestSurfaceBody(geometricBodiesList));
        System.out.println("Biggest Volume Object --->  " + geometricBodyController.biggestVolumeBody(geometricBodiesList));


    }
}

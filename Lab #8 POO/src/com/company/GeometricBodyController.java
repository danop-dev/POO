package com.company;
import java.util.ArrayList;

public class GeometricBodyController {

    String biggestSurfaceBody(ArrayList<GeometricBody> geometricBodies){
        GeometricBody maxSurfaceBody = geometricBodies.get(0);

        for(GeometricBody body : geometricBodies){
            if(maxSurfaceBody.getSurface() < body.getSurface()){
                maxSurfaceBody = body;
            }
        }
        return maxSurfaceBody + "\t Surface: " + maxSurfaceBody.getSurface();
    }

    String biggestVolumeBody(ArrayList<GeometricBody> geometricBodies){
        GeometricBody maxVolumeBody = geometricBodies.get(0);

        for(GeometricBody body : geometricBodies){
            if(maxVolumeBody.getVolume() < body.getVolume()){
                maxVolumeBody = body;
            }
        }
        return maxVolumeBody + "\t Volume: " + maxVolumeBody.getVolume();

    }
}

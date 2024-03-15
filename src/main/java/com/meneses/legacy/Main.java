package com.meneses.legacy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println(
                "Seleccione su camara: " +
                "1. CamaraX" +
                        "2. CamaraY" +
                        "3. CamaraZ"
        );
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int camera = reader.read();

        CameraService cameraService = new CameraService();

        switch (camera) {
            case 1:
                new CameraX(cameraService);

                break;
            case 2:
                new CameraY(cameraService);
                break;
            case 3:
                new CameraZ(cameraService);
                break;
        }
    }

    private void continueWithCameraX(CameraX cameraX) {
        System.out.println(
                "Que desea hacer: " +
                        "1. Tomar foto" +
                        "2. Tomar video" +
                        "3. CamaraZ"
        );
    }
}

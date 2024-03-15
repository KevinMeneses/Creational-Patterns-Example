package com.meneses.legacy;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        CameraService cameraService = new CameraService();

        System.out.println(
                "Seleccione su camara:" +
                " 1. CamaraX" +
                        " 2. CamaraY" +
                        " 3. CamaraZ"
        );

        Scanner scanner = new Scanner(System.in);
        int camera = scanner.nextInt();

        switch (camera) {
            case 1:
                continueWithCameraX(new CameraX(cameraService));
                break;
            case 2:
                continueWithCameraY(new CameraY(cameraService));
                break;
            case 3:
                continueWithCameraZ(new CameraZ(cameraService));
                break;
            default:
                System.out.println("Opcion no soportada");
                break;
        }
    }

    private static void continueWithCameraX(CameraX cameraX) throws IOException {
        System.out.println(
                "Que desea hacer:" +
                        " 1. Tomar foto"
        );

        Scanner scanner = new Scanner(System.in);
        int action = scanner.nextInt();

        if (action == 1) {
            Boolean result = cameraX.takePhoto();
            System.out.println("Foto tomada: " + result);
        } else {
            System.out.println("Opcion no soportada");
        }
    }

    private static void continueWithCameraY(CameraY cameraY) throws IOException, InterruptedException {
        System.out.println(
                "Que desea hacer:" +
                        " 1. Tomar foto" +
                        " 2. Iniciar grabación de video"
        );

        Scanner scanner = new Scanner(System.in);
        int action = scanner.nextInt();
        Boolean result;
        switch (action) {
            case 1:
                result = cameraY.takePhoto();
                System.out.println("Foto tomada: " + result);
                break;
            case 2:
                result = cameraY.startVideoRecording();
                System.out.println("Grabacion de video iniciada: " + result);
                break;
            default:
                System.out.println("Opcion no soportada");
                break;
        }

        System.out.println("Ingrese cualquier tecla para finalizar la grabación");
        scanner.nextByte();

        result = cameraY.stopVideoRecording();
        System.out.println("Grabacion de video terminada: " + result);
    }

    private static void continueWithCameraZ(CameraZ cameraZ) throws IOException, InterruptedException {
        System.out.println(
                "Que desea hacer:" +
                        " 1. Tomar foto" +
                        " 2. Iniciar grabación de video" +
                        " 3. Iniciar grabación de audio"
        );

        Scanner scanner = new Scanner(System.in);
        int action = scanner.nextInt();
        Boolean result;
        switch (action) {
            case 1:
                result = cameraZ.takePhoto();
                System.out.println("Foto tomada: " + result);
                break;
            case 2:
                result = cameraZ.startVideoRecording();
                System.out.println("Grabacion de video iniciada: " + result);
                System.out.println("Ingrese cualquier tecla para finalizar la grabación");
                scanner.nextByte();
                result = cameraZ.stopVideoRecording();
                System.out.println("Grabacion de video terminada: " + result);
                break;
            case 3:
                result = cameraZ.startAudioRecording();
                System.out.println("Grabacion de audio iniciada: " + result);
                System.out.println("Ingrese cualquier tecla para finalizar la grabación");
                scanner.nextByte();
                result = cameraZ.stopVideoRecording();
                System.out.println("Grabacion de audio terminada: " + result);
                break;
            default:
                System.out.println("Opcion no soportada");
                break;
        }
    }
}

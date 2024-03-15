package com.meneses.refactor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CameraService cameraService = CameraService.getInstance();
        cameraService.setToken("token");

        System.out.println(
                "Seleccione su camara:" +
                " 1. CamaraX" +
                        " 2. CamaraY" +
                        " 3. CamaraZ"
        );

        Scanner scanner = new Scanner(System.in);
        int cameraType = scanner.nextInt();
        CameraFactory cameraFactory = new CameraFactory(cameraService);
        Camera camera = cameraFactory.create(cameraType);
        if (camera == null) {
            System.out.println("Opcion no soportada");
            return;
        }

        System.out.println(
                "Que desea hacer:" +
                        " 1. Tomar foto" +
                        " 2. Iniciar grabación de video" +
                        " 3. Iniciar grabación de audio"
        );

        int action = scanner.nextInt();
        Boolean result;

        switch (action) {
            case 1:
                result = camera.takePhoto();
                System.out.println("Foto tomada: " + result);
                break;
            case 2:
                result = camera.startVideoRecording();
                if (result == null) {
                    System.out.println("Opcion no soportada");
                    break;
                }

                System.out.println("Grabacion de video iniciada: " + result);
                System.out.println("Ingrese cualquier tecla para finalizar la grabación");
                scanner.nextByte();
                result = camera.stopVideoRecording();
                System.out.println("Grabacion de video terminada: " + result);
                break;
            case 3:
                result = camera.startAudioRecording();
                if (result == null) {
                    System.out.println("Opcion no soportada");
                    break;
                }

                System.out.println("Grabacion de audio iniciada: " + result);
                System.out.println("Ingrese cualquier tecla para finalizar la grabación");
                scanner.nextByte();
                result = camera.stopVideoRecording();
                System.out.println("Grabacion de audio terminada: " + result);
                break;
            default:
                System.out.println("Opcion no soportada");
                break;
        }
    }
}

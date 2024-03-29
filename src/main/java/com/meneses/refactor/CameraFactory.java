package com.meneses.refactor;

public class CameraFactory {
    private final CameraService cameraService;

    public CameraFactory(CameraService cameraService) {
        this.cameraService = cameraService;
    }

    public Camera create(int type) {
        return switch (type) {
            case 1 -> new CameraX(cameraService);
            case 2 -> new CameraY(cameraService);
            case 3 -> new CameraZ(cameraService);
            default -> null;
        };
    }
}

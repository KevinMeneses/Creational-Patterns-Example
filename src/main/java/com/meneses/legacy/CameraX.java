package com.meneses.legacy;

import java.util.List;

public class CameraX {
    private final CameraService cameraService;

    public CameraX(CameraService cameraService) {
        this.cameraService = cameraService;
    }

    public List<CameraFile> getPhotos() {
        CameraCommand command = new CameraCommand("token", 1, "file", 10);
        CameraCommandResult result = cameraService.sendCommand(command);
        return parseToFileList(result);
    }

    private List<CameraFile> parseToFileList(CameraCommandResult result) {
        return List.of(new CameraFile());
    }

    public List<CameraFileMetadata> getPhotosMetadata() {
        CameraCommand command = new CameraCommand("token", 2, "metadata");
        CameraCommandResult result = cameraService.sendCommand(command);
        return parseToMetadataList(result);
    }

    private List<CameraFileMetadata> parseToMetadataList(CameraCommandResult result) {
        return List.of(new CameraFileMetadata());
    }

    public Boolean takePhoto() {
        CameraCommand command = new CameraCommand("token", 3);
        CameraCommandResult result = cameraService.sendCommand(command);
        return parseToBoolean(result);
    }

    private Boolean parseToBoolean(CameraCommandResult result) {
        return true;
    }

    public Boolean saveMetadata(CameraFileMetadata metadata) {
        String information = parseToString(metadata);
        CameraCommand command = new CameraCommand("token", 10, information);
        CameraCommandResult result = cameraService.sendCommand(command);
        return parseToBoolean(result);
    }

    private String parseToString(CameraFileMetadata metadata) {
        return "";
    }
}

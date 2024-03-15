package com.meneses.legacy;

import java.util.List;

public class CameraY {
    private final CameraService cameraService;

    public CameraY(CameraService cameraService) {
        this.cameraService = cameraService;
    }

    public List<CameraFile> getPhotos() {
        CameraCommand command = new CameraCommand("token", 1, "file", "photo", 10);
        CameraCommandResult result = cameraService.sendCommand(command);
        return parseToFileList(result);
    }

    private List<CameraFile> parseToFileList(CameraCommandResult result) {
        return List.of(new CameraFile());
    }

    public List<CameraFileMetadata> getPhotosMetadata() {
        CameraCommand command = new CameraCommand("token", 2, "metadata", "photos");
        CameraCommandResult result = cameraService.sendCommand(command);
        return parseToMetadataList(result);
    }

    private List<CameraFileMetadata> parseToMetadataList(CameraCommandResult result) {
        return List.of(new CameraFileMetadata());
    }

    public Boolean takePhoto() {
        CameraCommand command = new CameraCommand("token", 3, "photo");
        CameraCommandResult result = cameraService.sendCommand(command);
        return parseToBoolean(result);
    }

    private Boolean parseToBoolean(CameraCommandResult result) {
        return true;
    }

    public List<CameraFile> getVideos() {
        CameraCommand command = new CameraCommand("token", 1, "file", "video", 10);
        CameraCommandResult result = cameraService.sendCommand(command);
        return parseToFileList(result);
    }

    public List<CameraFileMetadata> getVideosMetadata() {
        CameraCommand command = new CameraCommand("token", 2, "metadata", "videos");
        CameraCommandResult result = cameraService.sendCommand(command);
        return parseToMetadataList(result);
    }

    public Boolean startVideoRecording() {
        CameraCommand command = new CameraCommand("token", 4, "video");
        CameraCommandResult result = cameraService.sendCommand(command);
        return parseToBoolean(result);
    }

    public Boolean stopVideoRecording() {
        CameraCommand command = new CameraCommand("token", 5, "video");
        CameraCommandResult result = cameraService.sendCommand(command);
        return parseToBoolean(result);
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

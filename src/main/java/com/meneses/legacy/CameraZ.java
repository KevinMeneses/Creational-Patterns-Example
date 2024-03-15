package com.meneses.legacy;

import java.util.List;

public class CameraZ {
    private final CameraService cameraService;

    public CameraZ(CameraService cameraService) {
        this.cameraService = cameraService;
    }

    public CameraFile getPhoto() {
        CameraCommand command = new CameraCommand("token", 1, "file", 10);
        CameraCommandResult result = cameraService.sendCommand(command);
        return parseToFile(result);
    }

    private CameraFile parseToFile(CameraCommandResult result) {
        return new CameraFile();
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

    public CameraFile getVideo() {
        CameraCommand command = new CameraCommand("token", 1, "file", "video", 10, 3);
        CameraCommandResult result = cameraService.sendCommand(command);
        return parseToFile(result);
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

    public CameraFile getAudios() {
        CameraCommand command = new CameraCommand("token", 1, "file", "audios", 10, 3);
        CameraCommandResult result = cameraService.sendCommand(command);
        return parseToFile(result);
    }

    public List<CameraFileMetadata> getAudiosMetadata() {
        CameraCommand command = new CameraCommand("token", 2, "metadata", "audios");
        CameraCommandResult result = cameraService.sendCommand(command);
        return parseToMetadataList(result);
    }

    public Boolean startAudioRecording() {
        CameraCommand command = new CameraCommand("token", 6, "audio");
        CameraCommandResult result = cameraService.sendCommand(command);
        return parseToBoolean(result);
    }

    public Boolean stopAudioRecording() {
        CameraCommand command = new CameraCommand("token", 7, "audio");
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

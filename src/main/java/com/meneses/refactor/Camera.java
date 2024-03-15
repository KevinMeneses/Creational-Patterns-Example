package com.meneses.refactor;

import java.util.List;

public interface Camera {
    CameraFile getPhoto();
    List<CameraFileMetadata> getPhotosMetadata();
    Boolean takePhoto();
    CameraFile getVideo();
    List<CameraFileMetadata> getVideosMetadata();
    Boolean startVideoRecording();
    Boolean stopVideoRecording();
    CameraFile getAudio();
    List<CameraFileMetadata> getAudiosMetadata();
    Boolean startAudioRecording();
    Boolean stopAudioRecording();
    Boolean saveMetadata(CameraFileMetadata metadata);
}

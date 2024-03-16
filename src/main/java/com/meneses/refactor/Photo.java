package com.meneses.refactor;

import java.util.List;

public interface Photo extends Camera {
    CameraFile getPhoto();
    List<CameraFileMetadata> getPhotosMetadata();
    Boolean takePhoto();

    Boolean saveMetadata(CameraFileMetadata metadata);
}
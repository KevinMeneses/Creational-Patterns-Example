package com.meneses.refactor;

import java.util.List;

public interface Camera {
    CameraFile getPhoto();
    List<CameraFileMetadata> getPhotosMetadata();
    Boolean takePhoto();

    Boolean saveMetadata(CameraFileMetadata metadata);
}

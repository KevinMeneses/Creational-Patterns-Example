package com.meneses.refactor;

import java.util.List;

public interface Audio extends Video {

    CameraFile getAudio();
    List<CameraFileMetadata> getAudiosMetadata();
    Boolean startAudioRecording();
    Boolean stopAudioRecording();

}

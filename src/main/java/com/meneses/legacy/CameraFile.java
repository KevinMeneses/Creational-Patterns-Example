package com.meneses.legacy;

public class CameraFile {
    String name;
    String dir;
    String type;
    String creationDate;
    CameraFileMetadata metadata;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public CameraFileMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(CameraFileMetadata metadata) {
        this.metadata = metadata;
    }
}

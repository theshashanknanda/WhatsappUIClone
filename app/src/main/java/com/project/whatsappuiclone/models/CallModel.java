package com.project.whatsappuiclone.models;

import java.util.ArrayList;
import java.util.List;

public class CallModel {
    public String name;
    public int photo;
    public String isIncoming;
    public String time;
    public String dataUsed;

    public CallModel(){
    }

    public CallModel(String name, int photo, String isIncoming, String time, String dataUsed) {
        this.name = name;
        this.photo = photo;
        this.isIncoming = isIncoming;
        this.time = time;
        this.dataUsed = dataUsed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public String getIsIncoming() {
        return isIncoming;
    }

    public void setIsIncoming(String isIncoming) {
        this.isIncoming = isIncoming;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDataUsed() {
        return dataUsed;
    }

    public void setDataUsed(String dataUsed) {
        this.dataUsed = dataUsed;
    }

}

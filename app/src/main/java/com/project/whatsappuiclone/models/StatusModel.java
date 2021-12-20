package com.project.whatsappuiclone.models;

public class StatusModel {
    public String name;
    public int photo;
    public String day;

    public StatusModel(){}

    public StatusModel(String name, int photo, String day) {
        this.name = name;
        this.photo = photo;
        this.day = day;
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

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }
}

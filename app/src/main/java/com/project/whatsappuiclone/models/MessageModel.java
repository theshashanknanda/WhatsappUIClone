package com.project.whatsappuiclone.models;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

public class MessageModel implements Serializable {
    public String recieverName;
    public int recieverPhoto;
    public String day;
    public String id;
    public String text;

    public MessageModel(){}

    public MessageModel(String recieverName, int recieverPhoto, String day) {
        this.recieverName = recieverName;
        this.recieverPhoto = recieverPhoto;
        this.day = day;
    }

    public String getRecieverName() {
        return recieverName;
    }

    public void setRecieverName(String recieverName) {
        this.recieverName = recieverName;
    }

    public int getRecieverPhoto() {
        return recieverPhoto;
    }

    public void setRecieverPhoto(int recieverPhoto) {
        this.recieverPhoto = recieverPhoto;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}

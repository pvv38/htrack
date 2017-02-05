package ru.pvv38.htrack;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Index;
import org.greenrobot.greendao.annotation.NotNull;


/**
 * Created by slava on 05.02.17
 */

@Entity(indexes = {
        @Index(value = "userid, date DESC", unique = true)
})

public class LocData {
    @Id
    private Long id;

    @NotNull
    private String userid;
    private float logitude;
    private float latitude;
    private float altitude;
    private float accuracy;
    private float speed;
    private String provider;
    private java.util.Date date;

    @Generated(hash = 1820267792)
    public LocData(Long id, @NotNull String userid, float logitude, float latitude,
            float altitude, float accuracy, float speed, String provider,
            java.util.Date date) {
        this.id = id;
        this.userid = userid;
        this.logitude = logitude;
        this.latitude = latitude;
        this.altitude = altitude;
        this.accuracy = accuracy;
        this.speed = speed;
        this.provider = provider;
        this.date = date;
    }

    @Generated(hash = 2144481953)
    public LocData() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public java.util.Date getDate() {
        return date;
    }

    public void setDate(java.util.Date date) {
        this.date = date;
    }

    public String getUserid() {
        return this.userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public float getLogitude() {
        return this.logitude;
    }

    public void setLogitude(float logitude) {
        this.logitude = logitude;
    }

    public float getLatitude() {
        return this.latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public float getAltitude() {
        return this.altitude;
    }

    public void setAltitude(float altitude) {
        this.altitude = altitude;
    }

    public float getAccuracy() {
        return this.accuracy;
    }

    public void setAccuracy(float accuracy) {
        this.accuracy = accuracy;
    }

    public float getSpeed() {
        return this.speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public String getProvider() {
        return this.provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

}

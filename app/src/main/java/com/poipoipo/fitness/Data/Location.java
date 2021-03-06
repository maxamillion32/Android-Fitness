package com.poipoipo.fitness.data;

import com.google.android.gms.maps.model.LatLng;

public class Location {
    private int time;
    private float longitude;
    private float latitude;

    public void setTime(int time) {
        this.time = time;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public int getTime() {
        return time;
    }

    public float getLatitude() {
        return latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public LatLng getLatLng(){
        return new LatLng(latitude, longitude);
    }
}

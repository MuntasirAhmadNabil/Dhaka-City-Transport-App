package com.example.nabil.drawerlayout;

/**
 * Created by NABIL on 8/9/2018.
 */

public class Bus {
    private int busImage;
    private String busName;
    private String route;

    public Bus(int busImage, String busName, String route) {
        this.busImage = busImage;
        this.busName = busName;
        this.route = route;
    }

    public int getBusImage() {
        return busImage;
    }

    public String getBusName() {
        return busName;
    }

    public String getRoute() {
        return route;
    }
}

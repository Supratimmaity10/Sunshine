package com.example.weather;

public class WeatherRVModel {
    private String time;
    private String temparature;
    private  String icon;
    private  String windSpeed;

    public WeatherRVModel(String time, String temparature, String icon, String windSpeed) {
        this.time = time;
        this.temparature = temparature;
        this.icon = icon;
        this.windSpeed = windSpeed;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTemparature() {
        return temparature;
    }

    public void setTemparature(String temparature) {
        this.temparature = temparature;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(String windSpeed) {
        this.windSpeed = windSpeed;
    }
}

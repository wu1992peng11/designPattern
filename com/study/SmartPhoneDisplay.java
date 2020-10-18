package com.study;

public class SmartPhoneDisplay implements Observer{

    private WeatherStation WeatherStation;

    public SmartPhoneDisplay(WeatherStation weatherStation) {
        this.WeatherStation=weatherStation;
        WeatherStation.add(this);
    }

    @Override
    public void update() {
        System.out.println(WeatherStation.getTemperature()); 
        WeatherStation.getTemperature();
    }

}
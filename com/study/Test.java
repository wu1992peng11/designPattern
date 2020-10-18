package com.study;

public class Test {
    public static void main(String[] args) {
        WeatherStation station=new WeatherStation();
        SmartPhoneDisplay smartPhone=new SmartPhoneDisplay(station);
        SmartPhoneDisplay smartPhone1=new SmartPhoneDisplay(station);
        station.setTemperature(12.4);
    }
}

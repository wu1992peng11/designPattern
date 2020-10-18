package com.study;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject{

    public List<Observer> observers=new ArrayList<Observer>();

    private double temperature;

    @Override
    public void add(Observer observer) {
        observers.add(observer);

    }

    @Override
    public void remove(Observer observer) {
        observers.remove(observer);

    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update();
        }

    }

    public double getTemperature(){
        return this.temperature;
    }

    public void setTemperature(double temperature){
        this.temperature=temperature;
        notifyObserver();
    }
    
}

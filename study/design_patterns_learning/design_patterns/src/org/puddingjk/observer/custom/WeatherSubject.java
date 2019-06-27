package org.puddingjk.observer.custom;

import org.puddingjk.observer.custom.common.Observer;
import org.puddingjk.observer.custom.common.Subject;

import java.util.ArrayList;
import java.util.List;

public class WeatherSubject implements Subject {
    // 订阅该主题的观察者
    private List observers;
    // 温度
    private float temperatrue;
    // 湿度
    private float humidity;
    // 压力
    private float pressure;


    public WeatherSubject() {
        this.observers = new ArrayList();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int i = observers.indexOf(observer);
        if(i>=0){
            observers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        observers.forEach(obj ->{
            Observer observer =(Observer)  obj;
            observer.update(temperatrue,humidity,pressure);
        });
    }

    public void dataChange(){
        notifyObservers();
    };

    public void setNewWeatherData(float temperatrue, float humidity, float pressure) {
        this.temperatrue = temperatrue;
        this.humidity = humidity;
        this.pressure = pressure;
        dataChange();
    }
}

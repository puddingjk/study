package org.puddingjk.observer.custom;

import org.puddingjk.observer.custom.common.DisplayData;
import org.puddingjk.observer.custom.common.Observer;
import org.puddingjk.observer.custom.common.Subject;

/**
 * 观察者2
 */
public class ObserverTwo implements Observer, DisplayData {

    // 湿度
    private float humidity;
    // 压力
    private float pressure;
    // 订阅的主题
    private Subject weatherSubject;

    public ObserverTwo(Subject weatherSubject) {
        this.weatherSubject = weatherSubject;
        weatherSubject.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("观察者2：数据：温度："+humidity+"，压力:"+pressure);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.humidity=humidity;
        this.pressure=pressure;
        display();
    }
}

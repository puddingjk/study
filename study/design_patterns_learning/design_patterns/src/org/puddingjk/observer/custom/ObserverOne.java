package org.puddingjk.observer.custom;

import org.puddingjk.observer.custom.common.DisplayData;
import org.puddingjk.observer.custom.common.Observer;
import org.puddingjk.observer.custom.common.Subject;

/**
 * 观察者2
 */
public class ObserverOne implements Observer, DisplayData {
    // 温度
    private float temperatrue;
    // 湿度
    private float humidity;

    private Subject weatherSubject;

    public ObserverOne(Subject weatherSubject) {
        this.weatherSubject = weatherSubject;
        weatherSubject.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperatrue=temp;
        this.humidity=humidity;
        display();
    }

    @Override
    public void display() {
        //显示当前检测值
        System.out.println("观察者1：数据：温度："+temperatrue+"，湿度:"+humidity);
    }

}

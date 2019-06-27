package org.puddingjk.observer.custom;

import org.puddingjk.observer.custom.common.Observer;
import org.puddingjk.observer.custom.common.Subject;

import java.util.ArrayList;
import java.util.List;

public class NewsSubject implements Subject {
    // 订阅主题的观察者列表
    private List observers;

    public NewsSubject() {
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

    }
}

package org.puddingjk.observer.custom.main;

import org.puddingjk.observer.custom.ObserverOne;
import org.puddingjk.observer.custom.ObserverTwo;
import org.puddingjk.observer.custom.WeatherSubject;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;
import java.util.concurrent.TimeUnit;

public class Main {

   private static ThreadMXBean threadMXBeana = ManagementFactory.getThreadMXBean();

    public static void main(String[] args) throws InterruptedException {


        //        // 开启主题
        WeatherSubject subject = new WeatherSubject();
        // 新建2个布告板
        ObserverOne one = new ObserverOne(subject);
        ObserverTwo two = new ObserverTwo(subject);
        subject.setNewWeatherData(80, 65, 20.5f);
        Thread.sleep(5000);
        subject.setNewWeatherData(40, 25, 11.5f);
        Thread.sleep(5000);
        subject.setNewWeatherData(50, 35, 27.5f);
    }
}

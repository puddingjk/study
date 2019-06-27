package org.puddingjk.observer.custom.common;

/**
 * 观察者接口
 */
public interface Observer {

    /**
     * 更新观察者数据
     * @param temp     温度
     * @param humidity 湿度
     * @param pressure 压力
     */
    void update(float temp,float humidity,float pressure);
}

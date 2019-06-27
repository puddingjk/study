package org.puddingjk.decorator.parent;

/**
 * 饮料抽象类
 */
public abstract class Drinks {
    // 饮料介绍
    public  String  description ="Unknow";

    public String getDescription() {
        return description;
    }

    public abstract double price();
}

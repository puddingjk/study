package org.puddingjk.decorator;

import org.puddingjk.decorator.condiment.Coconut;
import org.puddingjk.decorator.condiment.Milk;
import org.puddingjk.decorator.drinktype.Orange;
import org.puddingjk.decorator.parent.Drinks;

/**
 * 模拟购买饮料 同时添加不同调料
 */
public class Main {

    public static void main(String[] args) {
        // 购买饮料
        Drinks og  = new Orange();
        // 添加调料
        og = new Milk(og);
        og = new Coconut(og);
        System.out.println(og.getDescription()+" ,$"+og.price());
    }
}

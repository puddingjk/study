package org.puddingjk.factory.product;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    // 面团类型
    String name;
    // 蘸料类型
    String dough;
    // 佐料
    String sauce;

    List toppings = new ArrayList();

    // 制作
    void prepare() {
        System.out.println("准备："+name);
        System.out.println("撒："+dough);
        System.out.println("添加："+sauce);
        for (int i = 0; i < toppings.size(); i++) {
            System.out.println("    "+toppings.get(i));
        }
    }

    // 烘烤
    void bake(){
        System.out.println("bake 25min");
    };
    // 切片
    void cut(){
        System.out.println("cut 25min");
    };
    // 装箱/盒
    void box(){
        System.out.println("box 25min");
    };
}

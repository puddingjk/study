package org.puddingjk.factory.product.typedetail;

import org.puddingjk.factory.product.Pizza;

public class CheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("开始制作.....");
    }

    @Override
    public void bake() {
        System.out.println("开始烘烤.....");
    }

    @Override
    public void cut() {
        System.out.println("开始切片.....");
    }

    @Override
    public void box() {
        System.out.println("开始装盒");
    }
}

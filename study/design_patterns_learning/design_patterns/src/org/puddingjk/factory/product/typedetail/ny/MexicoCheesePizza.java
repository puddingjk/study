package org.puddingjk.factory.product.typedetail.ny;

import org.puddingjk.factory.product.Pizza;

public class MexicoCheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Mexico开始制作.....");
    }

    @Override
    public void bake() {
        System.out.println("Mexico开始烘烤.....");
    }

    @Override
    public void cut() {
        System.out.println("Mexico开始切片.....");
    }

    @Override
    public void box() {
        System.out.println("Mexico开始装盒");
    }
}

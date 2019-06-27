package org.puddingjk.decorator.drinktype;

import org.puddingjk.decorator.parent.Drinks;

/**
 * 苹果口味饮料
 */
public class Apple extends Drinks {

    public Apple() {
        description ="apple";
    }

    @Override
    public double price() {
        return 3.4;
    }
}

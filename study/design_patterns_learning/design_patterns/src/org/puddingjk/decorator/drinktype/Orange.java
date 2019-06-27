package org.puddingjk.decorator.drinktype;

import org.puddingjk.decorator.parent.Drinks;

/**
 * 橙子口味饮料
 */
public class Orange extends Drinks {

    @Override
    public double price() {
        return 1.2;
    }

    public Orange() {
        description ="orange";
    }
}

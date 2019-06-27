package org.puddingjk.decorator.condiment;

import org.puddingjk.decorator.parent.Condiment;
import org.puddingjk.decorator.parent.Drinks;

public class Milk extends Condiment {
    Drinks drinks;

    public Milk(Drinks drinks) {
        this.drinks = drinks;
    }

    @Override
    public String getDescription() {
        return drinks.getDescription()+" ,牛奶";
    }

    @Override
    public double price() {
        return 4.5+drinks.price();
    }
}

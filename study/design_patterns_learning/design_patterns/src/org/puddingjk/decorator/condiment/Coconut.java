package org.puddingjk.decorator.condiment;

import org.puddingjk.decorator.parent.Condiment;
import org.puddingjk.decorator.parent.Drinks;

public class Coconut extends Condiment {
    Drinks drinks;

    public Coconut(Drinks drinks) {
        this.drinks = drinks;
    }

    @Override
    public String getDescription() {
        return drinks.getDescription()+" ,椰果";
    }

    @Override
    public double price() {
        return 3.0+drinks.price();
    }
}

package org.puddingjk.factory.custom.space;

import org.puddingjk.factory.custom.PizzaStore;
import org.puddingjk.factory.product.Pizza;
import org.puddingjk.factory.product.typedetail.ny.NYCheesePizza;

public class MexicoPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new NYCheesePizza();
        } else {

        }
        return pizza;
    }
}

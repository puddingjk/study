package org.puddingjk.factory.factory;

import org.puddingjk.factory.product.Pizza;
import org.puddingjk.factory.product.typedetail.CheesePizza;

public class SimplePizzaFactory {
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else {

        }
        return pizza;
    }
}

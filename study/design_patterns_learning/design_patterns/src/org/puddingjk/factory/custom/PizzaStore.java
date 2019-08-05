package org.puddingjk.factory.custom;

import org.puddingjk.factory.factory.SimplePizzaFactory;
import org.puddingjk.factory.product.Pizza;
import org.puddingjk.factory.product.typedetail.CheesePizza;

/**
 * 披萨店
 */
public abstract class PizzaStore {

    public final Pizza orderPizza(String type){
        Pizza pizza = createPizza(type);
//        pizza.prepare();
//        pizza.bake();
//        pizza.cut();
//        pizza.box();
        return  pizza;
    }

   protected abstract Pizza createPizza(String type);
}

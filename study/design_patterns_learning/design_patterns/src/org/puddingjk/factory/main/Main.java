package org.puddingjk.factory.main;

import org.puddingjk.factory.custom.PizzaStore;
import org.puddingjk.factory.custom.space.NYPizzaStore;
import org.puddingjk.factory.factory.SimplePizzaFactory;
import org.puddingjk.factory.product.Pizza;

public class Main {
    public static void main(String[] args) {
//        PizzaStore pizzaStore = new PizzaStore(new SimplePizzaFactory());
//        Pizza pizza = pizzaStore.orderPizza("cheese");
//        System.out.println(pizza);
        PizzaStore ny = new NYPizzaStore();
        Pizza pizza = ny.orderPizza("cheese");
        System.out.println(pizza);
    }
}

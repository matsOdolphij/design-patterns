package com.research.katas.cupcake.toppings;

import com.research.katas.cupcake.Food;
import com.research.katas.cupcake.ToppingDecorator;

public class ChocolateTopping extends ToppingDecorator {

    public ChocolateTopping(final Food food) {
        super(food);
    }

    @Override
    public String getName() {
        return super.getName() + " with Chocolate";
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.10; // adds some costs for the chocolate. This is a special chocolate which is really cheap
    }

}


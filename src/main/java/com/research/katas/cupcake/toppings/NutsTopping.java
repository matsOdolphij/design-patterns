package com.research.katas.cupcake.toppings;

import com.research.katas.cupcake.Food;
import com.research.katas.cupcake.ToppingDecorator;

public class NutsTopping extends ToppingDecorator {

    public NutsTopping(final Food food) {
        super(food);
    }

    @Override
    public String getName() {
        return super.getName() + " with nuts";
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.20; // adds 20 cents for nuts which is nuts
    }
}

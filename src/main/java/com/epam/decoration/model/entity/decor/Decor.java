package com.epam.decoration.model.entity.decor;


import com.epam.decoration.model.entity.enums.DecorateOrigin;

public class Decor {
    private int weight;
    private int cost;
    private int transparency;
    private DecorateOrigin origin;

    public int getWeight() {
        return weight;
    }

    public int getCost() {
        return cost;
    }

    public int getTransparency() {
        return transparency;
    }

    public DecorateOrigin getOrigin() {
        return origin;
    }
}

package com.epam.decoration.model.entity.decor;


import com.epam.decoration.model.entity.enums.DecorateOrigin;

import java.util.Objects;

public class Decor {
    private double weight;
    private double cost;
    private double transparency;
    private DecorateOrigin origin;

    public double getWeight() {
        return weight;
    }

    public double getCost() {
        return cost;
    }

    public double getTransparency() {
        return transparency;
    }

    public DecorateOrigin getOrigin() {
        return origin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Decor decor = (Decor) o;
        return Double.compare(decor.weight, weight) == 0 &&
                Double.compare(decor.cost, cost) == 0 &&
                Double.compare(decor.transparency, transparency) == 0 &&
                origin == decor.origin;
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight, cost, transparency, origin);
    }

    @Override
    public String toString() {
        return "Decor{" +
                "weight=" + weight +
                ", cost=" + cost +
                ", transparency=" + transparency +
                ", origin=" + origin +
                '}';
    }
}

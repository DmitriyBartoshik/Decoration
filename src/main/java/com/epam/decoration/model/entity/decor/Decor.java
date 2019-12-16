package com.epam.decoration.model.entity.decor;

import com.epam.decoration.model.entity.enums.DecorateOrigin;

import java.util.Objects;

public class Decor {
    private int weight;
    private int cost;
    private int transparency;
    private DecorateOrigin origin;

    public Decor(int weight, int cost, int transparency, DecorateOrigin origin) {
        this.weight = weight;
        this.cost = cost;
        this.transparency = transparency;
        this.origin = origin;
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Decor decor = (Decor) o;
        return weight == decor.weight &&
                cost == decor.cost &&
                transparency == decor.transparency &&
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

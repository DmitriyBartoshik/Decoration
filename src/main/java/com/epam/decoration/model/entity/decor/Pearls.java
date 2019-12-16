package com.epam.decoration.model.entity.decor;

import com.epam.decoration.model.entity.enums.DecorateOrigin;
import com.epam.decoration.model.entity.enums.PearlsType;

public class Pearls extends Decor {
    private final PearlsType pearlsType;

    public Pearls(int weight, int cost,
                  int transparency, DecorateOrigin origin, PearlsType pearlsType) {
        super(weight,cost,transparency,origin);
        this.pearlsType = pearlsType;
    }

    public PearlsType getPearlsType() {
        return pearlsType;
    }
}

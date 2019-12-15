package com.epam.decoration.model.entity.decor;

import com.epam.decoration.model.entity.enums.PearlsType;

public class Pearls extends Decor {
    private final PearlsType pearlsType;

    public Pearls(PearlsType pearlsType) {
        this.pearlsType = pearlsType;
    }
}

package com.epam.decoration.model.decor;

import com.epam.decoration.model.enums.PearlsType;

public class Pearls extends Decor {
    private final PearlsType pearlsType;

    public Pearls(PearlsType pearlsType) {
        this.pearlsType = pearlsType;
    }
}

package com.epam.decoration.model.decor;

import com.epam.decoration.model.enums.AmberType;

public class Amber extends Decor {
    private final AmberType amberType;

    public Amber(AmberType amberType) {
        this.amberType = amberType;
    }
}

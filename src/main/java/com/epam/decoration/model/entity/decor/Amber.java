package com.epam.decoration.model.entity.decor;

import com.epam.decoration.model.entity.enums.AmberType;

public class Amber extends Decor {
    private final AmberType amberType;

    public Amber(AmberType amberType) {
        this.amberType = amberType;
    }
}

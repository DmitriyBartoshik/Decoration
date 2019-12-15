package com.epam.decoration.model.decor;

import com.epam.decoration.model.enums.StoneType;

public class Stone extends Decor {
    private final StoneType stoneType;

    public Stone(StoneType stoneType) {
        this.stoneType = stoneType;
    }
}

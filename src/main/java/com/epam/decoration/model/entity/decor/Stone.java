package com.epam.decoration.model.entity.decor;

import com.epam.decoration.model.entity.enums.DecorateOrigin;
import com.epam.decoration.model.entity.enums.StoneType;

public class Stone extends Decor {
    private final StoneType stoneType;

    public Stone(int weight, int cost,
                 int transparency, DecorateOrigin origin, StoneType stoneType) {
        super(weight, cost, transparency, origin);
        this.stoneType = stoneType;
    }

    public StoneType getStoneType() {
        return stoneType;
    }
}

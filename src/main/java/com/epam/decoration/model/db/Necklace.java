package com.epam.decoration.model.db;

import com.epam.decoration.model.entity.decor.Decor;
import com.epam.decoration.model.service.gson.DecorJsonService;

import java.util.List;

public class Necklace {
    private List<Decor> decors;

    public Necklace() {
    }

    public Necklace(List<Decor> decors) {
        this.decors = decors;
    }

    public List<Decor> getDecors() {
        if (decors == null) {
            decors = DecorJsonService.fromJson("data.txt");
        }
        return decors;
    }

    public void loadDecorsFromFile(String file) {
        decors = DecorJsonService.fromJson(file);
    }
}

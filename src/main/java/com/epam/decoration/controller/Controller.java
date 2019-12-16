package com.epam.decoration.controller;

import com.epam.decoration.model.db.Necklace;
import com.epam.decoration.model.entity.decor.Decor;
import com.epam.decoration.model.entity.decor.Stone;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Controller {
    private Necklace necklace;

    public Controller(Necklace necklace) {
        this.necklace = necklace;
    }

    public Necklace getNecklace() {
        return necklace;
    }

    public int weightCalculate() {
        return necklace.getDecors()
                .stream()
                .mapToInt(Decor::getWeight).sum();
    }

    public int costCalculate() {
        return necklace.getDecors()
                .stream()
                .mapToInt(Decor::getCost).sum();
    }

    public List<Decor> sortedDecorByTransparency() {
        necklace.getDecors().sort(Comparator.comparing(Decor::getTransparency));
        return necklace.getDecors();
    }

    public List<Decor> sortedDecorByCostByTransparency() {
        necklace.getDecors().sort(Comparator.comparing(Decor::getCost)
                .thenComparing(Decor::getTransparency));
        return necklace.getDecors();
    }

    public List<Decor> findStoneByTransparency(int min, int max) {
        return necklace.getDecors().stream()
                .filter(decor -> decor instanceof Stone)
                .filter(decor -> decor.getTransparency() >= min && decor.getTransparency() <= max)
                .collect(Collectors.toList());
    }
}

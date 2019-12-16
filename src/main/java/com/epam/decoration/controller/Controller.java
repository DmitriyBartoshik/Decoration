package com.epam.decoration.controller;

import com.epam.decoration.model.entity.decor.Decor;
import com.epam.decoration.model.entity.decor.Stone;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Controller {
    private List<Decor> decors;

    public Controller(List<Decor> decors) {
        this.decors = decors;
    }

    public void print() {
        System.out.println(decors.size());
    }

    public double weightCalculate() {
        return decors
                .stream()
                .mapToDouble(Decor::getWeight).sum();
    }

    public double costCalculate() {
        return decors
                .stream()
                .mapToDouble(Decor::getCost).sum();
    }

    public List<Decor> sortedDecorByTransparency() {
        decors.sort(Comparator.comparing(Decor::getTransparency));
        return decors;
    }

    public List<Decor> sortedDecorByCostByTransparency() {
        decors.sort(Comparator.comparing(Decor::getCost)
                .thenComparing(Decor::getTransparency));
        return decors;
    }

    public List<Decor> findStoneByTransparency(double min, double max) {
        return decors.stream()
                .filter(decor -> decor instanceof Stone)
                .filter(decor -> decor.getTransparency() >= min && decor.getTransparency() <= max)
                .collect(Collectors.toList());
    }
}

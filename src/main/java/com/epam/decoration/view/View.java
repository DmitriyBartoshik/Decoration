package com.epam.decoration.view;

import com.epam.decoration.controller.Controller;
import com.epam.decoration.model.entity.decor.Decor;

import java.util.List;

public class View {
    private Controller controller;

    public View(Controller controller) {
        this.controller = controller;
    }

    public void weightCalculate() {
        double weight = controller.weightCalculate();
        printValue("necklace weight", weight);
    }

    public void costCalculate() {
        double cost = controller.costCalculate();
        printValue("necklace cost", cost);
    }

    public void sortedDecorByTransparency() {
        List<Decor> decors = controller.sortedDecorByTransparency();
        printDecors(decors);
    }

    public void sortedDecorByCostByTransparency() {
        List<Decor> decors = controller.sortedDecorByCostByTransparency();
        printDecors(decors);
    }

    public void findStoneByTransparency(double min, double max) {
        List<Decor> stones = controller.findStoneByTransparency(min, max);
        printDecors(stones);
    }

    private void printValue(String message, double value) {
        System.out.println(message + " " + value);
    }

    private void printDecors(List<Decor> decors) {
        for (Decor decor : decors) {
            System.out.println(decor);
        }
    }
}

package com.epam.decoration;

import com.epam.decoration.controller.Controller;
import com.epam.decoration.model.db.Necklace;
import com.epam.decoration.view.View;

public class App {

    /**
     * Program entry point
     *
     * @param args command line args
     */
    public static void main(String[] args) {

        /**
         * Create Necklace
         */
        Necklace necklace = new Necklace();
        necklace.loadDecorsFromFile("data.txt");

        /**
         * Create controller
         */
        Controller controller = new Controller(necklace);

        /**Create view
         *
         */
        View view = new View(controller);

        view.weightCalculate();
        view.costCalculate();
        view.sortedDecorByTransparency();
        view.sortedDecorByCostByTransparency();
        view.findStoneByTransparency(53, 75);
    }
}

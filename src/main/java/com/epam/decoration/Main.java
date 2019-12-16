package com.epam.decoration;

import com.epam.decoration.controller.Controller;
import com.epam.decoration.model.db.Necklace;
import com.epam.decoration.view.View;

public class Main {
    public static void main(String[] args) {
        Necklace necklace = new Necklace();
        necklace.loadDecorsFromFile("data.txt");
        Controller controller = new Controller(necklace.getDecors());
        View view = new View(controller);

      view.weightCalculate();
      view.costCalculate();
      view.sortedDecorByTransparency();
      view.sortedDecorByCostByTransparency();
      view.findStoneByTransparency(1,25);

    }
}

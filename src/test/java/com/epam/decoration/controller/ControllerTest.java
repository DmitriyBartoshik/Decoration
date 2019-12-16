package com.epam.decoration.controller;

import com.epam.decoration.model.db.Necklace;
import com.epam.decoration.model.entity.decor.Amber;
import com.epam.decoration.model.entity.decor.Decor;
import com.epam.decoration.model.entity.decor.Pearls;
import com.epam.decoration.model.entity.decor.Stone;
import com.epam.decoration.model.entity.enums.AmberType;
import com.epam.decoration.model.entity.enums.DecorateOrigin;
import com.epam.decoration.model.entity.enums.PearlsType;
import com.epam.decoration.model.entity.enums.StoneType;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ControllerTest {
    private Necklace necklace;
    private Controller controller;

    @Before
    public void setUp() throws Exception {
        List<Decor> decors = new ArrayList<>();
        decors.add(new Stone(22, 45, 73, DecorateOrigin.NATURAL, StoneType.DIAMOND));
        decors.add(new Stone(21, 42, 65, DecorateOrigin.NATURAL, StoneType.EMERALD));
        decors.add(new Stone(34, 12, 35, DecorateOrigin.SYNTHETIC, StoneType.RUBY));

        decors.add(new Amber(19, 35, 61, DecorateOrigin.SYNTHETIC, AmberType.BAKERITE));
        decors.add(new Amber(24, 209, 76, DecorateOrigin.NATURAL, AmberType.HEDANITE));
        decors.add(new Amber(38, 35, 84, DecorateOrigin.SYNTHETIC, AmberType.HESSITE));

        decors.add(new Pearls(17, 35, 63, DecorateOrigin.SYNTHETIC, PearlsType.BAROQUE));
        decors.add(new Pearls(28, 57, 87, DecorateOrigin.NATURAL, PearlsType.BLISTER));
        decors.add(new Pearls(32, 85, 94, DecorateOrigin.SYNTHETIC, PearlsType.SOUFFLE));

        necklace = new Necklace(decors);
        controller = new Controller(necklace);
    }

    @Test
    public void weightCalculate() {
        assertEquals(235, controller.weightCalculate());
    }

    @Test
    public void costCalculate() {
        assertEquals(555, controller.costCalculate());
    }

    @Test
    public void sortedDecorByTransparency() {
        controller.sortedDecorByTransparency();
        assertEquals(35, controller.getNecklace().getDecors().get(0).getTransparency());
        assertEquals(61, controller.getNecklace().getDecors().get(1).getTransparency());
        assertEquals(63, controller.getNecklace().getDecors().get(2).getTransparency());
        assertEquals(65, controller.getNecklace().getDecors().get(3).getTransparency());
        assertEquals(73, controller.getNecklace().getDecors().get(4).getTransparency());
        assertEquals(76, controller.getNecklace().getDecors().get(5).getTransparency());
        assertEquals(84, controller.getNecklace().getDecors().get(6).getTransparency());
        assertEquals(87, controller.getNecklace().getDecors().get(7).getTransparency());
        assertEquals(94, controller.getNecklace().getDecors().get(8).getTransparency());
    }

    @Test
    public void sortedDecorByCostByTransparency() {
        controller.sortedDecorByCostByTransparency();
        assertEquals(35, controller.getNecklace().getDecors().get(1).getCost());
        assertEquals(35, controller.getNecklace().getDecors().get(2).getCost());
        assertEquals(35, controller.getNecklace().getDecors().get(3).getCost());

        assertEquals(61, controller.getNecklace().getDecors().get(1).getTransparency());
        assertEquals(63, controller.getNecklace().getDecors().get(2).getTransparency());
        assertEquals(84, controller.getNecklace().getDecors().get(3).getTransparency());
    }

    @Test
    public void findStoneByTransparency() {
        List<Decor> stones = controller.findStoneByTransparency(35, 65);
        assertEquals(2, stones.size());
    }
}
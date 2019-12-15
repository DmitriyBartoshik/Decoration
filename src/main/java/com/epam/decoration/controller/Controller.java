package com.epam.decoration.controller;

import com.epam.decoration.model.db.Necklace;
import com.epam.decoration.model.entity.decor.Decor;

import java.util.List;

public class Controller {
    private List<Decor> decors = Necklace.getDecors();

}

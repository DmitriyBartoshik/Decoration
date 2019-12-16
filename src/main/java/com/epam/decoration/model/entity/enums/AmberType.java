package com.epam.decoration.model.entity.enums;

public enum AmberType {
    HEDANITE("hedanite"), HESSITE("hessite"), BAKERITE("bakerite");
    private String title;

    AmberType(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
    }

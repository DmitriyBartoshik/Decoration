package com.epam.decoration.model.entity.enums;

public enum DecorateOrigin {
    SYNTHETIC("synthetic"), NATURAL("natural");

    private String title;

    DecorateOrigin(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}

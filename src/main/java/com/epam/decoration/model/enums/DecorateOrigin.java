package com.epam.decoration.model.enums;

public enum DecorateOrigin {
    SYNTHETIC("synthetic"), NATURAL("natural");

    private String title;

    DecorateOrigin(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}

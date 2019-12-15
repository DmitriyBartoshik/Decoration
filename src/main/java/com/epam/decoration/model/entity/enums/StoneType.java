package com.epam.decoration.model.entity.enums;

public enum StoneType {
    EMERALD("emerald"), DIAMOND("diamond"), RUBY("ruby");
    private String title;

    StoneType(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}

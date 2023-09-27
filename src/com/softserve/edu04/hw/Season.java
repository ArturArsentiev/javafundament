package com.softserve.edu04.hw;

public enum Season {
    WINTER("Winter"), SPRING("Spring"), SUMMER("Summer"), AUTUMN("Autumn");

    final String name;

    Season(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

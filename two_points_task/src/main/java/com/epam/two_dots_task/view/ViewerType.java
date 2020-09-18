package com.epam.two_dots_task.view;

public enum ViewerType {
    CONSOLE("Console"), FILE("File"), LOGGER("Logger");

    private final String name;

    ViewerType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

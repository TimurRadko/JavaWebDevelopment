package com.epam.two_dots_task.data;

public enum DataStorageType {
    ENTITY("Entity"), DB("DB"), FILE("File");

    private final String name;

    DataStorageType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

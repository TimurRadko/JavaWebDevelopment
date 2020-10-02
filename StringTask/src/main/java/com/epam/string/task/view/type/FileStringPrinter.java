package com.epam.string.task.view.type;

import com.epam.string.task.exception.DataException;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileStringPrinter implements StringPrinter {
    private final String filename;

    public FileStringPrinter(String filename) {
        this.filename = filename;
    }

    public void print(String result) throws DataException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write(result);
        } catch (IOException e) {
            throw new DataException("File not found", e);
        }
    }
}

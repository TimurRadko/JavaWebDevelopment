package com.epam.string.task.data.acquirer.type;

import com.epam.string.task.exception.DataException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileDataAcquirer implements DataAcquirer {
    private final String filename;

    public FileDataAcquirer(String filename) {
        this.filename = filename;
    }

    public String getData() throws DataException {
        StringBuilder builder = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                builder.append(line);
            }
        } catch (IOException e) {
            throw new DataException("File not found.", e);
        }
        return builder.toString();
    }
}

package com.epam.string.task.data.acquirer.type;

import com.epam.string.task.exception.DataException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleDataAcquirer implements DataAcquirer {

    public String getData() throws DataException {
        System.out.println("Enter the string:");
        StringBuilder builder = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            do {
                line = reader.readLine();
            } while (reader.ready());
            builder.append(line);
        } catch (IOException e) {
            throw new DataException("Data Exception", e.getCause());
        }
        return builder.toString();
    }
}

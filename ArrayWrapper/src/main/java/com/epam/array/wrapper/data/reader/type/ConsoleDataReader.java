package com.epam.array.wrapper.data.reader.type;

import com.epam.array.wrapper.exception.DataException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ConsoleDataReader implements DataReadable {

    public int[] read() throws DataException {
        String stringNumber;
        List<Integer> filledList = new ArrayList<>();
        System.out.println("Please, enter the number (in the end enter keyword \"exit\"):");
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            while (!(stringNumber = reader.readLine()).toLowerCase().equals("exit")) {
                int number = Integer.parseInt(stringNumber);
                filledList.add(number);
            }
        } catch (IOException e) {
            throw new DataException("You enter invalid data. Cause of exception is ", e.getCause());
        }
        return convertListToArray(filledList);
    }

    private int[] convertListToArray(List<Integer> list) {
        int[] convertingArray = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            int number = list.get(i);
            convertingArray[i] = number;
        }
        return convertingArray;
    }
}

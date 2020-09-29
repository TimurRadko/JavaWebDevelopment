package com.epam.array.wrapper.logic;

import com.epam.array.wrapper.data.entity.ArrayWrapper;
import com.epam.array.wrapper.data.entity.ArrayWrapperImpl;


public class ArrayCalculator {

    public void quickSort(ArrayWrapper arrayWrapper) {
        int[] source = unpackArray(arrayWrapper);
        quickSortArrayLayer(source, 0, source.length - 1);
        setValuesInWrapperArray(arrayWrapper, source);
    }

    private void quickSortArrayLayer(int[] source, int leftBorder, int rightBorder) {
        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        int pivot = source[(leftMarker + rightMarker) / 2];

        do {
            while (source[leftMarker] < pivot) {
                leftMarker++;
            }
            while (source[rightMarker] > pivot) {
                rightMarker--;
            }
            if (leftMarker <= rightMarker) {
                if (leftMarker < rightMarker) {
                    int tmp = source[leftMarker];
                    source[leftMarker] = source[rightMarker];
                    source[rightMarker] = tmp;
                }
                leftMarker++;
                rightMarker--;
            }
        } while (leftMarker <= rightMarker);

        if (leftMarker < rightBorder) {
            quickSortArrayLayer(source, leftMarker, rightBorder);
        }
        if (leftBorder < rightMarker) {
            quickSortArrayLayer(source, leftBorder, rightMarker);
        }
    }

    private int[] unpackArray(ArrayWrapper arrayWrapper) {
        int arrayLength = arrayWrapper.getSizeArrayWrapper();
        int[] unpackingArray = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            unpackingArray[i] = arrayWrapper.getValue(i);
        }
        return unpackingArray;
    }

    private void setValuesInWrapperArray(ArrayWrapper arrayWrapper, int[] source) {
        for (int i = 0; i < source.length; i++) {
            arrayWrapper.setValue(i, source[i]);
        }
    }


    public ArrayWrapper findFibonacciNumberInArray(ArrayWrapper arrayWrapper) {
        int[] source = unpackArray(arrayWrapper);
        int creatingArrayLength = findCreatingArrayLength(source);
        int[] creatingArray = new int[creatingArrayLength];
        int creatingArrayIndex = 0;
        for (int value : source) {
            if (isFibonacci(value)) {
                creatingArray[creatingArrayIndex] = value;
                creatingArrayIndex++;
            }
        }
        return new ArrayWrapperImpl(creatingArray);
    }

    private int findCreatingArrayLength(int[] source) {
        int creatingArrayLength = 0;
        for (int value : source) {
            if (isFibonacci(value)) {
                creatingArrayLength++;
            }
        }
        return creatingArrayLength;
    }

    private boolean isFibonacci(int number) {
        double firstBoardValue = 5 * number * number - 4;
        double secondBoardValue = 5 * number * number + 4;
        double firstSquare = (long) Math.sqrt(firstBoardValue);
        double secondSquare = (long) Math.sqrt(secondBoardValue);
        return (firstSquare * firstSquare == firstBoardValue) ||
                (secondSquare * secondSquare == secondBoardValue);
    }
}

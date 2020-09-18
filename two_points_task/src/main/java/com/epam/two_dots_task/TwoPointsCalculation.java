package com.epam.two_dots_task;

import com.epam.two_dots_task.data.DataStorage;
import com.epam.two_dots_task.data.data_storage_type.EntityDataStorage;
import com.epam.two_dots_task.data.entity.Point;
import com.epam.two_dots_task.data.entity.PointFactory;
import com.epam.two_dots_task.logic.Calculator;
import com.epam.two_dots_task.view.SolveViewer;
import com.epam.two_dots_task.view.type.ConsoleSolveViewer;

public class TwoPointsCalculation {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        DataStorage dataStorage = new EntityDataStorage();
        SolveViewer solveViewer = new ConsoleSolveViewer();

        PointFactory pointFactory = dataStorage.getPointFactory();

        dataStorage.receivingPoint(pointFactory.createPoint());
        dataStorage.receivingPoint(pointFactory.createPoint());

        Point answerPoint = calculator.findingCloserToOriginPoint(dataStorage.getPoints());

        solveViewer.printAnswer(answerPoint);
    }
}

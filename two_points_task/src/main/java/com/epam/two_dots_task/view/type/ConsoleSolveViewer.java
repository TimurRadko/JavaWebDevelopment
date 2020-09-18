package com.epam.two_dots_task.view.type;

import com.epam.two_dots_task.data.entity.Point;
import com.epam.two_dots_task.view.AbstractSolveViewer;

public class ConsoleSolveViewer extends AbstractSolveViewer {

    @Override
    public void printAnswer(Point point) {
        System.out.printf("This %s is closer than another to origin.%n", point);
    }
}

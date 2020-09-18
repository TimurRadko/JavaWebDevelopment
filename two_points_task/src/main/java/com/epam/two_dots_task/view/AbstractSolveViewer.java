package com.epam.two_dots_task.view;

import com.epam.two_dots_task.data.entity.Point;
import com.epam.two_dots_task.view.type.ConsoleSolveViewer;
import com.epam.two_dots_task.view.type.FileSolveViewer;
import com.epam.two_dots_task.view.type.LoggerSolveViewer;

public abstract class AbstractSolveViewer implements SolveViewer {

    public abstract void printAnswer(Point point);

    @Override
    public SolveViewer createSolveViewer(ViewerType viewerType) {

        switch (viewerType) {
            case CONSOLE:
                return new ConsoleSolveViewer();
            case FILE:
                return new FileSolveViewer();
            case LOGGER:
                return new LoggerSolveViewer();
            default:
                return null;
        }
    }
}

package com.epam.two_dots_task.view;

import com.epam.two_dots_task.data.entity.Point;

public interface SolveViewer {
    SolveViewer createSolveViewer(ViewerType viewerType);
    void printAnswer(Point point);
}

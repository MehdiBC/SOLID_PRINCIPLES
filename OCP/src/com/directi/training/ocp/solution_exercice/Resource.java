package com.directi.training.ocp.solution_exercice;

public interface Resource {
    void markFree(int resourceId);
    void markBusy(int resourceId);
    int findFree();
}

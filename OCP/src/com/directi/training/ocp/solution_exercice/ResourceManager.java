package com.directi.training.ocp.solution_exercice;

public interface ResourceManager {
    void markFree(int resourceId);
    void markBusy(int resourceId);
    int findFree();
}

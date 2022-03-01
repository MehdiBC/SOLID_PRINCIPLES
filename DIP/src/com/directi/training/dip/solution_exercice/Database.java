package com.directi.training.dip.solution_exercice;

// This interface is to make the code be agnostic to the type of the database
public interface Database {
    int write(String inputString);

    // all other queries
}

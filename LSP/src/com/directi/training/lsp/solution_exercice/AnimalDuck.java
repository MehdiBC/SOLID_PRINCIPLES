package com.directi.training.lsp.solution_exercice;

public class AnimalDuck implements Duck{
    @Override
    public void quack() throws DuckException {
        System.out.println("Quack...");
    }

    @Override
    public void swim() throws DuckException {
        System.out.println("Swim...");
    }
}

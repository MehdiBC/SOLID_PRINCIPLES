package com.directi.training.dip.solution_exercice;

public class MyDatabaseWriter implements IWriter
{
    @Override
    public void write(String input)
    {
        MyDatabase database = new MyDatabase();
        database.write(input);
    }
}

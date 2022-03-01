package com.directi.training.dip.solution_exercice;

public class MyDatabaseWriter implements IWriter {
    private final Database _database;

    public MyDatabaseWriter(Database database) {
        this._database = database;
    }

    @Override
    public void write(String input) {
        this._database.write(input);
    }
}

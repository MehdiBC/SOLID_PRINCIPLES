package com.directi.training.dip.solution_exercice;

import java.util.HashMap;
import java.util.Map;

public class MyDatabase implements Database{
    private final Map<Integer, String> _data = new HashMap<>();
    private int _id = 0;

    @Override
    public int write(String inputString) {
        this._data.put(++this._id, inputString);
        return this._id;
    }
}

package com.directi.training.dip.solution_exercice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MyFileReader implements IReader
{
    private final String _fileName;

    public MyFileReader(String fileName)
    {
        this._fileName = fileName;
    }

    @Override
    public String read() throws IOException
    {
        StringBuilder lines = new StringBuilder();
        BufferedReader reader = new BufferedReader(new FileReader(_fileName));
        String aLine;
        while ((aLine = reader.readLine()) != null) {
            lines.append(aLine);
        }
        reader.close();
        return lines.toString();
    }
}

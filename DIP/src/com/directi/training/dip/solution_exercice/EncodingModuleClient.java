package com.directi.training.dip.solution_exercice;

import java.io.IOException;

public class EncodingModuleClient
{
    final static String BEFORE_ENCODE_FILE = "DIP/resources/beforeEncoding.txt";
    final static String AFTER_ENCODE_FILE = "DIP/resources/afterEncoding.txt";
    public static void main(String[] args) throws IOException
    {
        EncodingModule encodingModule = new EncodingModule();

        IReader reader = new MyFileReader(BEFORE_ENCODE_FILE);
        IWriter writer = new MyFileWriter(AFTER_ENCODE_FILE);
        encodingModule.encode(reader, writer);

        reader = new MyNetworkReader("http", "myfirstappwith.appspot.com", "/index.html");
        Database database = new MyDatabase();
        writer = new MyDatabaseWriter(database);
        encodingModule.encode(reader, writer);
    }
}

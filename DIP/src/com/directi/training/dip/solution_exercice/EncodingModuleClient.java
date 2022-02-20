package com.directi.training.dip.solution_exercice;

import java.io.IOException;

public class EncodingModuleClient
{
    final static String BEFORE_ENCRYPTION_FILE = "DIP/src/com/directi/training/dip/solution_exercice/beforeEncryption.txt";
    final static String AFTER_ENCRYPTION_FILE = "DIP/src/com/directi/training/dip/solution_exercice/afterEncryption.txt";
    public static void main(String[] args) throws IOException
    {
        EncodingModule encodingModule = new EncodingModule();

        IReader reader = new MyFileReader(BEFORE_ENCRYPTION_FILE);
        IWriter writer = new MyFileWriter(AFTER_ENCRYPTION_FILE);
        encodingModule.encode(reader, writer);

        reader = new MyNetworkReader("http", "myfirstappwith.appspot.com", "/index.html");
        writer = new MyDatabaseWriter();
        encodingModule.encode(reader, writer);
    }
}

package com.directi.training.dip.solution_exercice;

import java.io.IOException;

public class EncodingModuleClient
{
    public static void main(String[] args) throws IOException
    {
        EncodingModule encodingModule = new EncodingModule();

        IReader reader = new MyFileReader(
            "DIP/src/com/directi/training/dip/solution_exercice/beforeEncryption.txt");
        IWriter writer = new MyFileWriter(
            "DIP/src/com/directi/training/dip/solution_exercice/afterEncryption.txt");
        encodingModule.encode(reader, writer);

        reader = new MyNetworkReader("http", "myfirstappwith.appspot.com", "/index.html");
        writer = new MyDatabaseWriter();
        encodingModule.encode(reader, writer);
    }
}

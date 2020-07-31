package com.genius.samples.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptionExample {

    public static void main(String[] args)
    {
        try
        {
            FileReader file = new FileReader("somefile.txt");
        }
        catch (FileNotFoundException e)
        {
            //Alternate logic
            e.printStackTrace();
        }
    }
}

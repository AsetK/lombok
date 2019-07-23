package com.epam.entity;

import lombok.Cleanup;

import java.io.*;

public class CleanupExample {

    public OutputStream example(){
        OutputStream outputStream2 = null;
        try {
            @Cleanup OutputStream outputStream = new FileOutputStream((new File("D:\\newfile.txt")));
            outputStream.write("hello".getBytes());
            outputStream2 = outputStream;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return outputStream2;
    }
}

/**
 *  Try with Resource Example.
 *  Automatically closes the extenal resources if we use try with resources.
 *  Here BufferReader class implements the auto-closeable interface.
 */
package com.practice.java;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringWriter;

public class TryWithResourcesExample {
    public static void main(String[] args) {
        try (BufferedReader reader  = new BufferedReader( new FileReader("/home/cbhatt/Desktop/Game Data Analysis Code"));
            StringWriter write = new StringWriter();){
            String line = "";
            while((line = reader.readLine()) != null) {
                line = reader.readLine();
                System.out.println(line);
            }
        } catch(IOException ioe) {
            ioe.printStackTrace();
        }
    }
}

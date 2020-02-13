/**
 *  Courtesy : Dugra Software (DURGASOFT)
 *  Class Design should be better but Keep it simple
 *  to understand the concept of
 *  Serialization and Deserialization.
 */
package com.practice.serde;

import java.io.*;

public class SerDeDemo {
    public static void main(String... args) {
        // Create the Instance of the class SerDeExample.
        SerDeExample sde = new SerDeExample();
        /**
         * Serialization Part
         *  An ObjectOutputStream writes primitive data types and graphs of Java objects to an OutputStream.
         *  Only objects that support the java.io.Serializable interface can be written to streams.
         *  FileOutputStream takes the binary data and writes them into the file.
         *  A file output stream is an output stream for writing data to a File or to a FileDescriptor.
         */
        try {
            FileOutputStream fs = new FileOutputStream("serde.ser");
            ObjectOutputStream os = new ObjectOutputStream(fs);
            System.out.println("Write the object into the file as byte stream :  Serialization");
            os.writeObject(sde);
            fs.close();
            os.close();
        } catch (IOException e) {
            System.out.println("IOException : " + e.getMessage());
        }
        /**
         *  DeSerialization Part
         *  An ObjectOutputStream writes primitive data types and graphs of Java objects to an OutputStream.
         *  Only objects that support the java.io.Serializable interface can be written to streams.
         *  FileOutputStream takes the binary data and writes them into the file.
         *  A file output stream is an output stream for writing data to a File or to a FileDescriptor.
         */
           try {
               FileInputStream fi = new FileInputStream("serde.ser");
               ObjectInputStream oi = new ObjectInputStream(fi);
               System.out.println("Read the object from the file as byte stream :  Deserialization");
               SerDeExample sde_1 = (SerDeExample)  oi.readObject();
               System.out.println("Read the String : " + sde_1.str + " -> \n" +
                       "Read the variable x : " + sde_1.x + " -> \n" +
                       "Read the variable y : " + sde_1.y);
               oi.close();
               fi.close();
           } catch (FileNotFoundException e) {   // First catch the sub class FileNotFoundException  of super class IOException.
               System.out.println("FileNotFoundException : " + e.getMessage());
           } catch (ClassNotFoundException e) {
               System.out.println("ClassNotFoundException : " + e.getMessage());
           } catch (IOException e) {
               System.out.println("IOException : " + e.getMessage());
           }
    }
}

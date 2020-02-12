package com.practice.serde;

import java.io.*;
/**
 * This class demonstrate the use of transient keyword.
 *  transient is a modifier and it is applicable only to a variable.
 *  One can not apply it to class, method, interface.
 *  transient means "NOT TO SERIALIZE".
 *  variable which is declared as transient, JVM will save the default value of the variable
 *  in a file rather then the declared value.
 *  Here, JVM will save the value of z as 0 rather than 70.
 *  There are two use of transient variable in serialization,
 *  1. We do not want to save / serialize the sensitive data during serialization for example Password or PIN number.
 *  2. We do not want to save / serialize the data that we can calculate from other variables.
 *
 *  NOTE:
 *  We can consider two more keywords static and final with respect to serialization.
 *      - If we declare the variable static, static variables do not take part in serialization because static variable are
 *        class level variable and it gets stored in 'Method Area' of JVM.
 *      - if we declare the variable as final then it is constant and during class loading JVM will replace  all the  final variable with constant.
 *        For example : final int ONE = 1;  then JVM will replace all the ONE with value 1 during class loading and constant can not be serialize.
 *        ONLY instance variable can be serialized.
 */
public class TransientDemo {
    public static void main(String... args) {
        TransientExample transientex = new TransientExample();
        /**
         * Serialization Part
         *  An ObjectOutputStream writes primitive data types and graphs of Java objects to an OutputStream.
         *  Only objects that support the java.io.Serializable interface can be written to streams.
         *  FileOutputStream takes the binary data and writes them into the file.
         *  A file output stream is an output stream for writing data to a File or to a FileDescriptor.
         */
        try {
            FileOutputStream fs = new FileOutputStream("transient.ser");
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(transientex);
            fs .close();
            os.close();
        } catch(IOException e) {
            System.out.println("Ser IOException -> : " + e.getMessage());
        }
        /**
         *  DeSerialization Part
         *  An ObjectOutputStream writes primitive data types and graphs of Java objects to an OutputStream.
         *  Only objects that support the java.io.Serializable interface can be written to streams.
         *  FileOutputStream takes the binary data and writes them into the file.
         *  A file output stream is an output stream for writing data to a File or to a FileDescriptor.
         */
        try {
            FileInputStream fi = new FileInputStream("transient.ser");
            ObjectInputStream oi = new ObjectInputStream(fi);
           TransientExample te = (TransientExample) oi.readObject();
            System.out.println(
            "x : " + te.x + "\n" +
            "y : " + te.y + "\n" +
            "transient variable z : " + te.z + "\n" +
            "str : " + te.str + "\n" +
            "Static Str : " + TransientExample.statcistr + "\n" +
            "Final variable dbl : " + te.dbl);
            System.out.println("Transient-Static-Final Variable Serialization Deserialization example finished.");
        } catch (ClassNotFoundException ce) {
            System.out.println("DeSer ClassNotFoundException -> : " + ce.getMessage());
        } catch(IOException e) {
            System.out.println("DeSer IOException -> : " + e.getMessage());
        }
    }
}

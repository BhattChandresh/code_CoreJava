package com.practice.java;

import org.omg.SendingContext.RunTime;

import java.util.ArrayList;

public class MemoryUtilisation {
    private static final int MegaBytes = 1024*1024;
    public static void main(String[] args) {
        long freeMemory = 0L;
        long totalMemory = 0L;
        long maxMemory = 0L;


        freeMemory = Runtime.getRuntime().freeMemory()/MegaBytes;
        totalMemory = Runtime.getRuntime().totalMemory()/MegaBytes;
        maxMemory = Runtime.getRuntime().maxMemory()/MegaBytes;
        System.out.println("Free Memory : "+ freeMemory);
        System.out.println("Total Memory : " + totalMemory);
        System.out.println("Max Memory : " + maxMemory);

        ArrayList<Integer> al = new ArrayList<Integer>();
        for(int i=0;i<9999999;i++) {
            al.add(i+1);
        }

        System.out.println("---------------------------------------------------------");

        freeMemory = Runtime.getRuntime().freeMemory()/MegaBytes;
        totalMemory = Runtime.getRuntime().totalMemory()/MegaBytes;
        maxMemory = Runtime.getRuntime().maxMemory()/MegaBytes;
        System.out.println("Free Memory : "+ freeMemory);
        System.out.println("Total Memory : " + totalMemory);
        System.out.println("Max Memory : " + maxMemory);
        System.out.println("Used Memory :" + (totalMemory-freeMemory));

        al = null;

    }
}

package com.practice.java.CloingDemo;

import com.practice.java.Dog;

public class App  {
    public static void main(String[] args) throws CloneNotSupportedException {

        // Shallow Cloning
        System.out.println(" ***** Shallow Cloning *****");
        CatShallow c1 = new CatShallow(20);
        DogShallow d1 = new DogShallow(c1, 10);
        DogShallow d2 = (DogShallow) d1.clone();
        System.out.println("i =" + d1.i + " , " + " j = " + d1.c.j );
        d2.i = 100;
        d2.c.j  = 200;
        System.out.println("i =" + d1.i + " , " + " j = " + d1.c.j );
        System.out.println("i =" + d2.i + " , " + " j = " + d2.c.j );

        // Deep Cloning
        System.out.println(" ***** Deep Cloning *****");
        CatDeep cd1 = new CatDeep(9);
        DogDeepClone dd1 = new DogDeepClone(cd1, 8);
        System.out.println("i =" + dd1.i + " , " + " j = " + dd1.c.j);
        DogDeepClone dd2 = (DogDeepClone) dd1.clone();
        dd2.i = 80;
        dd2.c.j = 90;
        System.out.println("i =" + dd1.i + " , " + " j = " + dd1.c.j);
        System.out.println("i =" + dd2.i + " , " + " j = " + dd2.c.j);
    }
}

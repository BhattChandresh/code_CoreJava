/**
 *  Reference : LinkedIn learning. Author : Bethan Palmer
 *   Advance Java
 * Method reference are a short hand way of writing certain type of Lamda Expression.
 * For Example : If we pass the variable to a method and do some operation on that variable that can be replaced with
 * method reference.
 */

package com.practice.java;

public class MethodReferenceDemo {
    public static void main(String[] args) {
        // Lamda Expression
        Square s = new Square(5);
        Shapes sq = (square) -> {
            return  square.calculateArea();
        };
        System.out.println("Area of Square is : " + sq.getArea(s));

        //Method Reference
        Square s1 = new Square(10);
        Shapes sq1 = Square::calculateArea;
        System.out.println("Area of square by method reference : " + sq1.getArea(s1));
    }
}

class Square{

    private  int sideLength;

    public Square(int sideLength) {
        this.sideLength = sideLength;
    }

    public int calculateArea() {
        return sideLength * sideLength;
    }
}

@FunctionalInterface
interface Shapes {
    public abstract int getArea(Square s);
}

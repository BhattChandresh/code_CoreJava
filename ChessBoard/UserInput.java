package com.technogise.code.interview;

import java.sql.SQLOutput;
import java.util.Scanner;

public class UserInput {

    String[] split;
    public void getUserInput() {
        System.out.println("Enter piece and position : ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] split = input.split(" ");
    }


}

package com.technogise.code.interview;

import java.sql.SQLOutput;
import java.util.Scanner;

public class UserInput {

    String[] split;

    public void getUserInput() {
        System.out.println("Enter Piece and Position (For Example King D5) : ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        input = input.toUpperCase();
        split = input.split(" ");
    }

    public String getPiece() {
        if(ChessBoardSimulation.isDebug)
            System.out.println("Piece = " + split[0]);
        return split[0];
    }

    public String getPosition() {
        if(ChessBoardSimulation.isDebug) {
            System.out.println("Mapped Number is = " + split[1]);
            System.out.println("Actual position = " + ChessBoard.cellNumberOutToIn.get(split[1]));
        }
        return ChessBoard.cellNumberOutToIn.get(split[1]);
    }
}

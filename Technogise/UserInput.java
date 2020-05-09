/**
 *  Version : 1.0
 *  Author : Chandresh Bhatt
 *  Objective :
 *      Takes the input from user (console) and extract the correct piece and position from it.
 *      Internally converts the input from user to UPPER CASE to maintain uniformity so user is free to enter correct value in
 *      any case (For Example : RooK F5 or  rOoK f5)
 *      Check for the proper piece and position and if it is wrong then exception thrown and all possible error messages are displayed.
 */
package com.technogise.code.interview;

import java.util.Scanner;

public class UserInput {

    String[] split;

    public void getUserInput() {
        System.out.println("Enter Piece and Position (For Example King D5) : ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        // User should be free to enter into any case, internally we handle the input string.
        input = input.toUpperCase();
        if(!(input.contains(" "))) {
            throw new RuntimeException();
        }
        split = input.split(" ");
        // Check for proper input, in case of wrong piece or wrong position entered inform the user and terminate the program.
        if(!(split[0].equals("HORSE") || split[0].equals("KING") || split[0].equals("QUEEN") || split[0].equals("PAWN") || split[0].equals("ROOK") || split[0].equals("BISHOP")))
            throw new RuntimeException();
        String pattern = "^[A-H?][1-8?]$";
        if(!(split[1].matches(pattern)))
         throw new RuntimeException();
    }

    public String getPiece() {
        if(ChessBoardSimulation.isDebug)
            System.out.println("Piece = " + split[0]);
        return split[0];
    }

    public String getPosition() {
        if(ChessBoardSimulation.isDebug) {
            System.out.println("Mapped Number is = " + split[1]);
            System.out.println("Actual position = " + ChessBoard.cellPositionToCoordinate.get(split[1]));
        }
        return ChessBoard.cellPositionToCoordinate.get(split[1]);
    }
}

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
        if(!(split[1].equals("A1") || split[1].equals("A2") || split[1].equals("A3") || split[1].equals("A4") || split[1].equals("A5") || split[1].equals("A6") || split[1].equals("A7") || split[1].equals("A8") ||
                split[1].equals("B1") || split[1].equals("B2") || split[1].equals("B3") || split[1].equals("B4") || split[1].equals("B5") || split[1].equals("B6") || split[1].equals("B7") || split[1].equals("B8") ||
                split[1].equals("C1") || split[1].equals("C2") || split[1].equals("C3") || split[1].equals("C4") || split[1].equals("C5") || split[1].equals("C6") || split[1].equals("C7") || split[1].equals("C8") ||
                split[1].equals("D1") || split[1].equals("D2") || split[1].equals("D3") || split[1].equals("D4") || split[1].equals("D5") || split[1].equals("D6") || split[1].equals("D7") || split[1].equals("D8") ||
                split[1].equals("E1") || split[1].equals("E2") || split[1].equals("E3") || split[1].equals("E4") || split[1].equals("E5") || split[1].equals("E6") || split[1].equals("E7") || split[1].equals("E8") ||
                split[1].equals("F1") || split[1].equals("F2") || split[1].equals("F3") || split[1].equals("F4") || split[1].equals("F5") || split[1].equals("F6") || split[1].equals("F7") || split[1].equals("F8") ||
                split[1].equals("G1") || split[1].equals("G2") || split[1].equals("G3") || split[1].equals("G4") || split[1].equals("G5") || split[1].equals("G6") || split[1].equals("F7") || split[1].equals("G8") ||
                split[1].equals("H1") || split[1].equals("H2") || split[1].equals("H3") || split[1].equals("H4") || split[1].equals("H5") || split[1].equals("H6") || split[1].equals("H7") || split[1].equals("H8")))
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
            System.out.println("Actual position = " + ChessBoard.cellNumberOutToIn.get(split[1]));
        }
        return ChessBoard.cellNumberOutToIn.get(split[1]);
    }
}

package com.technogise.code.interview;

import java.util.Scanner;

public class ChessBoardSimulation {
    static boolean isDebug = false;
    public static void main(String[] args) {

        System.out.println(" *** Welcome to Chess Board Simulation ***");

        ChessBoard cb = new ChessBoard();
        if(isDebug)
            cb.testInitializationOfChessBoard();

         UserInput uinput = new UserInput();
         uinput.getUserInput();
         Movement move = new Movement();
         move.findPossibleCells(uinput.getPiece(),uinput.getPosition());
    }
}

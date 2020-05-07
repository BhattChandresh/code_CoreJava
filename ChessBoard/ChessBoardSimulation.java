package com.technogise.code.interview;

import java.util.Scanner;

public class ChessBoardSimulation {
    public static void main(String[] args) {
        System.out.println(" *** Welcome to Chess Board Simulation ***");

        ChessBoard cb = new ChessBoard();
        cb.initializeChessBoard();
        //cb.testInitializationOfChessBoard();

//         UserInput uinput = new UserInput();
//         uinput.getUserInput();
        System.out.println("Enter Position : ");
        Scanner sc = new Scanner(System.in);
        String position = sc.nextLine();
        position = cb.cellNumberOutToIn.get(position);
        System.out.println(position);

         Movement move = new Movement();
         move.pawnMovement(position);





    }
}

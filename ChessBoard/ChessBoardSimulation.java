package com.technogise.code.interview;

public class ChessBoardSimulation {
    static boolean isDebug = false;
    public static void main(String[] args) {

        System.out.println(" *** Welcome to Chess Board Simulation ***");

        ChessBoard cb = new ChessBoard();
        UserInput uinput = new UserInput();
        Movement move = new Movement();

        if(isDebug)
            cb.testInitializationOfChessBoard();

        try {
            uinput.getUserInput();
        } catch(Exception e) {
            System.out.println("Program about to terminated. Possible causes are :");
            System.out.println("1. No Space between Piece and Position (Ex. HorseD5)");
            System.out.println("2. Piece may be wrong. Allowed pieces are <1> Pawn <2> Horse <3> Rook <4> Bishop <5> King <6> Queen");
            System.out.println("3. Position may be wrong. First character should be between A to H. Second character should be between 1 to 8");
            System.exit(1);
       }
       move.findPossibleCells(uinput.getPiece(), uinput.getPosition());
    }
}

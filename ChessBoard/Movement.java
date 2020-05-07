package com.technogise.code.interview;

public class Movement {
    String piece = "";
    String position = "";

    ChessBoard cb = new ChessBoard();


    public void getInfo(String[] info) {
        piece = info[0];
        position = info[1];
        System.out.println(piece);
        System.out.println(position);
    }

    public void pawnMovement(String position) {
        cb.initializeChessBoard();
        int row = Integer.valueOf(position.substring(0,1));
        int column = Integer.valueOf(position.substring(1));
        row = row -1;
        //row = row -1;
//        if(row < 0 || row > 7)
        if(row < 0) {
            System.out.println("Can't move further, reach the end of board");
            return;
        }
        String newPostion = Integer.toString(row) + Integer.toString(column);
        System.out.println(cb.cellNumberInToOut.get(newPostion));
    }
}

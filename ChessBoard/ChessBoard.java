package com.technogise.code.interview;

import java.util.HashMap;
import java.util.Map;

public class ChessBoard {
    // Declaration for 8X8 Grid
    private int[][] grid = new int[8][8];
    //Identify the cell number a name
    Map<String,String> cellNumberOutToIn = new HashMap<String,String>();
    Map<String,String> cellNumberInToOut = new HashMap<String, String>();

    // Create and Initialize the 8x8 Grid
    public void initializeChessBoard() {
        String cellRow = "";
        for (int row = 0; row < 8; row++) {
            if (row == 0)
                cellRow = "H";
            else if (row == 1)
                cellRow = "G";
            else if (row == 2)
                cellRow = "F";
            else if (row == 3)
                cellRow = "E";
            else if (row == 4)
                cellRow = "D";
            else if (row == 5)
                cellRow = "C";
            else if (row == 6)
                cellRow = "B";
            else if (row == 7)
                cellRow = "A";
            for (int column = 0; column < 8; column++) {
                grid[row][column] = 0;
                String input = Integer.toString(row) + Integer.toString(column);
//                System.out.println(input +  "->" + (cellRow + (column + 1)));
                cellNumberOutToIn.put((cellRow + (column + 1)),(Integer.toString(row) + Integer.toString(column)));
                cellNumberInToOut.put(input,(cellRow + (column + 1)));
//                System.out.println(cellNumberInToOut.get(input));
            }
        }
    }



    public void getIntersection(String position) {

    }

    // For production use this method is not required.
    // This is for testing purpose only.
    public void testInitializationOfChessBoard() {
        String cellRow = "";
        for(int row=0;row<8;row++) {
            System.out.println();
            if (row == 0)
                cellRow = "H";
            else if (row == 1)
                cellRow = "G";
            else if (row == 2)
                cellRow = "F";
            else if (row == 3)
                cellRow = "E";
            else if (row == 4)
                cellRow = "D";
            else if (row == 5)
                cellRow = "C";
            else if (row == 6)
                cellRow = "B";
            else if (row == 7)
                cellRow = "A";
            for(int column=0;column<8;column++){
                //System.out.print("grid["+ row + "][" + column + "] : " + cellNumberOutToIn.get(cellRow + (column+1)) + " | "  + (cellRow + (column+1)));
                //System.out.print("[" + row + "][" + column + "] : " + cellNumberOutToIn.get(cellRow + (column+1)) + " | "  + (cellRow + (column+1)) + " || ");
                System.out.print("[" + row + "][" + column + "] : " + cellNumberOutToIn.get(cellRow + (column+1)) + " | "  + (cellRow + (column+1)) + " || ");
             }
        }
    }
}

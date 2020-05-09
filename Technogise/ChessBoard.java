/**
 *  Version : 1.0
 *  Author : Chandresh Bhatt
 *  Objective :
 *   Convert the Cell Number (H1) received from user to Co-ordinates (0,0) for  internal processing.
 *   After processing, convert the Co-ordinates(7,7) to Cell Number(A8) in order to display the possible cell numbers to user.
 */
package com.technogise.code.interview;

import java.util.HashMap;
import java.util.Map;

public class ChessBoard {
    // Declaration for 8X8 Grid
    private static int[][] grid = new int[8][8];
    //Identify the cell number a name
    static Map<String,String> cellPositionToCoordinate = new HashMap<String,String>();
    static Map<String,String> CoordinateToCellPosition = new HashMap<String, String>();

    // Create and Initialize the 8x8 Grid
    static  {
        System.out.println("Initializing the Chess Board....");
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
                cellPositionToCoordinate.put((cellRow + (column + 1)),(Integer.toString(row) + Integer.toString(column)));
                CoordinateToCellPosition.put(input,(cellRow + (column + 1)));
            }
        }
        System.out.println("Chess Board initialization completes ....");
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
                //System.out.print("grid["+ row + "][" + column + "] : " + cellPositionToCoordinate.get(cellRow + (column+1)) + " | "  + (cellRow + (column+1)));
                //System.out.print("[" + row + "][" + column + "] : " + cellPositionToCoordinate.get(cellRow + (column+1)) + " | "  + (cellRow + (column+1)) + " || ");
                System.out.print("[" + row + "][" + column + "] : " + cellPositionToCoordinate.get(cellRow + (column+1)) + " | "  + (cellRow + (column+1)) + " || ");
             }
        }
        System.out.println();
    }
}

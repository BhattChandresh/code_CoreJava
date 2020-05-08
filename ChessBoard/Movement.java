package com.technogise.code.interview;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Movement {

    public void  findPossibleCells(String piece, String position) {
        if(piece.equals("PAWN")) {
            Pawn pawn = new Pawn();
            pawn.findPossibleCellforPawn(position);
         }
         else if(piece.equals("KING")) {
            King king = new King();
            king.findPossibleCellforKing(position);
        }
        else if(piece.equals("ROOK")) {
            Rook rook = new Rook();
            rook.findPossibleCellforRook(position);
        }
    }

    public int getRow(String position) {
        return (Integer.valueOf(position.substring(0,1)));
    }

    public int getColumn(String position) {
        return (Integer.valueOf(position.substring(1)));
    }

    public void outputMessage() {
        System.out.println("All possible positions (cell numbers) are : ");
    }

    public String getNewPossiblePosition(int row, int column) {
        return (Integer.toString(row) + Integer.toString(column));
    }
}

class Pawn extends Movement {
        public void findPossibleCellforPawn(String position) {
            int x = getRow(position);
            int y = getColumn(position);
            x = x-1;
            if(x < 0) {
                System.out.println("Can't move further, reach the end of board");
                return;
            }
            outputMessage();
            System.out.println(ChessBoard.cellNumberInToOut.get(getNewPossiblePosition(x,y)));
        }
}

class King extends Movement {
    public void findPossibleCellforKing(String position) {
        int newX = 0;
        int newY = 0;
        List<String> newPositions = new ArrayList<String>();
        int x = getRow(position);
        int y = getColumn(position);
        int[] possiblePositions = {
                x, y - 1,
                x, y + 1,
                x - 1, y,
                x + 1, y,
                x - 1, y - 1,
                x + 1, y + 1,
                x - 1, y + 1,
                x + 1, y - 1
        };
        for (int i = 0; i < possiblePositions.length; i = i + 2) {
            newX = possiblePositions[i];
            newY = possiblePositions[i + 1];
            if (!((newX < 0 || newX > 7) || (newY < 0 || newY > 7))) {
                newPositions.add(Integer.toString(newX) + Integer.toString(newY));
            }
        }
        outputMessage();
        for (int i = 0; i < newPositions.size(); i++) {
            System.out.println((i+1)  + " -> " + newPositions.get(i) + " -> " + ChessBoard.cellNumberInToOut.get(newPositions.get(i)));
        }
    }
}

class Rook extends Movement {
    public void findPossibleCellforRook(String position) {
        int newX = 0;
        int newY = 0;
        List<String> newPositions = new ArrayList<String>();
        List<String> validPositions = null;
        int x = getRow(position);
        int y = getColumn(position);
        int[] possiblePositions = {
                x, 0,
                x, 1,
                x , 2,
                x , 3,
                x , 4,
                x , 5,
                x , 6,
                x , 7,
                0, y,
                1, y,
                2, y,
                3, y,
                4, y,
                5, y,
                6, y,
                7, y
        };

        for (int i = 0; i < possiblePositions.length; i = i + 2) {
            newX = possiblePositions[i];
            newY = possiblePositions[i + 1];
            String element = Integer.toString(newX) + Integer.toString(newY);
            if(element.equals(position))
                continue;
            newPositions.add(element);
        }
        outputMessage();
        for(int i=0;i<newPositions.size();i++) {
            System.out.println((i+1)  + " -> " + newPositions.get(i) + " -> " + ChessBoard.cellNumberInToOut.get(newPositions.get(i)));
        }
    }
}



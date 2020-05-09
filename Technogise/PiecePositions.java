/**
 *  Version : 1.0
 *   Author : Chandresh Bhatt
 *   Objective :
 *      This class can be considered as processing layer for the program.
 *      From the correct piece and position, find all the possible cell numbers for said piece.
 */
package com.technogise.code.interview;

import java.util.ArrayList;
import java.util.List;

public class PiecePositions {

    public void setPieceAndItsPosition(String piece, String position) {
        if(piece.equals("PAWN")) {
            Pawn pawn = new Pawn();
            pawn.getAllPossibleCellNumbers(getRow(position),getColumn(position));
         }
         else if(piece.equals("KING")) {
            King king = new King();
            king.getAllPossibleCellNumbers(getRow(position),getColumn(position));
        }
        else if(piece.equals("ROOK")) {
            Rook rook = new Rook();
            rook.getAllPossibleCellNumbers(getRow(position),getColumn(position));
        }
        else if(piece.equals("BISHOP")) {
            Bishop bishop = new Bishop();
            bishop.getAllPossibleCellNumbers(getRow(position),getColumn(position));
        }
        else if(piece.equals("HORSE")) {
            Horse horse = new Horse();
            horse.getAllPossibleCellNumbers(getRow(position),getColumn(position));
        }
        else if(piece.equals("QUEEN")) {
            Queen queen = new Queen();
            queen.getAllPossibleCellNumbers(getRow(position),getColumn(position));
        }
    }

    public int getRow(String position) {
        return (Integer.valueOf(position.substring(0,1)));
    }

    public int getColumn(String position) {
        return (Integer.valueOf(position.substring(1)));
    }

    public void displayAllPositions(int x, int y) {
        System.out.println("All possible positions (cell numbers) are : ");
        System.out.println(ChessBoard.CoordinateToCellPosition.get(getNewPossiblePosition(x,y)));
    }

    public void displayAllPositions(List allPositions) {
        System.out.println("All possible positions (cell numbers) are : ");
        for (int index = 0; index < allPositions.size(); index++) {
            if(ChessBoardSimulation.isDebug)
                System.out.println((index+1)  + " -> " + allPositions.get(index) + " -> " + ChessBoard.CoordinateToCellPosition.get(allPositions.get(index)));
            else
                System.out.print(ChessBoard.CoordinateToCellPosition.get(allPositions.get(index)) + " ");
        }
    }

    public String getNewPossiblePosition(int row, int column) {
        return (Integer.toString(row) + Integer.toString(column));
    }

    // Method for Horse positions
    public void getHorsePositions(int x, int y, List newPositions) {
        int newX, newY = 0;
        for(int index=0;index<4;index++) {
            newX = x;
            newY = y;
            if(index == 0){
                newX = newX-2;
                newY = newY-1;
                if(!((newX < 0 || newX > 7) || (newY < 0 || newY > 7))){
                    newPositions.add(getNewPossiblePosition(newX,newY));
                }
            } else if(index == 1) {
                newX = newX-2;
                newY = newY+1;
                if(!((newX < 0 || newX > 7) || (newY < 0 || newY > 7))){
                    newPositions.add(getNewPossiblePosition(newX,newY));
                }
            } else if(index == 2) {
                newX = newX+2;
                newY = newY-1;
                if(!((newX < 0 || newX > 7) || (newY < 0 || newY > 7))){
                    newPositions.add(getNewPossiblePosition(newX,newY));
                }
            } else if(index== 3){
                newX = newX+2;
                newY = newY+1;
                if(!((newX < 0 || newX > 7) || (newY < 0 || newY > 7))){
                    newPositions.add(getNewPossiblePosition(newX,newY));
                }
            }
        }
    }

    // Method for Rook positions
    public void getRookPositions(int x, int y, List newPositions, String position) {
        int newX, newY = 0;
        int[] possiblePositions = {x,0, x,1, x,2, x,3, x,4, x,5, x,6, x,7, 0,y, 1,y, 2,y, 3,y, 4,y, 5,y, 6,y, 7,y};
        for (int index = 0; index < possiblePositions.length; index = index + 2) {
            newX = possiblePositions[index];
            newY = possiblePositions[index + 1];
            String element = Integer.toString(newX) + Integer.toString(newY);
            if(element.equals(position))
                continue;
            newPositions.add(element);
        }
    }

    // Method for King positions
    public void getKingPositions(int x, int y, List newPositions) {
        int newX, newY = 0;
        int[] possiblePositions = {x,y-1,  x,y+1, x-1,y, x+1,y, x-1,y-1, x+1,y+1, x-1,y+1, x+1,y-1};
        for (int index = 0; index < possiblePositions.length; index = index + 2) {
            newX = possiblePositions[index];
            newY = possiblePositions[index + 1];
            if (!((newX < 0 || newX > 7) || (newY < 0 || newY > 7))) {
                newPositions.add(Integer.toString(newX) + Integer.toString(newY));
            }
        }
    }

    // Methods for Bishop and Queen positions
    public void getDiagonalTopRightPositions(int x, int y, List newPositions) {
        int newX, newY = 0;
        newX = x;
        newY = y;
        while(true) {
            if (!((newX < 0 || newX > 7) || (newY < 0 || newY > 7))) {
                newX -= 1;
                newY +=1;
                if((newX < 0) || (newY > 7))
                    break;
                newPositions.add(getNewPossiblePosition(newX,newY));
            }
        }
    }

    public void getDiagonalBottomLeftPositions(int x, int y, List newPositions) {
        int newX, newY = 0;
        newX = x;
        newY = y;
        while(true) {
            if (!((newX < 0 || newX > 7) || (newY < 0 || newY > 7))) {
                newX += 1;
                newY -=1;
                if((newX > 7) || (newY < 0))
                    break;
                newPositions.add(getNewPossiblePosition(newX,newY));
            }
        }
    }

    public void getDiagonalBottomRightPositions(int x, int y, List newPositions) {
        int newX, newY = 0;
        newX = x;
        newY = y;
        while(true) {
            if (!((newX < 0 || newX > 7) || (newY < 0 || newY > 7))) {
                newX += 1;
                newY +=1;
                if((newX > 7) || (newY > 7))
                    break;
                newPositions.add(getNewPossiblePosition(newX,newY));
            }
        }
    }

    public void getDiagonalTopLeftPositions(int x, int y, List newPositions) {
        int newX, newY = 0;
        newX = x;
        newY = y;
        while(true) {
            if (!((newX < 0 || newX > 7) || (newY < 0 || newY > 7))) {
                newX -= 1;
                newY -=1;
                if((newX < 0) || (newY < 0))
                    break;
                newPositions.add(getNewPossiblePosition(newX,newY));
            }
        }
    }
}


class Pawn extends PiecePositions {
        public void getAllPossibleCellNumbers(int row, int column) {
            int x = row;
            int y = column;
            if(x == 7){
                System.out.println("Can't place pawn from A1 to A8");
                return;
            }
            x = x-1;
            if(x < 0) {
                System.out.println("Can't move further, reach the end of board");
                return;
            }
            displayAllPositions(x,y);
        }
}

class King extends PiecePositions {
    public void getAllPossibleCellNumbers(int row, int column) {
        int x = row;
        int y = column;
        List<String> newPositions = new ArrayList<String>();
        getKingPositions(x,y,newPositions);
        displayAllPositions(newPositions);
    }
}

class Rook extends PiecePositions {
    public void getAllPossibleCellNumbers(int row, int column) {
        String position = Integer.toString(row) + Integer.toString(column);
        List<String> newPositions = new ArrayList<String>();
        int x = row;
        int y = column;
        getRookPositions(x,y,newPositions,position);
        displayAllPositions(newPositions);
    }
}

class Bishop extends PiecePositions {
    public void getAllPossibleCellNumbers(int row, int column) {
        List<String> newPositions = new ArrayList<String>();
        int x = row;
        int y = column;
        getDiagonalTopRightPositions(x,y,newPositions);
        getDiagonalBottomLeftPositions(x,y,newPositions);
        getDiagonalBottomRightPositions(x,y,newPositions);
        getDiagonalTopLeftPositions(x,y,newPositions);
        displayAllPositions(newPositions);
    }
}

class Horse extends PiecePositions {
    public void getAllPossibleCellNumbers(int row, int column) {
        List<String> newPositions = new ArrayList<String>();
        int x = row;
        int y = column;
        getHorsePositions(x,y, newPositions);
        displayAllPositions(newPositions);
    }
}

class Queen extends PiecePositions {
    public void getAllPossibleCellNumbers(int row, int column) {
        String position = Integer.toString(row) + Integer.toString(column);
        List<String> newPositions = new ArrayList<String>();
        int x = row;
        int y = column;
        getRookPositions(x,y,newPositions,position);
        getDiagonalTopRightPositions(x,y,newPositions);
        getDiagonalBottomLeftPositions(x,y,newPositions);
        getDiagonalBottomRightPositions(x,y,newPositions);
        getDiagonalTopLeftPositions(x,y,newPositions);
        displayAllPositions(newPositions);
    }
}





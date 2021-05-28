package model.pieces;

import java.util.ArrayList;

public class Rook extends APiece
{
    public Rook(String color, int xPos, int yPos)
    {
        super("Rook", color, xPos, yPos);
    }


    @Override
    public ArrayList<Integer[]> possibleMove()
    {
        //TODO
        return null;
    }
}

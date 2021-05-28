package model.pieces;

import java.util.ArrayList;

public class Pawn extends APiece
{
    public Pawn(String color, int xPos, int yPos)
    {
        super("Pawn", color , xPos, yPos);
    }

    @Override
    public ArrayList<Integer[]> possibleMove()
    {
        //TODO
        return null;
    }
}

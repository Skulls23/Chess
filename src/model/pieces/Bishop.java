package model.pieces;

import java.util.ArrayList;

public class Bishop extends APiece
{
    public Bishop(String color, int xPos, int yPos)
    {
        super("Bishop", color, xPos, yPos);
    }

    @Override
    public ArrayList<Integer[]> possibleMove()
    {
        //TODO
        return null;
    }
}

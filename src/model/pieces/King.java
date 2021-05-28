package model.pieces;

import java.util.ArrayList;

public class King extends APiece
{
    public King(String color, int xPos, int yPos)
    {
        super("King", color, xPos, yPos);
    }

    @Override
    public ArrayList<Integer[]> possibleMove()
    {
        //TODO
        return null;
    }
}

package model.pieces;

import java.util.ArrayList;

public class Knight extends APiece
{
    public Knight(String color, int xPos, int yPos)
    {
        super("Knight", color, xPos, yPos);
    }

    @Override
    public ArrayList<Integer[]> possibleMove()
    {
        //TODO
        return null;
    }
}

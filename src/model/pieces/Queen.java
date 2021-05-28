package model.pieces;

import java.util.ArrayList;

public class Queen extends APiece
{
    public Queen(String color, int xPos, int yPos)
    {
        super("Queen", color, xPos, yPos);
    }

    @Override
    public ArrayList<Integer[]> possibleMove()
    {
        //TODO
        return null;
    }
}

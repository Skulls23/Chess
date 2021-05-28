package model.pieces;

public class King extends APiece
{
    public King(String color, int xPos, int yPos)
    {
        super("King", color, xPos, yPos);
    }

    @Override
    public int[][] possibleMove()
    {
        //TODO
        return new int[0][];
    }
}

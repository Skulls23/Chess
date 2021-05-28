package model.pieces;

public class Knight extends APiece
{
    public Knight(String color, int xPos, int yPos)
    {
        super("Knight", color, xPos, yPos);
    }

    @Override
    public int[][] possibleMove()
    {
        return new int[0][];
    }
}

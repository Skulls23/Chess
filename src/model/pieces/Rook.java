package model.pieces;

public class Rook extends APiece
{
    public Rook(String color, int xPos, int yPos)
    {
        super("Rook", color, xPos, yPos);
    }


    @Override
    public int[][] possibleMove()
    {
        return new int[0][];
    }
}

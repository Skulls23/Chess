package model.pieces;

public class Pawn extends APiece
{
    public Pawn(String color, int xPos, int yPos)
    {
        super("Pawn", color , xPos, yPos);
    }

    @Override
    public int[][] possibleMove()
    {
        return new int[0][];
    }
}

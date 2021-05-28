package model.pieces;

public class Bishop extends APiece
{
    public Bishop(String name, String color, int xPos, int yPos)
    {
        super("Bishop", color, xPos, yPos);
    }


    @Override
    public int[][] possibleMove()
    {
        return new int[0][];
    }
}

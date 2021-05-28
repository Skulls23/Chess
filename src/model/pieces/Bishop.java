package model.pieces;

public class Bishop extends APiece
{
    public Bishop(String color, int xPos, int yPos)
    {
        super("Bishop", color, xPos, yPos);
    }

    @Override
    public int[][] possibleMove()
    {
        //TODO
        return new int[0][];
    }
}

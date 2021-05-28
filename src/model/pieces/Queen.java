package model.pieces;

public class Queen extends APiece
{
    public Queen(String color, int xPos, int yPos)
    {
        super("Queen", color, xPos, yPos);
    }

    @Override
    public int[][] possibleMove()
    {
        //TODO
        return new int[0][];
    }
}

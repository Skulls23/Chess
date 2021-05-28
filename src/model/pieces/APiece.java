package model.pieces;

public abstract class APiece implements IPiece
{
    private String name;
    private String color;
    private int    xPos;
    private int    yPos;

    public APiece(String name, String color, int xPos, int yPos)
    {
        this.name = name;
        this.xPos = xPos;
        this.yPos = yPos;
    }
}

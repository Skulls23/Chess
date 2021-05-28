package model;

import model.pieces.APiece;

/**
 * This class represents the box, it can contain a piece
 */
public class Box
{
    private final String color;
    private APiece piece;

    /**
     * The constructor
     * @param color The number of the color of the box. 1 = black | 0 = white
     */
    public Box(boolean color)
    {
        if(color) this.color = "black";
        else this.color = "white";

        piece      = null;
    }

    public String getColor() { return color; }
    public APiece getPiece() { return piece; }

    public void setPiece(APiece piece) { this.piece = piece; }





}

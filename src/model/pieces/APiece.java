package model.pieces;

/**
 * This class define every piece that can be played with
 */
public abstract class APiece implements IPiece
{
    private final String name;
    private final String color;

    private int xPos;
    private int yPos;

    /**
     * The constructor of all pieces
     * @param name  The name of the piece
     * @param color The team color of the piece
     * @param xPos  The vertical position of the piece
     * @param yPos  The horizontal position of the piece
     */
    public APiece(String name, String color, int xPos, int yPos)
    {
        this.name  = name;
        this.color = color;
        this.xPos  = xPos;
        this.yPos  = yPos;
    }

    public String getName () { return name;  }
    public String getColor() { return color; }
    public int    getxPos () { return xPos;  }
    public int    getyPos () { return yPos;  }

    public void setxPos (int xPos)     { this.xPos = xPos;   }
    public void setyPos (int yPos)     { this.yPos = yPos;   }

}

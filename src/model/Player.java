package model;

import model.pieces.APiece;

import java.util.ArrayList;

/**
 * This class represent the player and everything he have
 */
public class Player
{
    private final String name;
    private final String color;

    private ArrayList<APiece> alPiece;

    /**
     * The constructor
     * @param player2Name The name of the player
     * @param color The team's color of the player
     */
    public Player(String player2Name, String color)
    {
        this.name = player2Name;
        this.color = color;
        alPiece = new ArrayList<>();
    }

    public String            getName () { return name;    }
    public String            getColor() { return color;   }
    public ArrayList<APiece> getAl   () { return alPiece; }

    public APiece getPiece   (int i)        { return alPiece.get(i); }
    public void   addPiece   (APiece piece) { alPiece.add(piece);    }
    public void   deletePiece(APiece piece) { alPiece.remove(piece); }
}

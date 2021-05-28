package model;

import model.pieces.APiece;

/**
 * This class represent the player and everything he have
 */
public class Player
{
    private final String name;
    private final String color;

    /**
     * The constructor
     * @param player2Name The name of the player
     * @param color The team's color of the player
     */
    public Player(String player2Name, String color)
    {
        this.name = player2Name;
        this.color = color;
    }

    public String getName (){ return name; }
    public String getColor(){ return color; }
}

package controller;

import model.ChessBoard;
import view.Hmi;

/**
 * This class is the point between the Human Machine Interface and the core of the game program
 */
public class Controller
{
    private Hmi        hmi;
    private ChessBoard board;

    public Controller()
    {
        hmi   = new Hmi(this);
        board = new ChessBoard(hmi.getPlayerName(0), hmi.getPlayerName(1));

        hmi.launch();
    }

    public Hmi        getHmi  () { return hmi;   }
    public ChessBoard getBoard() { return board; }

    public static void main(String[] args)
    {
        new Controller();
    }
}

package controller;

import model.ChessBoard;
import model.Player;
import model.pieces.*;
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
        addPiecesToPlayer(board.getPlayer(0));
        addPiecesToPlayer(board.getPlayer(1));
        hmi.launch();
    }

    private void addPiecesToPlayer(Player player)
    {
        int pawnLine;
        int pieceLine;

        if(player.getColor().equals("white"))
        {
            pawnLine  = ChessBoard.BOARD_LENGTH-2;
            pieceLine = ChessBoard.BOARD_LENGTH-1;
        }

        else
        {
            pawnLine  = 1;
            pieceLine = 0;
        }

        for(int i=0; i<ChessBoard.BOARD_LENGTH; i++)
            player.addPiece(new Pawn(player.getColor(), pawnLine, i));

        player.addPiece(new Rook(player.getColor(), pieceLine, 0));
        player.addPiece(new Rook(player.getColor(), pieceLine, ChessBoard.BOARD_LENGTH-1));

        player.addPiece(new Knight(player.getColor(), pieceLine, 1));
        player.addPiece(new Knight(player.getColor(), pieceLine, ChessBoard.BOARD_LENGTH-2));

        player.addPiece(new Bishop(player.getColor(), pieceLine, 2));
        player.addPiece(new Bishop(player.getColor(), pieceLine, ChessBoard.BOARD_LENGTH-3));

        player.addPiece(new Queen(player.getColor(), pieceLine, 3));
        player.addPiece(new King(player.getColor(), pieceLine, 4));
    }

    public Hmi        getHmi  () { return hmi;   }
    public ChessBoard getBoard() { return board; }

    public static void main(String[] args)
    {
        new Controller();
    }
}

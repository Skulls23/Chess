package model;

import model.pieces.APiece;

/**
 * This class is the board where the epic battle will take place
 * 0 and 1 lines belong to the player 1 and 6 and 8 lines belong to the player 2
 */
public class ChessBoard
{
    APiece[][] board;
    Player[]   players;

    public ChessBoard(String player1Name, String player2Name)
    {
        players = new Player[2];
        players[0] = new Player(player1Name);
        players[1] = new Player(player2Name);

        buildBoard();
    }

    public void buildBoard()
    {
        board = new APiece[8][8];
    }
}

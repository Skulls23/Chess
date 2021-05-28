package model;

import model.pieces.*;

/**
 * This class is the 8x8 board where the epic battle will take place
 * bottom lines belong to the player 1 (white)
 * top lines belong to the player 2 (black)
 */
public class ChessBoard
{
    public static final int BOARD_LENGTH = 8;

    private final Player[] players;

    private Box[][]  board;


    /**
     * The constructor
     * @param player1Name The name of the player 1
     * @param player2Name The name of the player 2
     */
    public ChessBoard(String player1Name, String player2Name)
    {
        players = new Player[2];

        players[0] = new Player(player1Name, "white");
        players[1] = new Player(player2Name, "black");

        buildBoard();
    }

    /**
     * Build the board and place the pieces for everyone
     */
    public void buildBoard()
    {
        board = new Box[BOARD_LENGTH][BOARD_LENGTH];

        for(int i=0; i<board.length; i++)
            for (int j = 0; j < board.length; j++)
                board[i][j] = new Box((i+j)%2 == 0);

        placingPieces("white");
        placingPieces("black");
    }

    /**
     * Place the different pieces on their initial spot on the board
     * @param color The team's color of the pieces
     */
    private void placingPieces(String color)
    {
        int firstLine;  //King's line
        int secondLine; //Pawn's line

        if(color.equals("black"))
        {
            firstLine  = board.length-1;
            secondLine = board.length-2;
        }
        else
        {
            firstLine  = 0;
            secondLine = 1;
        }

        for (int i = 0; i < board.length; i++)
        {
            switch (i)
            {
                case 0, 7 -> board[firstLine][i].setPiece(new Rook  (color, firstLine, i));
                case 1, 6 -> board[firstLine][i].setPiece(new Knight(color, firstLine, i));
                case 2, 5 -> board[firstLine][i].setPiece(new Bishop(color, firstLine, i));
                case 3    -> board[firstLine][i].setPiece(new King  (color, firstLine, i));
                case 4    -> board[firstLine][i].setPiece(new Queen (color, firstLine, i));
            }
            board[secondLine][i].setPiece(new Pawn(color, secondLine, i));
        }
    }

    public Box getBox(int i, int j) { return board[i][j]; }
}

package view.panels;

import model.ChessBoard;
import model.pieces.APiece;
import view.Hmi;

import javax.swing.*;
import java.awt.*;

/**
 * This class will be the panel which show the board
 */
public class BoardPnl extends JPanel
{
    private ChessBoard board;
    private JLabel[][] arLbl;


    public BoardPnl(ChessBoard board, Hmi hmi)
    {
        this.board  = board;

        arLbl = new JLabel[ChessBoard.BOARD_LENGTH][ChessBoard.BOARD_LENGTH];
        for (int i = 0; i < arLbl.length; i++)
            for (int j = 0; j < arLbl.length; j++)
                arLbl[i][j] = new JLabel();

        fillBoardWithSquare();
        //fillBoardWithPiece();

        setLayout(new GridLayout(ChessBoard.BOARD_LENGTH, ChessBoard.BOARD_LENGTH));
        setVisible(true);
    }

    /**
     * Colorize box in white or in black
     */
    private void fillBoardWithSquare()
    {
        for (int i = 0; i < ChessBoard.BOARD_LENGTH; i++)
            for (int j = 0; j < ChessBoard.BOARD_LENGTH; j++)
                if(board.getBox(i,j).getColor().equals("white"))
                {
                    board.getBox(i,j).setLblsquare(new JLabel(new ImageIcon(new ImageIcon("./resources/board/whiteSquare.png").getImage().getScaledInstance(100,100, Image.SCALE_SMOOTH))));
                    arLbl[i][j] = board.getBox(i,j).getLblsquare();
                    add(arLbl[i][j]);
                }
                else
                {
                    board.getBox(i,j).setLblsquare(new JLabel(new ImageIcon(new ImageIcon("./resources/board/blackSquare.png").getImage().getScaledInstance(100,100, Image.SCALE_SMOOTH))));
                    arLbl[i][j] = board.getBox(i,j).getLblsquare();
                    add(arLbl[i][j]);
                }
    }

    private void fillBoardWithPiece()
    {
        for(int i = 0; i < board.getPlayers().length; i++)
        {
            char colorChar;

            if(board.getPlayer(i).getColor().equals("white"))
                colorChar = 'W';
            else
                colorChar = 'B';

            for (int j = 0; j < board.getPlayer(i).getAl().size(); j++)
            {
                APiece piece = board.getPlayer(i).getPiece(j);
                System.out.println();
                board.getBox(piece.getxPos(), piece.getyPos()).setLblPiece(new JLabel(new ImageIcon(new ImageIcon("./resources/pieces/" + colorChar + piece.getName() + ".png").getImage().getScaledInstance(50,50, Image.SCALE_SMOOTH))));
                add(board.getBox(piece.getxPos(), piece.getyPos()).getLblPiece());
            }
        }
    }
}

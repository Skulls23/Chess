package view.panels;

import model.ChessBoard;
import view.Hmi;

import javax.swing.*;
import java.awt.*;

/**
 * This class will be the panel which show the board
 */
public class BoardPnl extends JPanel
{
    private ChessBoard board;


    public BoardPnl(ChessBoard board, Hmi hmi)
    {
        this.board = board;
        fillBoardWithColors();

        setLayout(new GridLayout(ChessBoard.BOARD_LENGTH, ChessBoard.BOARD_LENGTH));
        setVisible(true);
    }

    /**
     * Colorize box in white or in black
     */
    private void fillBoardWithColors()
    {
        for (int i = 0; i < ChessBoard.BOARD_LENGTH; i++)
            for (int j = 0; j < ChessBoard.BOARD_LENGTH; j++)
                if(board.getBox(i,j).getColor().equals("white"))
                    add(new JLabel(new ImageIcon(new ImageIcon("./resources/whiteSquare.png").getImage().getScaledInstance(100,100, Image.SCALE_SMOOTH))));
                else
                    add(new JLabel(new ImageIcon(new ImageIcon("./resources/blackSquare.png").getImage().getScaledInstance(100,100, Image.SCALE_SMOOTH))));
        repaint();
    }


}

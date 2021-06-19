package view;

import controller.Controller;
import view.panels.BoardPnl;

import javax.swing.*;
import java.awt.*;

public class Hmi extends JFrame
{
    private final Controller ctrl;

    private String[] playersName;
    private BoardPnl board;

    public Hmi(Controller ctrl)
    {
        setName("Chess");
        setSize(400, 400);

        this.ctrl = ctrl;

        playersName = new String[2];
        gatherNames();

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public void launch()
    {
        board = new BoardPnl(ctrl.getBoard(), this);
        add(board, BorderLayout.CENTER);
        board.revalidate();
        setVisible(true);
    }

    private void gatherNames()
    {
        for (int i = 0; i < playersName.length; i++)
        {
            playersName[i] = JOptionPane.showInputDialog
                            (
                                this,
                                "Player " + (i+1) + " what's your name ?",
                                "Player " + (i+1) + " question",
                                JOptionPane.QUESTION_MESSAGE
                            );
        }

    }

    public String     getPlayerName(int i) { return playersName[i]; }
    public Controller getCtrl      ()      { return ctrl; }
}

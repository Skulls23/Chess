package view;

import controller.Controller;

import javax.swing.*;

public class Hmi extends JFrame
{
    String[] playersName;

    public Hmi(Controller ctrl)
    {
        setName("Chess");
        setSize(400, 400);
        setVisible(true);

        playersName = new String[2];
        gatherNames();

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
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

    public String getPlayerName(int i) { return playersName[i]; }
}

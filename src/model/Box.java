package model;

import model.pieces.APiece;

import javax.swing.*;
import java.awt.*;

/**
 * This class represents the box, it can contain a piece
 */
public class Box
{
    private final String color;
    private APiece piece;
    private JLabel lblsquare;
    private JLabel lblPiece;

    /**
     * The constructor
     * @param color The number of the color of the box. 1 = black | 0 = white
     */
    public Box(boolean color)
    {
        if(color) this.color = "white";
        else this.color = "black";

        piece      = null;
    }

    public String getColor    () { return color;     }
    public APiece getPiece    () { return piece;     }
    public JLabel getLblsquare() { return lblsquare; }
    public JLabel getLblPiece () { return lblPiece;  }

    public void setPiece    (APiece piece)     { this.piece = piece;         }
    public void setLblsquare(JLabel lblsquare) { this.lblsquare = lblsquare; }
    public void setLblPiece (JLabel lblPiece)  { this.lblPiece = lblPiece;   }

}

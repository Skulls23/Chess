package model.pieces;

import java.util.ArrayList;

public interface IPiece
{
    /**
     * Search on which board's square the piece can go
     * @return All possible move
     */
    ArrayList<Integer[]> possibleMove();
}

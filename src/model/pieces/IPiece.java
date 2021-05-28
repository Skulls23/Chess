package model.pieces;

public interface IPiece
{
    /**
     * Search on which board's square the piece can go
     * @return All possible move
     */
    int[][] possibleMove();
}

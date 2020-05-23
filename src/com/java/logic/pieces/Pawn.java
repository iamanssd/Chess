
package com.java.logic.pieces;

import com.java.logic.board.*;

public class Pawn implements Pieces{

	private final boolean white;

	public Pawn(boolean white){
		this.white = white;
	}

	public boolean isWhite(){
		return this.white;
	}


	@Override
	public boolean movePiece(Tile ogTile, Tile newTile){
		/*
		if(ogTile.getCoordinates()){

		}
		*/
		return true;
	}

	@Override
    public boolean equals(Pieces piece) {

        if (piece == null || piece.isWhite() != this.isWhite()) {
           return false;
        }
        return (piece.isWhite() == this.isWhite());
    }

    @Override
    public String toString(){
    	return "P";
    }

}
package com.java.logic.pieces;

import com.java.logic.board.*;

public interface Pieces{

	public boolean movePiece(Tile ogTile, Tile newTile);
	public boolean isWhite();
	public boolean equals(Pieces piece);
	public String toString();
	
}
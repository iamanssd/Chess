package com.java.logic.board;

import com.java.logic.pieces.Pieces;

public class Tile{
	
	private final int x;
	private final int y;

	private boolean occupied;
	private Pieces piece;

	public Tile(int x, int y, boolean occupied){
		this.x = x;
		this.y = y;
		this.occupied = occupied;
		this.piece = null;

	}

	public Tile(int x, int y, boolean occupied, Pieces piece){
		this.x = x;
		this.y = y;
		this.occupied = occupied;
		this.piece = piece;

	}


	public boolean occupied(){
		return this.occupied;
	}


	//coordinates
	public int getCoordinateX(){
		return this.x;
	}
	public int getCoordinateY(){
		return this.y;
	}

	//piece
	public Pieces getPiece(){
		return this.piece;
	}
	public void changePiece(Pieces piece){
		this.piece = piece;
	}


}
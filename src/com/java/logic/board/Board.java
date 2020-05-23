package com.java.logic.board;

import com.java.logic.pieces.*;

public class Board {

	private Tile[][] boardTiles;
	
	private Tile tile1, tile2, tile3, tile4, tile5, tile6, tile7, tile8,
	tile9, tile10, tile11, tile12, tile13, tile14, tile15, tile16,
	tile17, tile18, tile19, tile20, tile21, tile22, tile23, tile24,
	tile25, tile26, tile27, tile28, tile29, tile30, tile31, tile32,
	tile33, tile34, tile35, tile36, tile37, tile38, tile39, tile40,
	tile41, tile42, tile43, tile44, tile45, tile46, tile47, tile48,
	tile49, tile50, tile51, tile52, tile53, tile54, tile55, tile56,
	tile57, tile58, tile59, tile60, tile61, tile62, tile63, tile64;

	private Pieces wpawn1;
	private Pieces wpawn2;
	private Pieces wpawn3;
	private Pieces wpawn4;
	private Pieces wpawn5;
	private Pieces wpawn6;
	private Pieces wpawn7;
	private Pieces wpawn8;

	private Pieces wking;
	private Pieces wqueen;

	private Pieces wbishop1;
	private Pieces wbishop2;

	private Pieces wknight1;
	private Pieces wknight2;

	private Pieces wrook1;
	private Pieces wrook2;


	private Pieces bpawn1;
	private Pieces bpawn2;
	private Pieces bpawn3;
	private Pieces bpawn4;
	private Pieces bpawn5;
	private Pieces bpawn6;
	private Pieces bpawn7;
	private Pieces bpawn8;

	private Pieces bking;
	private Pieces bqueen;

	private Pieces bbishop1;
	private Pieces bbishop2;

	private Pieces bknight1;
	private Pieces bknight2;

	private Pieces brook1;
	private Pieces brook2;

	public Board(){


		//white pieces

		this.wpawn1 = new Pawn(true);
		this.wpawn2 = new Pawn(true);
		this.wpawn3 = new Pawn(true);
		this.wpawn4 = new Pawn(true);
		this.wpawn5 = new Pawn(true);
		this.wpawn6 = new Pawn(true);
		this.wpawn7 = new Pawn(true);
		this.wpawn8 = new Pawn(true);

		this.wking = new King(true);
		this.wqueen = new Queen(true);

		this.wbishop1 = new Bishop(true);
		this.wbishop2 = new Bishop(true);

		this.wknight1 = new Knight(true);
		this.wknight2 = new Knight(true);

		this.wrook1 = new Rook(true);
		this.wrook2 = new Rook(true);

		//black pieces

		this.bpawn1 = new Pawn(false);
		this.bpawn2 = new Pawn(false);
		this.bpawn3 = new Pawn(false);
		this.bpawn4 = new Pawn(false);
		this.bpawn5 = new Pawn(false);
		this.bpawn6 = new Pawn(false);
		this.bpawn7 = new Pawn(false);
		this.bpawn8 = new Pawn(false);

		this.bking = new King(false);
		this.bqueen = new Queen(false);

		this.bbishop1 = new Bishop(false);
		this.bbishop2 = new Bishop(false);

		this.bknight1 = new Knight(false);
		this.bknight2 = new Knight(false);

		this.brook1 = new Rook(false);
		this.brook2 = new Rook(false);

		//sets up 2d array
		//of 8x8 tiles

		this.boardTiles = new Tile[8][8];

		boardTiles[0][0] = tile1 = new Tile(0,0, true, brook1);
		boardTiles[0][1] = tile2 = new Tile(1,0, true, bknight1);
		boardTiles[0][2] = tile3 = new Tile(2,0, true, bbishop1);
		boardTiles[0][3] = tile4 = new Tile(3,0, true, bqueen);
		boardTiles[0][4] = tile5 = new Tile(4,0, true, bking);
		boardTiles[0][5] = tile6 = new Tile(5,0, true, bbishop2);
		boardTiles[0][6] = tile7 = new Tile(6,0, true, bknight2);
		boardTiles[0][7] = tile8 = new Tile(7,0, true, brook2);
		boardTiles[1][0] = tile9 = new Tile(0,1, true, bpawn1);
		boardTiles[1][1] = tile10 = new Tile(1,1, true, bpawn2);
		boardTiles[1][2] = tile11 = new Tile(2,1, true, bpawn3);
		boardTiles[1][3] = tile12 = new Tile(3,1, true, bpawn4);
		boardTiles[1][4] = tile13 = new Tile(4,1, true, bpawn5);
		boardTiles[1][5] = tile14 = new Tile(5,1, true, bpawn6);
		boardTiles[1][6] = tile15 = new Tile(6,1, true, bpawn7);
		boardTiles[1][7] = tile16 = new Tile(7,1, true, bpawn8);
		boardTiles[2][0] = tile17 = new Tile(0,2, false);
		boardTiles[2][1] = tile18 = new Tile(1,2, false);
		boardTiles[2][2] = tile19 = new Tile(2,2, false);
		boardTiles[2][3] = tile20 = new Tile(3,2, false);
		boardTiles[2][4] = tile21 = new Tile(4,2, false);
		boardTiles[2][5] = tile22 = new Tile(5,2, false);
		boardTiles[2][6] = tile23 = new Tile(6,2, false);
		boardTiles[2][7] = tile24 = new Tile(7,2, false);
		boardTiles[3][0] = tile25 = new Tile(0,3, false);
		boardTiles[3][1] = tile26 = new Tile(1,3, false);
		boardTiles[3][2] = tile27 = new Tile(2,3, false);
		boardTiles[3][3] = tile28 = new Tile(3,3, false);
		boardTiles[3][4] = tile29 = new Tile(4,3, false);
		boardTiles[3][5] = tile30 = new Tile(5,3, false);
		boardTiles[3][6] = tile31 = new Tile(6,3, false);
		boardTiles[3][7] = tile32 = new Tile(7,3, false);
		boardTiles[4][0] = tile33 = new Tile(0,4, false);
		boardTiles[4][1] = tile34 = new Tile(1,4, false);
		boardTiles[4][2] = tile35 = new Tile(2,4, false);
		boardTiles[4][3] = tile36 = new Tile(3,4, false);
		boardTiles[4][4] = tile37 = new Tile(4,4, false);
		boardTiles[4][5] = tile38 = new Tile(5,4, false);
		boardTiles[4][6] = tile39 = new Tile(6,4, false);
		boardTiles[4][7] = tile40 = new Tile(7,4, false);
		boardTiles[5][0] = tile41 = new Tile(0,5, false);
		boardTiles[5][1] = tile42 = new Tile(1,5, false);
		boardTiles[5][2] = tile43 = new Tile(2,5, false);
		boardTiles[5][3] = tile44 = new Tile(3,5, false);
		boardTiles[5][4] = tile45 = new Tile(4,5, false);
		boardTiles[5][5] = tile46 = new Tile(5,5, false);
		boardTiles[5][6] = tile47 = new Tile(6,5, false);
		boardTiles[5][7] = tile48 = new Tile(7,5, false);
		boardTiles[6][0] = tile49 = new Tile(0,6, true, wpawn1);
		boardTiles[6][1] = tile50 = new Tile(1,6, true, wpawn2);
		boardTiles[6][2] = tile51 = new Tile(2,6, true, wpawn3);
		boardTiles[6][3] = tile52 = new Tile(3,6, true, wpawn4);
		boardTiles[6][4] = tile53 = new Tile(4,6, true, wpawn5);
		boardTiles[6][5] = tile54 = new Tile(5,6, true, wpawn6);
		boardTiles[6][6] = tile55 = new Tile(6,6, true, wpawn7);
		boardTiles[6][7] = tile56 = new Tile(7,6, true, wpawn8);
		boardTiles[7][0] = tile57 = new Tile(0,7, true, wrook1);
		boardTiles[7][1] = tile58 = new Tile(1,7, true, wknight1);
		boardTiles[7][2] = tile59 = new Tile(2,7, true, wbishop1);
		boardTiles[7][3] = tile60 = new Tile(3,7, true, wqueen);
		boardTiles[7][4] = tile61 = new Tile(4,7, true, wking);
		boardTiles[7][5] = tile62 = new Tile(5,7, true, wbishop2);
		boardTiles[7][6] = tile63 = new Tile(6,7, true, wknight2);
		boardTiles[7][7] = tile64 = new Tile(7,7, true, wrook2);
	}
	

	//if empty, just changes bar on top for coordinates
	//if piece, then name piece and highlight piece and ^^
	public void clickTile(Tile tile){
		if(tile.occupied()){
			//change bar on top action listeners and stuff
		} else {
			tile.getPiece(); // returns piece for a different method later on? to print out
		}
	}

	//when a piece was clicked and a different tile is pressed
	public void movePiece(Tile ogTile, Tile newTile){
		//a bunch of try shit here
		ogTile.getPiece();
	}


	public String toString(){
		String output = "";

		for(int i = 0; i < 8; i++){
			for(int j = 0; j < 8; j++){
				if(boardTiles[i][j].getPiece() == null){
					output += " - ";
				} else {
					output += " " + boardTiles[i][j].getPiece().toString() + " ";
				}
			}
			output += "\n";
		}

		return output;
	}

	//test out to see board visually
	public static void main(String[] args){
		Board board = new Board();
		System.out.println(board.toString());
	}
}

public interface Piece {
	
	//returns coordinates of a piece
	public abstract int[][] getCoordinates();

	//moves a piece to a given location
	public abstract void movePiece(int[][] coordinates);


}
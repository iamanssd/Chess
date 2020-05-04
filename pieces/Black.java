

public class Black {

	private String name;

	//Constructor for Black
	public Black(String name){
		this.name = name;

		//initializes all pieces
		Pawn pawn1 = new Pawn(/*put default coordinates*/);
		Pawn pawn2 = new Pawn();
		Pawn pawn3 = new Pawn();
		Pawn pawn4 = new Pawn();
		Pawn pawn5 = new Pawn();
		Pawn pawn6 = new Pawn();
		Pawn pawn7 = new Pawn();
		Pawn pawn8 = new Pawn();

		King king = new King();
		Queen queen = new Queen();

		Bishop bishop1 = new Bishop();
		Bishop bishop2 = new Bishop();

		Knight knight1 = new Knight();
		Knight knight2 = new Knight();

		Rook rook1 = new Rook();
		Rook rook2 = new Rook();
	}

	//returns name, maybe used later for GUI
	public String getName(){
		return this.name;
	}
}
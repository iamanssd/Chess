// Samuel Kang May 4 2020

public class Entry{
	



	public static void main(String[] args) {

		//assign who plays the other person randomly later on

		White player1 = new White(/* add String name parameter here */);
		Black player2 = new Black(/* add String name parameter here */);

		//initializes Board with pieces of player1 and player2
		Board board = new Board(player1, player2);

		//set up the GUI here, have actionlistenes either in here or in the GUI class

		Gui gui = new Gui();

		//while loop that stops the game when someone either gives up, or if someone wins/loses

		System.out.println("Hello World");
	}

}
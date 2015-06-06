package tictactoe;

public class InvalidPositionException extends Exception {
	public InvalidPositionException() {
		super("Unacceptable Location!");
	}
}

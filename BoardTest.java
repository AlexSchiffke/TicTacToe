package tictactoe;

import static org.junit.Assert.*;

import org.junit.Test;

public class BoardTest {

	@Test
	public void leeresBoardTest() {
		Board board = new Board();
		assertEquals(false,board.hasWinner());
	}
	
	@Test
	public void einfacheMarkierungTest() throws InvalidPositionException {
		Board board = new Board();
		board.setMark("X",0,0);
		board.setMark("X",0,1);
		board.setMark("X",1,2);
		assertEquals(false,board.hasWinner());
	}
	
	@Test
	public void markierungMitSiegerTest() throws InvalidPositionException {
		Board board = new Board();
		board.setMark("X",0,0);
		board.setMark("X",1,1);
		board.setMark("X",2,2);
		assertEquals(true,board.hasWinner());
	}

	@Test
	public void markierungMitSiegerTest2() throws InvalidPositionException {
		Board board = new Board();
		board.setMark("X",0,0);
		board.setMark("X",0,1);
		board.setMark("X",0,2);
		assertEquals(true,board.hasWinner());
	}
	
	@Test
	public void markierungMitSiegerTest3() throws InvalidPositionException {
		Board board = new Board();
		board.setMark("X",0,0);
		board.setMark("X",1,0);
		board.setMark("X",2,0);
		assertEquals(true,board.hasWinner());
	}
	
	@Test
	public void ungueltigeMarkierungTest() throws InvalidPositionException{
		Board board = new Board();
		board.setMark("Hallo!", 0, 0);
		assertEquals(null,board.board[0][0]);
	}
	
}

package tictactoe;

public class Board {
	 String[][] board = new String[3][3];
	 public Board(){
		 
		 for(int i=0;i<3;i++){
			 for(int j=0;j<3;j++){
				 this.board[i][j] = null;
			 }
		 }
		 
	 } 
	  public void setMark(String mark, int x, int y) throws InvalidPositionException  {
		  if(x>3||x<0){
			  throw new InvalidPositionException();
		  }
		  if(y>3||y<0){
			  throw new InvalidPositionException();
		  }
		  if(board[x][y]!=null){
			  System.out.println("Feld schon belegt!");
		  }else if(mark != "X" && mark !="O"){
			  System.out.println("Ungültiges Zeichen!");
		  }else{
			  board[x][y] = mark;
			  System.out.println(hasWinner());
		  }
	  } 
	  public boolean hasWinner(){
		  for(int i = 0; i<3;i++){
			  int zaehlerX = 0;
			  int zaehlerO = 0;
			  for(int j=0;j<3;j++){
				  if(board[i][j] == "X"){
					  zaehlerX++;
				  }else if(board[i][j] == "O"){
					  zaehlerO++;
				  }
			  }
			  if(zaehlerX == 3){
				  return true;
			  }else if(zaehlerO == 3){
				  return true;
			  }
			  zaehlerX = 0;
			  zaehlerO = 0;
			  for(int j=0;j<3;j++){
				  if(board[j][i] == "X"){
					  zaehlerX++;
				  }else if(board[j][i] == "O"){
					  zaehlerO++;
				  }
			  }
			  if(zaehlerX == 3){
				  return true;
			  }else if(zaehlerO == 3){
				  return true;
			  }
			  
		  }
		  int zaehlerX = 0;
		  int zaehlerO = 0;
		  for(int i=0;i<3;i++){
			  if(board[i][i] == "X"){
				  zaehlerX++;
			  }else if(board[i][i] == "O"){
				  zaehlerO++;
			  }
		  }
		  if(zaehlerX == 3){
			  return true;
		  }else if(zaehlerO == 3){
			  return true;
		  }
		  return false;
	  } 
}

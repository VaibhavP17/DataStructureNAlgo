package com.example.dsa.score.board;

public class ScoreBoardTest {

	public static void main(String[] args) throws NotAHighScoreException {
		ScoreBoard sb = new ScoreBoard();
		
		GameEntry ge1 = new GameEntry("Steve", 86);
		sb.updateBoard(ge1);

		GameEntry ge2 = new GameEntry("Mike", 67);
		sb.updateBoard(ge2);
		
		GameEntry ge3 = new GameEntry("John", 92);
		sb.updateBoard(ge3);
		
		GameEntry ge4 = new GameEntry("Mathew", 45);
		sb.updateBoard(ge4);
		
		GameEntry ge5 = new GameEntry("Christine", 48);
		sb.updateBoard(ge5);
		
		System.out.println("Entries in score board: "+sb.getCurrentEntryCount());
		System.out.println("***************************");
		sb.printScoreBoard();
		
		System.out.println("***************************");
		
		GameEntry ge6 = new GameEntry("Nicole", 89);
		sb.updateBoard(ge6);
		sb.printScoreBoard();
		
		System.out.println("***************************");
	}

}

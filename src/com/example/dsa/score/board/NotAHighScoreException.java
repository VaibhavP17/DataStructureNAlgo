package com.example.dsa.score.board;

public class NotAHighScoreException extends Exception {

	private static final long serialVersionUID = 1L;

	public NotAHighScoreException(){
		super("Entered score is not high when compared against score board");
	}
}

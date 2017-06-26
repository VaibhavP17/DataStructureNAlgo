package com.example.dsa.score.board;

public class GameEntry {
	private String name;
	private int score;
	
	public GameEntry(String name, int score){
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}
}

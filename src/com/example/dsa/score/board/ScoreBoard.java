package com.example.dsa.score.board;

public class ScoreBoard {
	
	private int SCORE_BOARD_SIZE = 5;
	private int currentEntryCount = 0;
	private GameEntry[] entries = new GameEntry[SCORE_BOARD_SIZE];
	
	public boolean updateBoard(GameEntry ge) throws NotAHighScoreException{
		
		if(currentEntryCount==0){
			entries[currentEntryCount] = ge;
			++currentEntryCount;
			return true;
		}
		
		if(!validateScore(ge)){
			throw new NotAHighScoreException();
		}
		
		int newScore = ge.getScore();
		
		int targetIndex = getTargetIndex(newScore);
		
		for(int j=currentEntryCount-1; j>=targetIndex;j--){
			if(j+1<entries.length){
				entries[j+1] = entries[j];
			}else{
				entries[j]= null;
			}
		}
		
		entries[targetIndex] = ge;
		
		if(entries.length > currentEntryCount){
			++currentEntryCount;
		}
		
		return true;
	}
	
	public int getCurrentEntryCount() {
		return currentEntryCount;
	}
	
	private boolean validateScore(GameEntry ge){
		boolean validationStatus = true;
		if(entries.length == currentEntryCount && ge.getScore() < entries[currentEntryCount-1].getScore()){
			validationStatus = false;
		}
		return validationStatus;
	}
	
	private int getTargetIndex(int newScore){
		int targetIndex = currentEntryCount;
		for(int i=0; i<currentEntryCount; i++){
			if(newScore > entries[i].getScore()){
				targetIndex = i;
				break;
			}
		}
		return targetIndex;
	}
	
	public void printScoreBoard(){
		for(int i=0; i<currentEntryCount; i++){
			GameEntry ge = entries[i];
			System.out.println("Rank "+(i+1)+": "+ge.getName()+", Score: "+ge.getScore());
		}
	}	
}

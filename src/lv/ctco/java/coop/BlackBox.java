package lv.ctco.java.coop;

public class BlackBox implements Box {
	private int rightAnswerCount = 0;
	
	private boolean puzzle1 = false;
	private boolean puzzle2 = false;
	private boolean puzzle3 = false;
	private boolean puzzle4 = false;
	private boolean puzzle5 = false;
	private boolean puzzle6 = false;
	private boolean puzzle7 = false;
	private boolean puzzle8 = false;
	private boolean puzzle9 = false;
	
	public String depuzzle() {
		if(rightAnswerCount == 9){
			return "Linus Torvalds has quipped about the name \"git\",\n" +
					" which is English slang for a stupid or unpleasant person.\n" +
					" Torvalds said: \"I'm an egotistical bastard, and I name\n" +
					" all my projects after myself. First 'Linux', now 'git'.\"";
		}
		return rightAnswerCount + " from 9 are right";
	}
	
	public void puzzleNo1(int result) {
		if(!puzzle1  && (result == 34)){
			rightAnswerCount++;	
			puzzle1 = true;
		}
	}

	public void puzzleNo2(int result) {
		if(!puzzle2 && (result == 90)){
			rightAnswerCount++;	
			puzzle2 = true;
		}
	}

	public void puzzleNo3(int result) {
		if(!puzzle3 && (result == 120)){
			rightAnswerCount++;	
			puzzle3 = true;
		}
	}

	public void puzzleNo4(int [] result) {
		int answers [] = {17, 27, 37, 47};
		if(!puzzle4 && (result.length == 4)){
			for(int i = 0; i < result.length; i++){
				if(result[i] != answers[i]){
					return;
				}
			}
			rightAnswerCount++;	
			puzzle4 = true;
		}
	}

	public void puzzleNo5(int result) {
		if(!puzzle5 && (result == 55)){
			rightAnswerCount++;	
			puzzle5 = true;
		}
	}

	public void puzzleNo6(String result) {
		if(!puzzle6 && result != null && result.equals("1111")){
			rightAnswerCount++;	
			puzzle6 = true;
		}
	}

	public void puzzleNo7(String result) {
		if(!puzzle7 && result != null && result.equals("11")){
			rightAnswerCount++;	
			puzzle7 = true;
		}
	}

	public void puzzleNo8(String result) {
		if(!puzzle8 && result != null && result.equalsIgnoreCase("1f")){
			rightAnswerCount++;	
			puzzle8 = true;
		}
	}

	public void puzzleNo9(double result) {
		if(!puzzle9 && result == 3.5){
			rightAnswerCount++;	
			puzzle9 = true;
		}
	}
}

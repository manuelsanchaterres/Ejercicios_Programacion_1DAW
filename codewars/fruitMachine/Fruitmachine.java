package fruitMachine;
import java.util.ArrayList;
import java.util.Arrays;
class Fruitmachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final String[][] reels = new String[][]{
			new String[]{"Wild", "Star", "Bell", "Shell", "Seven",
                "Cherry", "Bar", "King", "Queen", "Jack"},
			new String[]{"Wild", "Star", "Bell", "Shell", "Seven",
                "Cherry", "Bar", "King", "Queen", "Jack"},
			new String[]{"Wild", "Star", "Bell", "Shell", "Seven",
                "Cherry", "Bar", "King", "Queen", "Jack"}};
                
		final int[] spins = new int[]{1, 2, 0};
		
		int totalScore = fruit(reels, spins);
	}
	
	// fruit function returns total score based on reels item combination
	
	static int fruit(final String[][] reels, final int[] spins) {
		
		ArrayList <String> capturedReelItems = captureReelItem(reels,spins);
		int totalScore = 0;
		int indexScoreTable = -1;
		int totalMatches = compareItems(capturedReelItems);

		if (totalMatches == 2) {
			
			totalScore = 2;
			
		}else if (totalMatches == 3) {
			
			totalScore = 3;
			
		}
		
		return totalScore;
	};
	
	static ArrayList<String> captureReelItem (final String[][] reels, final int[] spins){
		
		ArrayList <String> capturedReelItems = new ArrayList <String>();
		String capturedReelItem;
		
		for (int i = 0; i < spins.length; i++) {
			
			capturedReelItem = reels[i][spins[i]];
			capturedReelItems.add(capturedReelItem);
			
		}
		
		return capturedReelItems;
		
	}
	
	static int compareItems(ArrayList <String> capturedReelItems) {
		
		int numberMatches = 1;
		
		for (int i = 1; i < capturedReelItems.size(); i++) {
			
			if (capturedReelItems.get(i).equals(capturedReelItems.get(0))) {
				
				numberMatches++;
			}
		}
		
		return numberMatches;
	}
	
}

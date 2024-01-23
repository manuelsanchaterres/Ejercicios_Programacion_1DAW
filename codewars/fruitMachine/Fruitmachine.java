package fruitMachine;
import java.util.Arrays;
public class Fruitmachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final String[][] reels = new String[][]{
			new String[]{"Wild", "Star", "Bell", "Shell", "Seven",
                "Cherry", "Bar", "King", "Queen", "Jack"},
			new String[]{"Wild", "Star", "Bell", "Shell", "Seven",
                "Cherry", "Bar", "King", "Queen", "Jack"},
			new String[]{"Wild", "Star", "Bell", "Shell", "Seven",
                "Cherry", "Bar", "King", "Queen", "Jack"}};
                
		final int[] spins = new int[]{2, 1, 0};
		
		System.out.println(fruit(reels, spins));
	}
	
	// fruit function returns total score based on reels item combination
	
	public static int fruit(final String[][] reels, final int[] spins) {
		
		int sameReelItemCounter = countSameReelItem(spins);
		int totalScore = 0;
		
		boolean twoOfSame = false;
		boolean threeOfSame = false;
		
		return totalScore;
	};
	
	public static int countSameReelItem(final int[] spins) {
			
		int sameReelItemCounter = 1;
		
		for (int i = 0; i < spins.length; i++) {
			
			if (i != 0) {
				
				if (spins[i] == spins[0]) {
					
					sameReelItemCounter++;
				};
			}
		}
		
		
		
		return sameReelItemCounter;
	};
}

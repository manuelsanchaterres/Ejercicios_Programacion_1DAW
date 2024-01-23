package arrayDiff;
import java.util.Arrays;
public class Arraydiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(arrayDiff(new int[] {1, 2, 2, 2, 3}, new int[] {2}));
	}
	
	public static int[] arrayDiff(int[] a, int[] b) {
		
		int[] arrayA = a;
		int[] arrayB = b;	
		int[] newArray = {};
		
		if (b.length == 0) {
			
			newArray = a;
			
			return newArray;
		} else if (a.length == 0) {
		
			return newArray;			
		} else {
			
			for (int i = 0; i < arrayA.length; i++) {
				
				for (int j = 0; j < arrayB.length; j++) {
					
					if (arrayA[i] == arrayB[j]) {
						
						final int indexToExclude = i;
						newArray = Arrays.stream(arrayA)
				                .filter(element -> element != arrayA[indexToExclude]) // Example filter condition (even numbers)
				                .toArray();
						

						
					}
					
				}
				
				
			}
			
			for (int k = 0; k < newArray.length; k++) {
				System.out.println(newArray[k]);
			}
			
			return newArray;
		}
		
	}
	
}

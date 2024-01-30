package productMaximumsArray;

import java.util.Arrays;

public class Productmaximumsarray {

    public static void main(String[] args) {
        maxProduct(new int[]{14,29,-28,39,-16,-48}, 4);
    }

    public static long maxProduct(int[] numbers, int sub_size){

        System.out.println(numbers + ", " + sub_size);
        Arrays.sort(numbers);
        long maxProduct = 1;
        for (int i = numbers.length - 1; i >= numbers.length-sub_size ; i-- ){

            maxProduct *= numbers[i];

        }

        return maxProduct; // Do your magic!
    }
}

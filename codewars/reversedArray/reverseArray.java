// https://www.codewars.com/kata/5583090cbe83f4fd8c000051
package reversedArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class reverseArray {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Introduce valor a girar: ");
        long number = input.nextLong();
        System.out.println(Arrays.toString(digitize(number)));
    }

    public static int[] digitize(long n) {  

        int number = (int) n;
        int digitFromNumber = 0;

        if (number == 0) {

            int[] reservedNumber = {0};
            return reservedNumber;

        } else {

            int[] reservedNumber = new int[5];

            for (int i=0; i < reservedNumber.length; i++) {
    
                digitFromNumber = number%10;
                number /=10;
                reservedNumber[i] = digitFromNumber;
            }
            
            return reservedNumber;

        }

    }
  }
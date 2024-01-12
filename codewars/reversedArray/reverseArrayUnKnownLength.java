package reversedArray;
import java.util.Arrays;
import java.util.Scanner;
public class reverseArrayUnKnownLength {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Introduce valor a girar (hasta 10 dígitos por casting posterior a int): ");
        long number = input.nextLong();
        System.out.println(Arrays.toString(digitize(number)));
    }

    // public static int[] digitize(long n) {  

    //     int number = (int) n;
    //     int digitFromNumber = 0;

    //     if (number == 0) {

    //         int[] reservedNumber = {0};
    //         return reservedNumber;

    //     } else {

    //         int[] reservedNumber = {0};

    //         for (int i=0; i < reservedNumber.length; i++) {
                
    //             if (number/ 10 == 0){

    //                 reservedNumber[i] = number%10;
    //                 break;
    //             }

    //             digitFromNumber = number%10;
    //             number /=10;
    //             reservedNumber[i] = digitFromNumber;
    //             reservedNumber = Arrays.copyOf(reservedNumber, i + 2);
    //         }
            
    //         return reservedNumber;

    //     }

    // }
    
    // dealing with manual casting long -> int to pass test array number length >=11.
    
    public static int[] digitize(long n) {  

        long number = n;
        int digitFromNumber = 0;
        int[] reservedNumber = {0};
        if (number == 0) {
            return reservedNumber;
        } else {
            
            for (int i=0; i < reservedNumber.length; i++) {
                
                if (number/ 10 == 0){

                    reservedNumber[i] = (int) number%10;
                    break;
                }

                digitFromNumber = (int) number%10;
                number /=10;
                /* assign isolated digit to its correspondent position 
                in reservedNumber array*/ 
                reservedNumber[i] = digitFromNumber;
                /* create new array by copying the previous array value and increase its dimension (original length 
                equals (i + 1), new length (i+1) + 1*/ 
                reservedNumber = Arrays.copyOf(reservedNumber, i + 2);
            }
            
            return reservedNumber;

        }

    }

    }

  }
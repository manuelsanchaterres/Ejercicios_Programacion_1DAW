
/*Implementar un programa que demani per teclat un número decimal i indiqui si és un número quesi-zero 
(aquells positius o negatius que s'atraquen a zero per menys d'una unitat; tenint en compte que el 0 no se'l considera) 

Alguns nombres que es consideren quasi-zero -0,9995, 0,25, 0,12555;
Alguns nombres que no són quasi-zero -12,5, 0,1, -1;
*/

import java.util.Scanner;

public class Unitat2_Activitat3 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        float decimal;

        System.out.print("Introduzca numero decimal: ");
        
        decimal = input.nextFloat();

        if (decimal > 0 && ((decimal - 1) < 0)) {

            System.out.print("Es quasi-zero: " + decimal);

        } else if (decimal < 0 && ((decimal + 1) < 1 && (decimal + 1) > 0)) {

            System.out.print("Es quasi-zero: " + decimal);

        } else {

            System.out.print("No es quasi-zero: " + decimal);

        }

    }
}


/* Fes un programa que demani quants nombres s’han d’introduïr. ok
Després ha de demanar la introducció de tots els nombres. 
Finalment ha de mostrar per pantalla tots els nombres, un per línia, en l’ordre invers d’introducció. */

import java.util.Arrays;
import java.util.Scanner;

public class Unitat5_Activitat3 {

    public static void main(String[] args) {

        int nombresIntroduir = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Quants de nombres vols introduir? ");
        nombresIntroduir = input.nextInt();
        int[] arrayNombres = new int[nombresIntroduir];

        for (int i=0; i < arrayNombres.length; i++) {

            System.out.print("Introdueix nombre " + (i+1) + " de " + nombresIntroduir + ": ");

            arrayNombres[i] = input.nextInt();

        }

        for (int i = arrayNombres.length - 1; i >= 0; i--){

            System.out.println(arrayNombres[i]);

        }
    }
    
}

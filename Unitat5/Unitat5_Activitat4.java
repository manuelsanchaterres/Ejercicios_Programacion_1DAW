
/* Seguint l’exercici anterior, enlloc de mostrar tots els nombres, mostra només el valor màxim introduït. */

import java.util.Arrays;
import java.util.Scanner;

public class Unitat5_Activitat4 {

    public static void main(String[] args) {

        int nombreIntroduir = 0, mayor = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Quants de nombres vols introduir? ");
        nombreIntroduir = input.nextInt();
        int[] arrayNombres = new int[nombreIntroduir];

        for (int i=0; i < arrayNombres.length; i++) {

            System.out.print("Introdueix nombre " + (i+1) + " de " + nombreIntroduir + ": ");

            arrayNombres[i] = input.nextInt();

        }

        for (int i = arrayNombres.length - 1; i >= 0; i--){

            mayor = arrayNombres[0];
            mayor = arrayNombres[i] > mayor ? arrayNombres[i]: mayor;

        }

        System.out.println("El valor màxim dels introduïts es: " + mayor);
    }
    
}

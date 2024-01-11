
/* Fes un programa que demani la introducció de 5 nombres sencers. 
Després s’han de mostrar els 5 valors, un per línia, seguint l’ordre en que s’han introduït. */

import java.util.Arrays;
import java.util.Scanner;

public class Unitat5_Activitat2 {

    public static void main(String[] args) {

        int nombre = 0;
        int[] arraySencers = new int[5];
        Scanner input = new Scanner(System.in);

        for (int i= 0; i < arraySencers.length; i++) {

            System.out.print("Introdueix nombre: ");
            nombre = input.nextInt();
            arraySencers[i] = nombre;

        }

        for (int i=0; i < arraySencers.length; i++) {

            System.out.println(arraySencers[i]);

        }
    }
    
}

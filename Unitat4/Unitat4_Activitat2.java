
/* Fer una aplicació que demani dos sencers, i a través d'una funció, mostri
tots els nombres que hi ha entre ells de mayor a menor.

 */

import java.util.Scanner;

public class Unitat4_Activitat2 {

    public static void main(String[] args) {

        int numero1, numero2;

        System.out.print("Introduzca numero 1: ");

        Scanner input = new Scanner(System.in);

        numero1 = input.nextInt();

        System.out.print("Introduzca numero 2: ");

        numero2 = input.nextInt();

        mostrarNumerosOrdenados(numero1, numero2);

    
    }

    /* Cada funcion se declara dentro de la clase y fuera de main */
    
    static void mostrarNumerosOrdenados(int numero1, int numero2) {

        if (numero1 > numero2) {

            for(int i=numero1; numero1 >= numero2; i--) {

                System.out.println(i);

                numero1--;

            }

        } else {

            for(int i=numero2; numero2 >= numero1; i--) {

                System.out.println(i);

                numero2--;
                
            }

        }
    }

}

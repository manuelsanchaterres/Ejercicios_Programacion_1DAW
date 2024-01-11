
/* Dissenyar una aplicació amb la funció eco(). L'aplicació demana un número n i
 * repeteix el text "Eco..." n vegades
 */

import java.util.Scanner;

public class Unitat4_Activitat1 {

    public static void main(String[] args) {

        int n;

        System.out.print("Introduzca numero de repeticiones: ");

        Scanner input = new Scanner(System.in);

        n = input.nextInt();

        eco(n);

    
    }

    /* Cada funcion se declara dentro de la clase y fuera de main */
    
    static void eco(int n) {

        if (n <= 0) {

            System.out.println("Número de repeticiones no puede ser negativo o 0");

        } else {

            for (int i= 1; i <= n; i++) {

                System.out.println("Eco... " + i);
            }

        }

    }

}

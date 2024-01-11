/* Función al que se le pasa un número entero y devuelve el número de divisores primos que tiene.*/

package unitat3_activitats_voluntaries;

import java.util.Scanner;

public class unitat3_activitat_voluntaria_2 {

    public static void main(String[] args) {

        int nombre=0, contadorPrimers=0, numeroFactores=0;
        System.out.print("Introdueixi nombre: ");
        Scanner input = new Scanner(System.in);
        nombre = input.nextInt();

        /*Iteración de 1 a n */
        for (int i = 1; i <= nombre; i++) {

             /*Iteración de 1 a i para todo i menor o igual a n */

            for (int j = 1; j <= i; j++) {

                /*Si factor de i es diferente de 1 o de j y el resto de 
                 * i % j és igual a 0, significa que i no es primo.
                 */

                if (j != 1 && j != i && (i % j == 0) ){

                    /*Si se incrementa numeroFactores es porque i modulo j es igual a 0, con lo cual i no es primo */
                   numeroFactores++;

                }

            }

            /*si numero de factores es igual a 0, i sólo tiene como factores 1 e i con lo cual es primo */

            if (numeroFactores == 0) {

                contadorPrimers++;

            }

            numeroFactores = 0;

        }
        
        System.out.println("El resultat de n=" + nombre + " és " + contadorPrimers + ". Entre 1 i " + nombre + " hi ha " + contadorPrimers + " nombres primers.");
    }
}

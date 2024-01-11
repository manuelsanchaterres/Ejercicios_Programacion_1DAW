/* Fes una funció a la que se li passin les hores i minuts de dos instants de temps. 
La funció ha de retornar la quantitat de minuts que han passat entre els dos instants. El prototip de la funció serà: */

package unitat4_activitats_voluntaries;
import java.util.Scanner;

public class Unitat4_Activitat5 {

    public static void main(String[] args) {

        int hores1=0, hores2=0, minuts1=0, minuts2=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Introdueix hores Instant 1 entre 0 y 23: ");
        hores1 = input.nextInt();

        /*Mientras horas o minuts no cumplan con el formato el programa debe
         * volver a pedir la introducción de horas o minutos.
         */

        while (hores1 < 0 || hores1 > 23) {
            
            System.out.print("Introdueix hores Instant 1 entre 0 y 23: ");
            hores1 = input.nextInt();

        }

        System.out.print("Introdueix minuts Instant 1 entre 0 y 59: ");
        minuts1 = input.nextInt();

        while (minuts1 < 0 || minuts1 > 59) {
            
            System.out.print("Introdueix minuts Instant 1 entre 0 y 59: ");
            minuts1 = input.nextInt();

        }

        System.out.print("Introdueix hores Instant 2 entre 0 y 23: ");
        hores2 = input.nextInt();

        while (hores2 < 0 || hores2 > 23) {
            
            System.out.print("Introdueix hores Instant 2 entre 0 y 23: ");
            hores2 = input.nextInt();

        }

        System.out.print("Introdueix minuts Instant 2 entre 0 y 59: ");
        minuts2 = input.nextInt();

        while (minuts2 < 0 || minuts2 > 59) {
            
            System.out.print("Introdueix minuts Instant 2 entre 0 y 59: ");
            minuts2 = input.nextInt();

        }

        System.out.println(calculInstantTemps(hores1, minuts1, hores2, minuts2));

    }

    /* Cada funcion se declara dentro de la clase y fuera de main */
    
    static String calculInstantTemps(int hores1, int minuts1, int hores2, int minuts2) {

        // int diferenciaHores = hores1 > hores2 ? hores1 - hores2 : hores2 - hores1;
        // int diferenciaminuts = minuts1 > minuts2 ? minuts1 - minuts2 : 60 + (minuts1 - minuts2);
        // int quantitatMinuts = (diferenciaHores * 60) + diferenciaminuts;

        int diferenciaHores = 0, diferenciaminuts = 0, quantitatMinuts = 0;

        if (hores1 > hores2) {

            diferenciaHores = hores1 - hores2;

            if (minuts1 > minuts2) {

                diferenciaminuts = minuts1 - minuts2;

            } else {

                diferenciaminuts = 60 + (minuts1 - minuts2);

                diferenciaHores--;
            }

        } else {

            diferenciaHores = hores2 - hores1;

            if (minuts2 > minuts1) {

                diferenciaminuts = minuts2 - minuts1;

            } else {

                diferenciaminuts = 60 + (minuts2 - minuts1);

                diferenciaHores--;

            }

        }


        quantitatMinuts = (diferenciaHores * 60) + diferenciaminuts;

        /* Resolver cuando minuts2 es major a minuts1 (60 + (minuts1-minuts2)) !!!!!! */ 

        return "Han passat " + diferenciaHores + " hores i " + diferenciaminuts + " minuts. Igual a: " + quantitatMinuts + " minuts.";

    }
}

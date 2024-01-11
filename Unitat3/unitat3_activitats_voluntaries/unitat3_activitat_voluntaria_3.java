/* Per a dos nombres a i b, és possible buscar el màxim comú divisor (el nombre més gran que els divideix a tots dos) 
amb un algorisme ineficient, però senzill: des del menor entre a i b, anar cercant de manera decreixent 
el primer nombre que divideix als dos simultàniament amb resta zero. Fes un programa que busqui el MCD de dos nombres.*/

package unitat3_activitats_voluntaries;

import java.util.Scanner;

public class unitat3_activitat_voluntaria_3 {

    public static void main(String[] args) {

        int nombre1=0, nombre2=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Introdueixi nombre 1: ");
        nombre1 = input.nextInt();
        System.out.print("Introdueixi nombre 2: ");
        nombre2 = input.nextInt();

        if (nombre1 >= nombre2) {

            /*Cerca decreixent de valor màxim que divideix els 2 nombres desde i igual al menor valor dels 2 nombres. */
            for (int i = nombre2; nombre2 > 1; i--) {

                if (nombre1 % i == 0 && nombre2 % i == 0) {

                    System.out.println("El MCD de " + nombre1 + " y " + nombre2 + " es igual a: " + i);

                    /*Este return es para que cuando se cumpla la primera vez el condicional el programa salga de dicho if */

                    break;
                }
            }

        } else {

            for (int i = nombre1; nombre1 > 1; i--) {

                if (nombre1 % i == 0 && nombre2 % i == 0) {

                    System.out.println("El MCD de " + nombre1 + " y " + nombre2 + " es igual a: " + i);

                    /*Este return es para que cuando se cumpla la primera vez el condicional el programa salga de dicho if */

                    break;
                }
            }

        }



    }
}


/* Demanar un nombre i calcular el seu factorial */

import java.util.Scanner;

public class Unitat3_Activitat7 {

    public static void main(String[] args) {

        int nombre, factorial=0;

        Scanner input = new Scanner(System.in);

        System.out.print("Introdueixi nombre: ");

        nombre = (int) input.nextInt();

        factorial = nombre;

        for (int i = nombre; i > 1; i--) {

            factorial *= (i-1);

        }

        if (factorial == 0) {

            System.out.println("Factorial de " + nombre + " es igual a 1.");

        } else if (factorial > 0) {


            System.out.println("Factorial de " + nombre + " es igual a " + factorial );

        } else {

            System.out.println("El nombre no pot ser negatiu" );

        }


    }
}

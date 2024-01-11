
/* Escriu un programa que demani un nombre i mostri tots els seus divisors. (Els divisors d’un nombre són els que donen la divisió exacta. Per tant, l’exemple:

Introdueix un nombre: 200
Els divisors de 200 són: 1 2 4 5 8 10 20 25 40 50 100 200

*/

import java.util.Arrays;
import java.util.Scanner;

public class activitat10 {

    public static void main(String[] args) {

        int nombre = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Introdueix un nombre: ");
        nombre = input.nextInt();

        mostrarDivisors(nombre);


    }

    static void mostrarDivisors(int nombre) {

        for (int i = 1; i <= nombre ; i++){
            
            if (nombre % i == 0) {

                if (i == nombre) {

                    System.out.print(i + ".");

                } else {

                    System.out.print(i + " ");

                }

            }

        }


    }


}

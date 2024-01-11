
/* Implementar el joc el numero secret.
 * El programa estableix un nombre aleatori (no el mostra).
 * Després anirà demanant a l'usuari que introdueixi un nombre i 
 * anirà indicant si el nombre que han de trobar és major o menor.
 */

import java.util.Scanner;

public class Unitat3_Activitat3 {

    public static void main(String[] args) {

        int numSecret, numUsuari;

        Scanner input = new Scanner(System.in);

        numSecret = (int) (Math.random()*100 + 1); /* El +1 es para forzar que el valor minimo
        de numSecret sea igual 1 */

        System.out.print("Introdueixi nombre a endevinar: ");

        numUsuari = input.nextInt();

        System.out.println("Nombre Secret: " +  numSecret);

        while (numSecret != numUsuari) {
            
            // if (numUsuari > numSecret ) {

            //     System.out.println("Nombre Secret es menor a " + numUsuari);

            // } else {

            //     System.out.println("Nombre Secret es major a " + numUsuari);


            // }

            System.out.println(numUsuari > numSecret ? "Nombre Secret es menor a " + numUsuari : "Nombre Secret es major a " + numUsuari);

            System.out.print("Introdueixi nombre a endevinar: ");

            numUsuari = input.nextInt();

        }

        System.out.print("Enhorabona has encertat el nombre secret: " + numSecret);

        System.exit(0);
        
    }
}

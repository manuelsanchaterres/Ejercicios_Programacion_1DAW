
/* Demanar 10 nombres sencers per teclat i mostrar la mitja. */

import java.util.Scanner;

public class Unitat3_Activitat6 {

    public static void main(String[] args) {

        int entero, contador=0, sumaEnteros=0;

        Scanner input = new Scanner(System.in);


        while (contador < 5) {


            System.out.print("Introdueixi nombre: ");

            entero = (int) input.nextInt(); /* Per convertir a sencer si l'usuari tecletja 
            un valor float o double */

            sumaEnteros += entero;

            contador++;

            // System.out.println(entero);
            // System.out.println(contador);
            // System.out.println(sumaEnteros);

        }

        System.out.println("Mitja: " + (float) sumaEnteros/contador);

    }
}

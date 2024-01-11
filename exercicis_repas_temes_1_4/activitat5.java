
/* Fes un programa que demani dos nombres i escrigui la suma de sencers des del primer fins al segon. 
Per exemple: 
Escriu un nombre: 30
Escriu un nombre major que 30: 32

La suma de 30 fins a 32 és: 93

*/

import java.util.Arrays;
import java.util.Scanner;

public class activitat5 {

    public static void main(String[] args) {

        int nombre1=0, nombre2=0, suma=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Escriu un nombre: ");
        nombre1 = input.nextInt();
        System.out.print("Escriu un nombre major que " + nombre1 + ": ");
        nombre2 = input.nextInt();

        while (nombre2 <= nombre1) {
            System.out.print("Escriu un nombre major que " + nombre1 + ": ");
            nombre2 = input.nextInt();
        }

        for (int i= nombre1; i <= nombre2; i++) {
            suma += i;
        }

        System.out.println("La suma de " + nombre1 + " fins a " + nombre2 + " és: " + suma);



    }
}

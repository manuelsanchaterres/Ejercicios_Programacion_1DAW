
/* Fes una funció que comprovi si un nombre és senar o no.

*/

import java.util.Arrays;
import java.util.Scanner;

public class activitat11 {

    public static void main(String[] args) {

        int nombre = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Introdueix un nombre: ");
        nombre = input.nextInt();

        System.out.print(nombre + " es " + isSenar(nombre));


    }

    static String isSenar(int nombre) {


        return nombre % 2 != 0 ? "senar" : "parell";

    }
}

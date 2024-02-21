
/* Fer una aplicació que demani el nombre d'hores, minuts i segons. Una funció ha de comprovar 
si els valors introduits són correctes. És a dir, que les hores sigui màxim 23, minuts i segons màxim 59.

 */

// import java.text.DecimalFormat;

import java.util.Scanner;

public class Unitat4_Activitat5 {

    public static void main(String[] args) {

        int hores=0, minuts=0, segons=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Introdueix hores: ");
        hores = input.nextInt();
        System.out.print("Introdueix minuts: ");
        minuts = input.nextInt();
        System.out.print("Introdueix segons: ");
        segons = input.nextInt();

        while (!isValidHores(hores, minuts, segons)) {

            System.out.println("Format d'hora incorrecte: ");
            System.out.print("Introdueix hores: ");
            hores = input.nextInt();
            System.out.print("Introdueix minuts: ");
            minuts = input.nextInt();
            System.out.print("Introdueix segons: ");
            segons = input.nextInt();

        }

        System.out.print("Format d'hora correcte: ");

        input.close();
    }

    static boolean isValidHores (int hores, int minuts, int segons) {
        if (hores < 0 || hores > 23) {
            return false;
        }

        if (minuts < 0 || minuts > 59) {
            return false;
        }

        if (segons < 0 || segons > 59) {
            return false;
        }

        return true;

    }

}

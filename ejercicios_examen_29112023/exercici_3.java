/* Fes una funció esParell que rebi per paràmetre un nombre sencer i 
retorni un booleà true si és parell o un booleà false si no ho és. */

import java.util.Scanner;
public class exercici_3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Introdueix nombre sencer: ");
        int nombre = input.nextInt();

        System.out.print(esParell(nombre));
    }

    static boolean esParell(int nombre) {
        boolean esParell = false;

        esParell = nombre % 2 == 0 ? true: false;

        return esParell;
    }
}

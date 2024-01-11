/* Fes una funció esParell que rebi per paràmetre un nombre sencer i 
retorni un booleà true si és parell o un booleà false si no ho és. */

import java.util.Scanner;
public class exercici_4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Introdueix nombre sencer positiu: ");
        int nombre = input.nextInt();

        while (nombre < 0) {
            System.out.print("Introdueix nombre sencer positiu: ");
            nombre = input.nextInt();
        }

        primersNombresParells(nombre);
    }

    static void primersNombresParells (int nombre) {
        
        for(int i=0; i <= nombre; i++) {

            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}

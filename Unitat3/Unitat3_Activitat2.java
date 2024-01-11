
/* Implementar una aplicació que calculi dades estadístiques dels alumnes del centre.
 * El programa ha de permetre la introducció de dades fins que un d'ells sigui negatiu.
 * Quan acabi la introducció de dades, s'ha de mostrar: la suma de totes les edats
 * introduïdes, la mitja d'edat, el nombre d'alumnes i quants n'hi ha majors d'edat.
 */

import java.util.Scanner;

public class Unitat3_Activitat2 {

    public static void main(String[] args) {

        int edat, nombreAlumnes = 0, sumaEdats = 0, majorsEdat = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Introdueixi edat alumne: ");

        edat = input.nextInt();

        while (edat >= 0) {
            
            sumaEdats += edat;
            nombreAlumnes++;

            if (edat >= 18) {

                majorsEdat +=1;
            }

            System.out.print("Introdueixi edat alumne: ");

            edat = input.nextInt();

        }

        System.out.println("Suma edats: " + sumaEdats);

        System.out.println("Nombre Alumnes: " + nombreAlumnes);

        System.out.println("Mitjana d'edat: " + (nombreAlumnes == 0 ? 0 : (float) sumaEdats/nombreAlumnes));

        System.out.println("Majors d'edat: " + majorsEdat);

        System.exit(0);
        
    }
}

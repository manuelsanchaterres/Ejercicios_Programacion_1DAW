
/* Fer una aplicació per estadístiques del professor. Primer demana el nombre
 * d'alumnes del grup, després demana (una per una) les notes de tots el alumnes i,
 * finalment, mostra per pantalla: el nombre de suspesos, el nombre d'aprovats i nota mitja.
 */
/*DAR UNA VUELTA AL PROGRAMA PARA QUE VUELVA A PREGUNTAR AL USUARIO SI LA NOTA ES NEGATIVA */

import java.util.Scanner;

public class Unitat3_Activitat8 {

    public static void main(String[] args) {

        int nombreAlumnes=0, suspesos=0, aprovats=0, nombreInputs=0;
        float notaAlumne=0, sumaNotes=0;

        Scanner input = new Scanner(System.in);

        System.out.print("Introdueixi nombre Alumnes del seu grup: ");

        nombreAlumnes = (int) input.nextInt();
        
        System.out.print("Introdueixi nota de cada alumne: ");

        notaAlumne = (int) input.nextFloat();


        while (nombreAlumnes > nombreInputs) {

            System.out.print("Introdueixi nota de cada alumne: ");

            notaAlumne = (int) input.nextFloat();

            nombreInputs++;

            sumaNotes += notaAlumne;

            if (notaAlumne >= 5 && notaAlumne <= 10) {

                aprovats++;

            } else if (nombreAlumnes >= 0 && notaAlumne < 5) {

                suspesos++;

            } else {

                System.out.println("Nota no pot ser negativa o major a 10: ");
            }

            System.out.println("Et queden per introduir " + (nombreAlumnes - nombreInputs) + " notes.");

        }

        System.out.println("Has introduit les notes de tots els " + nombreAlumnes + " alumnes.");
        System.out.println("Nombre de Suspesos: " + suspesos);
        System.out.println("Nombre de d'Aprovats: " + aprovats);
        System.out.println("Mitja Notes: " + (nombreAlumnes > 0 ? sumaNotes/nombreAlumnes: 0));
    }
}

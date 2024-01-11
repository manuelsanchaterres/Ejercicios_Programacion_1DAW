
/* Dissenyar una aplicació per aprendre a comptar.
Es demana a l'usuari un nombre n i mostrarà tots el nombres entre el 1 i el n.
 */

import java.util.Scanner;

public class Unitat3_Activitat4 {

    public static void main(String[] args) {

        int n;

        System.out.print("Introdueix un nombre: ");

        Scanner input = new Scanner(System.in);
        
        n = input.nextInt();

        if (n > 0) {

            for ( int i=1; i <= n; i++ ) {


                System.out.println(i);

            }

        } else {

            while (n < 0) {

                System.out.print("Introdueix un nombre: ");

                n = input.nextInt();

            }

        }
    }
}

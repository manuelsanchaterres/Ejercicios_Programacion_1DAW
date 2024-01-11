/* Crea una funció nombresParells(int n) que mostri per pantalla els primers n nombres parells. */

package unitat4_activitats_voluntaries;
import java.util.Scanner;

public class Unitat4_Activitat3 {

    public static void main(String[] args) {

        int n=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Quans de nombres parells vols mostrar? ");
        n = input.nextInt();

        while (n <= 0) {
            System.out.print("Quans de nombres parells vols mostrar? ");
            n = input.nextInt();
        }

       nombresParells(n);
    }

    /* Cada funcion se declara dentro de la clase y fuera de main */
    
    static void nombresParells(int n) {

        int contador = 0;

        for (int i=0; contador < n ; i++) {

            if ((i % 2) == 0) {

                System.out.println(i);
                contador++;

            }
        }
    }

}

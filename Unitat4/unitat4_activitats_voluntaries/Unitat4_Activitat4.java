/* Fes una funció que rebi com a paràmetres tres nombres sencers: dies, hores i minuts, 
i retorni el nombre de segons totals que existeixen a les dades d’entrada. */

package unitat4_activitats_voluntaries;
import java.util.Scanner;

public class Unitat4_Activitat4 {

    public static void main(String[] args) {

        int dies=0, hores=0, minuts=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Introdudeix nombres dies major o igual a 0: ");
        dies = input.nextInt();
        System.out.print("Introdudeix nombre d'hores major o igual a 0: ");
        hores = input.nextInt();
        System.out.print("Introdudeix nombre de minuts major o igual a 0: ");
        minuts = input.nextInt();

        while (dies < 0 || hores < 0 || minuts < 0) {

            System.out.println("Introdueix dies, hores i minuts major o igual a 0: ");
            System.out.println("Introdudeix nombres dies major o igual a 0: ");
            dies = input.nextInt();
            System.out.println("Introdudeix nombre d'hores major o igual a 0: ");
            hores = input.nextInt();
            System.out.println("Introdudeix nombre de minuts major o igual a 0: ");
            minuts = input.nextInt();
        }

       System.out.println( dies + " dies " + hores + " hores y " + minuts + " minuts, son: " + conversorSegons(dies, hores, minuts) + " segons.");
    }

    /* Cada funcion se declara dentro de la clase y fuera de main */
    
    static int conversorSegons(int dies, int hores, int minuts) {

        int totalSegons = (dies * 24 *3600) + (hores*3600) +(minuts * 60);

        return totalSegons;
    }

}

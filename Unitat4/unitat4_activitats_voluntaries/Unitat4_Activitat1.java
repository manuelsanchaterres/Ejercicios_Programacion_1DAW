/* Fes una funció que calculi i mostri la superfície i el volum d’una esfera:
superficie = 4· radi2
volum = 43·radi3 */

package unitat4_activitats_voluntaries;
import java.util.Scanner;

public class Unitat4_Activitat1 {

    public static void main(String[] args) {

        float radi;

        System.out.print("Introdueix radi major o igual a 0: ");

        Scanner input = new Scanner(System.in);

        radi = input.nextFloat();

        while (radi < 0) {

            System.out.print("Introdueix radi major o igual a 0: ");
            radi = input.nextFloat();
        }

        calculSuperFicieAreaEsfera(radi);
        input.close();
    }

    /* Cada funcion se declara dentro de la clase y fuera de main */
    
    static void calculSuperFicieAreaEsfera(float radi) {

        double superficieEsfera = 4*Math.PI*Math.pow(radi, 2);
        double volumEsfera = (4*Math.PI*Math.pow(radi, 3))/3;

       System.out.println("La superficie de l'esfera es igual a: " + superficieEsfera + " i el volum es igual a: " + volumEsfera);
    }

}

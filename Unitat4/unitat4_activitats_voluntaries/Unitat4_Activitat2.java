/* Fes una funció que calculi i mostri la superfície i el volum d’una esfera:
superficie = 4· radi2
volum = 43·radi3 */

package unitat4_activitats_voluntaries;
import java.util.Scanner;

public class Unitat4_Activitat2 {

    public static void main(String[] args) {

        double x1, y1, x2, y2;
        Scanner input = new Scanner(System.in);
        System.out.print("Introdueix valor x1: ");
        x1 = input.nextDouble();
        System.out.print("Introdueix valor y1: ");
        y1 = input.nextDouble();
        System.out.print("Introdueix valor x2: ");
        x2 = input.nextDouble();
        System.out.print("Introdueix valor y2: ");
        y2 = input.nextDouble();
        System.out.println(distancia(x1,y1,x2,y2));
        input.close();
    
    }

    /* Cada funcion se declara dentro de la clase y fuera de main */
    
    static double distancia(double x1, double y1, double x2, double y2) {

        double primerSumant = Math.pow(x1-x2, 2);
        double segonSumant = Math.pow(y1-y2, 2);

        double distancia = Math.sqrt(primerSumant + segonSumant);

        return distancia;
    }

}

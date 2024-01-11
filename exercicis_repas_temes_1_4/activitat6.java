
/* Escriu un programa que demani l’altura i l’ample d’un rectangle i el dibuixi. Per exemple:
Escriu la base: 5
Escriu l’altura: 3

*****
*****
*****


*/

import java.util.Arrays;
import java.util.Scanner;

public class activitat6 {

    public static void main(String[] args) {

        int alçada=0, ample=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Introdueix l'alçada del rectangle: ");
        alçada = input.nextInt();
        System.out.print("Introdueix l'ample del rectangle: ");
        ample = input.nextInt();

        while (alçada <= 0 || ample <= 0) {
            System.out.println("L'alçada i l'ample del rectangle han d'èsser major a 0.");
            System.out.print("Introdueix l'alçada del rectangle: ");
            alçada = input.nextInt();
            System.out.print("Introdueix l'ample del rectangle: ");
            ample = input.nextInt();
        }

        dibuixarRectangle(alçada, ample);


    }

    static void dibuixarRectangle(int alçada, int ample) {

        for (int i = 1; i <= alçada; i++){

            for (int j = 1; j <= ample; j++) {

                System.out.print("*");

            }

            System.out.println(" ");
        }
    }


}

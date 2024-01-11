
/* Escriu un programa que demani l’altura d’un triangle i el dibuixi. Per exemple:

Escriu l’altura: 4

****
***
**
*


*/

import java.util.Arrays;
import java.util.Scanner;

public class activitat8 {

    public static void main(String[] args) {

        int alçada = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Introdueix l'alçada del triangle: ");
        alçada = input.nextInt();

        while (alçada <= 0) {
            System.out.println("L'alçada del triangle ha d'èsser major a 0.");
            System.out.print("Introdueix l'alçada del rectangle: ");
            alçada = input.nextInt();
        }

        dibuixarTriangle(alçada);


    }

    static void dibuixarTriangle(int alçada) {

        for (int i = alçada; i >=1; i--){

            String ampleString = "";

            for (int j = 1; j <= i; j++) {

                ampleString += "\u002A";

            }

            System.out.println(ampleString);
        }
    }


}

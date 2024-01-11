
/* Escriu un programa que demani l’altura d’un triangle i dibuixi la següent figura. Per exemple:

Escriu l’altura: 4

*
**
***
****
***
**
*



*/

import java.util.Arrays;
import java.util.Scanner;

public class activitat9 {

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


        for (int i = 1; i <= alçada ; i++){

            String stringTriangle = "*";
            
            for (int j = 1; j <= i; j++) {

                stringTriangle += "*";

            }

            System.out.println(stringTriangle);
        }

        for (int i = alçada - 1; i >= 1 ; i--){

            String stringTriangle = "*";

            for (int j = 1; j <= i; j++) {

                stringTriangle += "*";

            }

            System.out.println(stringTriangle);
        }

    }


}

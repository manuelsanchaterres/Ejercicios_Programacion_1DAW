
/* Fes una funció de sobrecàrrega sobre la funció de l’exercici 12, 
que rebi un paràmetre booleà adicional i mostri tots els nombres parells que hi ha entre els dos nombres d’entrada.

*/

import java.util.Arrays;
import java.util.Scanner;

public class activitat13 {

    public static void main(String[] args) {

        int nombre1 = 0, nombre2=0;
        boolean senar = true;
        Scanner input = new Scanner(System.in);
        System.out.print("Introdueix primer nombre: ");
        nombre1 = input.nextInt();
        System.out.print("Introdueix segon nombre: ");
        nombre2 = input.nextInt();
        mostrarSenars(nombre1, nombre2, senar);

    }

    static void mostrarSenars(int nombre1, int nombre2) {


        int mayor = nombre1 > nombre2 ? nombre1 : nombre2;
        int menor = nombre1 < nombre2 ? nombre1 : nombre2;


        for (int i = menor; i <= mayor; i++){

           if ( i == menor || i == mayor) {

            System.out.print(i + " ");

           }

           if (i != menor && i != mayor && (i % 2 != 0)) {

            System.out.print(i + " ");
            
           }

        }


    }

    static void mostrarSenars(int nombre1, int nombre2, boolean senar) {


        int mayor = nombre1 > nombre2 ? nombre1 : nombre2;
        int menor = nombre1 < nombre2 ? nombre1 : nombre2;


        for (int i = menor; i <= mayor; i++){

            if ( i == menor || i == mayor) {

                System.out.print(i + " ");

            }

            if (i != menor && i != mayor && (i % 2 == 0)) {

                senar = false;

                if (!senar) {

                    System.out.print(i + " ");
                
                }

            }




        }


    }
}

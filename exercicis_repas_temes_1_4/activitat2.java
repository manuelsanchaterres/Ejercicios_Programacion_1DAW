
/* Demana a l’usuari 5 nombres i digues si estan en ordre creixent, decreixent o desordenats. */

import java.util.Arrays;
import java.util.Scanner;

public class activitat2 {

    public static void main(String[] args) {

        double[] arrayNombres = new double[5];
        double nombre=0;
        boolean creixent = true;
        Scanner input = new Scanner(System.in);

        for(int i= 0; i < arrayNombres.length; i++){

            System.out.print("Introdueix nombre " + (i+1) + " de " + arrayNombres.length + ": ");

            arrayNombres[i] = input.nextDouble();
            
            if (i >=1) {

                if (arrayNombres[i] < arrayNombres[i-1]) {

                    creixent = false;

                }
            }



        }

        if (creixent) {

            System.out.println("creixent");

        } else if (!creixent) {

            /* NO ES CORRECTA LA LÓGICA PARA DESORDENADOS */
           
            

            System.out.println("decreixent");

        }

    }
}

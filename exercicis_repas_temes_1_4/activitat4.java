
/* Demana a l’usuari tres nombres. Després demana a l’usuari un quart nombre i 
determina si aquest darrer és divisor dels altres tres nombres. */

import java.util.Arrays;
import java.util.Scanner;

public class activitat4 {

    public static void main(String[] args) {

        double[] arrayNombres = new double[3];
        Scanner input = new Scanner(System.in);
        double nombre=0;

        for (int i=0; i < arrayNombres.length; i++) {

            System.out.print("Introdueix nombre " + (i+1) + " de " + arrayNombres.length + ": ");
            nombre = input.nextDouble();
            arrayNombres[i] = nombre;
        }

        System.out.print("Introdueix nombre per calcular divisor: ");
        nombre = input.nextDouble();

        isDivisor(arrayNombres, nombre);
    }

    static void isDivisor(double[] arrayNombres, double nombre) {

        for (int i=0; i < arrayNombres.length; i++) {

            if (arrayNombres[i] % nombre == 0) {

                System.out.println(arrayNombres[i] + " és divisor de " + nombre);

            } else {

                System.out.println(arrayNombres[i] + " no és divisor de " + nombre);
            }
        }

    }
}

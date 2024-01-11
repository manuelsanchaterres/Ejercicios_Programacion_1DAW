
/* Demana a l’usuari 5 nombres i determina quin és major i quin és menor. */

import java.util.Arrays;
import java.util.Scanner;
public class activitat1 {

    public static void main(String[] args) {

        double[] arrayNombres = new double[3];
        double major = 0, menor = 0;
        Scanner input = new Scanner(System.in);

        for(int i= 0; i < arrayNombres.length; i++){

            System.out.print("Introdueix nombre " + (i+1) + " de " + arrayNombres.length + ": ");

            arrayNombres[i] = input.nextDouble();
            major = arrayNombres[0];
            major = arrayNombres[i] > major ? arrayNombres[i]: major;

            menor = arrayNombres[i] < menor ? arrayNombres[i]: menor;

        }

        System.out.println("El nombre major es " + major + " i el menor es " + menor + ".");


    }
}


/* Fes una funció que mostri per pantalla l'àrea (2π r h + 2π r²) O el volum d'un cilindre (π r² h).
Per distingir un cas de l'altre s'inclou com a paràmetre un número: si val 1 calcula
l'àrea, si val 2, calcula el volum. A més, a la funció s'ha de passar el radi de la base i l'altura.

 */

// import java.text.DecimalFormat;

import java.util.Scanner;

public class Unitat4_Activitat3 {

    public static void main(String[] args) {

        byte areaVolum;
        double radi, altura;

        Scanner input = new Scanner(System.in);

        System.out.print("Introdueixi 1 si vol calcular l'àrea o 2 si vol calcular el volum del cilindre: ");

        areaVolum = input.nextByte();

        if (areaVolum != 1 && areaVolum != 2 ) {

            System.out.println("Només pots introduir valor 1 Àrea o valor 2 Volum");

            System.out.print("Introdueixi 1 si vol calcular l'àrea o 2 si vol calcular el volum del cilindre: ");

            areaVolum = input.nextByte();

        }

        System.out.print("Introdueixi el radi del cilindre: ");

        radi = input.nextFloat();

        System.out.print("Introdueixi el l'alçada del cilindre: ");

        altura = input.nextFloat();

        if (radi <=0 || altura <=0 ) {


            System.out.print("El radi i l'altura han de ser major a 0");

        } else {

            calculAreaVolum(areaVolum,radi,altura);

        }


    
    }

    static void calculAreaVolum(byte areaVolum, double radi, double altura) {

        double area=0, volum=0;

        if (areaVolum == 1) {

            area = (2*Math.PI*radi*altura) 
            + (2*Math.PI*Math.pow(radi, 2));

        } else {

            volum = Math.PI*Math.pow(radi, 2)*altura;

        }

        System.out.println(areaVolum == 1 ? "Àrea del cilindre es igual a: " + area : "Volum del cilindre es igual a: " + volum);

        /* Area y Volum formateados a 2 posiciones decimales */

        // System.out.println(areaVolum == 1 ? "Àrea del cilindre es igual a: " + new DecimalFormat("#.##").format(area) : "Volum del cilindre es igual a: " + new DecimalFormat("#.##").format(volum));

    }

}

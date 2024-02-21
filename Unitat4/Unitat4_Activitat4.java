
/* 

    Dissenyar una funció que rebi dos valors sencers i retorni el valor màxim d'ambdós.

 */

// import java.text.DecimalFormat;

import java.util.Scanner;

public class Unitat4_Activitat4 {

    public static void main(String[] args) {

        float nombre1=0, nombre2=0;

        Scanner input = new Scanner(System.in);

        System.out.print("Introdueixi nombre 1: ");

        nombre1 = input.nextFloat();

        System.out.print("Introdueixi nombre 2: ");

        nombre2 = input.nextFloat();

        System.out.println(valorMaxim(nombre1, nombre2));
        input.close();
    }

    static float valorMaxim(float nombre1, float nombre2) {

        return nombre1 > nombre2 ? nombre1 : nombre2;
        
    }

}

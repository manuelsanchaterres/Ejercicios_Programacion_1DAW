/* Demanar dos números i mostrar-los ordenats. Utilitza l'operador ternari i no el condicional if - else */

import java.util.Scanner;


public class Unitat2_Activitat4 {
    
    public static void main(String[] args) {
        
        float numero1, numero2;
        String resposta;
        Scanner input = new Scanner(System.in);

        System.out.print("Introduzca Primer Numero: ");

        numero1 = input.nextFloat();

        System.out.print("Introduzca Segundo Numero: ");

        numero2 = input.nextFloat();


        resposta = (numero1 > numero2) ? "numero1: " + numero1 + " mayor que " + " numero2: " + numero2: "numero2: " + numero2 + " mayor que " + " numero1: " + numero1;
        
        System.out.println(resposta);


    }
}

/* Demanar a l’usuari un número entre l’1 i el 7. Mostrar el dia de la setmana corresponent. P.E: 1 -> dilluns, 6 -> dissabte */

import java.util.Scanner;

public class Unitat2_Activitat7 {
    
    public static void main(String[] args) {
        
        byte numero;

        Scanner input = new Scanner(System.in);

        System.out.print("Introduzca un numero entero entre 1 y 7, ambos incluidos: ");

        numero = input.nextByte();

        if (numero > 7 || numero < 1) {

            System.out.print("Sólo se permiten valores entre 1 y 7, ambos incluídos.");

        } else {

            switch (numero) {

                case 1:
                    
                    System.out.println("Dilluns");

                    break;

                case 2:
                    
                    System.out.println("Dimarts");

                    break;

                case 3:
                    
                    System.out.println("Dimecres");

                    break;
            
                case 4:
                    
                    System.out.println("Dijous");

                    break;
            
                case 5:
                    
                    System.out.println("Divendres");

                    break;
            
                case 6:
                    
                    System.out.println("Dissabte");

                    break;
            
                case 7:
                    
                    System.out.println("Diumenge");

                    break;
            
            
            
                // default:
                //     break;
            }

        }
    }
}

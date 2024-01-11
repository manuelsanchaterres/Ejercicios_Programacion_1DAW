/* Escriu un programa que incrementi l’hora d’un rellotge. Es demana per teclat l’hora (0-23), els minuts (0-59) i els segons (0-59)  així com 
el nombre de segons a incrementar a la hora introduïda (no n'hi ha limit d'increment de segons).
L’aplicació mostrarà la nova hora en format 24 hores*/

package unitat3_activitats_voluntaries;

import java.util.Scanner;

public class unitat3_prueba_soluciones {



    public static void main(String[] args) { 
        
        Scanner sc = new Scanner(System.in); System.out.println("Escriu un numero:"); 
        int num = sc.nextInt(); 
        while (num != 0) { 
            int unidadBinaria = num % 2; 
            num /= 2; 
            System.out.print(unidadBinaria);
        }
    }
}

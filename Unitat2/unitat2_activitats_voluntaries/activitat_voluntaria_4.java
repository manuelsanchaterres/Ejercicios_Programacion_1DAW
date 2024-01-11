/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package unitat2_activitats_voluntaries;

import java.util.Scanner;

/**
 *
 * @author manue
 */

 /* El DNI consta d’un sencer de 8 dígits seguit d’una lletra que s’obté a partir del nombre de la següent forma:
lletra = numeroDNI % 23
A partir d’aquest valor, es determina la lletra seguint aquesta taula:

Fes una aplicació que donat un número de DNI calculi la lletra que correspon. Observa que un número de 8 digits està dins el rang de l’int. */

public class activitat_voluntaria_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // TODO code application logic here

        int numeroDNI, resto;
        char lletra = ' ';
        Scanner input = new Scanner(System.in);
        System.out.print("Introduzca su numero de DNI: ");
        numeroDNI = input.nextInt();

        
        if ( numeroDNI < 00000000 || numeroDNI > 99999999) { /* Verificamos que la longitud del DNI sea de 8 dígitos */

            System.out.println("La longitud de su DNI debe ser de 8 dígitos");
            
        } else if (numeroDNI < 0 ) { /* Verificamos que el DNI no sea negativo */

            System.out.println("Su DNI no puede ser un número negativo");

        } else {

            resto = numeroDNI % 23;

            switch (resto) {
                
                case 0 -> lletra = 'T';

                case 1-> lletra = 'R';

                case 2-> lletra = 'W';

                case 3-> lletra = 'A';

                case 4-> lletra = 'G';

                case 5-> lletra = 'M';

                case 6-> lletra = 'Y';

                case 7-> lletra = 'F';

                case 8-> lletra = 'P';

                case 9-> lletra = 'D';

                case 10-> lletra = 'X';

                case 11-> lletra = 'B';

                case 12-> lletra = 'N';

                case 13-> lletra = 'J';

                case 14-> lletra = 'Z';

                case 15-> lletra = 'S';

                case 16-> lletra = 'Q';

                case 17-> lletra = 'V';

                case 18-> lletra = 'H';

                case 19-> lletra = 'L';

                case 20-> lletra = 'C';

                case 21-> lletra = 'K';
                
                case 22-> lletra = 'E';
            }

            System.out.println(String.format("DNI Completo: %d%c", numeroDNI,lletra));

        }
        

    }
        
    
}

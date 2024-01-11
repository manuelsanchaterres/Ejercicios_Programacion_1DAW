
/*Demanar una nota sencera de 0 a 10 i mostrar-la de la següent manera: 
insuficient (0 - 4), Suficient (5), Bé (6), Notable (7 - 8), Excel·lent (9 - 10). CON SWITCH*/

import java.util.Scanner;

public class Unitat2_Activitat6 {

    public static void main(String[] args) {
        
        byte nota;
        Scanner input = new Scanner(System.in);

        System.out.print("Introduzca Nota Entre 0 y 10: ");

        nota = input.nextByte();

        /*validar que nota es menor a 10 */

        if (nota > 10 || nota < 0) {

            System.out.println("La nota no puede ser mayor a 10 o Negativa");

        } else {

            switch (nota) {

                case 0,1,2,3,4:
                    
                    System.out.println("Insuficient");

                    break;
                case 5:

                    System.out.println("Suficient");

                    break;
                
                case 6:

                    System.out.println("Be");

                    break;

                case 7,8:

                    System.out.println("Notable");

                    break;

                case 9,10:

                    System.out.println("Excel·lent");

                    break;
                    
                // default:

                //     break;
            }
        }
    }
}

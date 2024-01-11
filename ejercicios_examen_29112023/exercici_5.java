/* Fes una funció menu que mostri el següent menú per pantalla i retorni la opció escollida per l’usuari en format nombre sencer:
Tria una de les següents opcions:
1. Decimal a binari
2. Binari a decimal
3. És parell?
4. Calcular parells de 0 fins a n
0. Sortir
 */

import java.util.Scanner;
public class exercici_5 {

    public static void main(String[] args) {

        System.out.println("Has triat opció: " + menu());
    }

    static int menu () {

        Scanner input = new Scanner(System.in);
        System.out.println("Tria una de les següents opcions:");
        System.out.println("1. Decimal a binari");
        System.out.println("2. Binari a decimal");
        System.out.println("3. És parell?");
        System.out.println("4. Calcular parells de 0 fins a n");
        System.out.println("0. Sortir");
        System.out.print("Quina opció vols triar? ");
        int opcio = input.nextInt();

        return opcio;
    }
}

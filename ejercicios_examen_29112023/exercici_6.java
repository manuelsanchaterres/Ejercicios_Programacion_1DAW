/* Implementa el main, que consisteix en:
- Mostrar el menu principal, si l’usuari introdueix un 0, el programa acaba, 
si introdueix una opció invàlida se’l informa i se li torna a mostrar el menú.
- Demana les dades necessàries per a executar la funció que correspon fent ús dels exercicis anteriors.
- Torna a mostrar el menu principal.
 */
import java.util.Scanner;
public class exercici_6 {

    public static void main(String[] args) {      

        int opcioIntroduïda = menu();

        while (!(opcioIntroduïda >= 0 && opcioIntroduïda <= 4)) {

            System.out.println("OPCIÓ NO VÀLIDA.");
            opcioIntroduïda = menu();
        }


        if (opcioIntroduïda == 0 ) {

            System.exit(0);

        }

        System.out.print("Has introduït opció: " + opcioIntroduïda);
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

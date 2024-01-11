
/* Fes una funció decimalBinari que rebi per paràmetre un nombre sencer decimal 
i el mostri per pantalla en binari. Amb una xifra per línia i pot estar invertit.  
Assumeix que el nombre que es passa per paràmetre sempre és positiu. */
import java.util.Scanner;
public class exercici_1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Introdueix nombre sencer positiu: ");
        int nombre = input.nextInt();
        // VALIDACIÓ INPUT SENCER I POSITIU

        while (nombre < 0) {

            System.out.print("Introdueix nombre sencer positiu: ");
            nombre = input.nextInt();
        }

        // BUCLE CÀLCUL DIGIT BINARI


        decimalBinari(nombre);


    }

    static void decimalBinari(int nombre) {
        
        int digitBinari, contador=0, nombreBinari=0;

        while (nombre > 0) {
            
            digitBinari = nombre % 2; // ES RESTO DE NOMBRE ENS DONA EL DIGIT BINARI A CADA ITERACIÓ
            nombreBinari += (digitBinari*Math.pow(10, contador));
            contador++; // A CADA VUELTA DE BUCLE INCREMENTAMOS EN UN 1 EL CONTADOR PARA LA CONVERSIÓN A DECIMAL
            nombre /= 2; //DIVIDIM NOMBRE ENTRE 2 A CADA ITERACIÓS
        }

        System.out.println(nombreBinari);
    }
}


/* Fes una funció que rebi per paràmetre dues taules, la primera amb 6 nombres compresos entre 0 i 99, 
representant una aposta de la Primitiva. La segona, també de 6 nombres, amb els nombres guanyadors. 
La funció ha de retornar el número d’encerts. */

import java.util.Arrays;
import java.util.Scanner;

public class Unitat5_Activitat6 {

    public static void main(String[] args) {

        // int nombreAleatori = 0;
        // int[] nombresJugats = new int[6];
        //GENERAMOS ARRAY DE ALEATORIOS ENTEROS NOMBRESJUGATS.
        // for (int i = 0; i < nombresJugats.length; i++) { 

        //     nombreAleatori = (int) (Math.random()*99) + 1;

        //     nombresJugats[i] = nombreAleatori;
        // }

        // System.out.print(Arrays.toString(nombresJugats));

        int[] nombresJugats = {4,25,70,34,25,40};
        int[] nombresGuanyadors = {4,0,72,34,47,40};
        System.out.print("Nombre d'encerts: " + primitiva(nombresJugats, nombresGuanyadors));
    }

    static int primitiva(int[] nombresJugats, int[] nombresGuanyadors) {

        int aciertos = 0;

        for (int i = 0; i < nombresJugats.length; i++) {

            for (int j=0; j < nombresGuanyadors.length; j++) {

                if (nombresGuanyadors[j] == nombresJugats[i]) {

                    aciertos++;
                }
            }
        }

        return aciertos;
    }    
    
}

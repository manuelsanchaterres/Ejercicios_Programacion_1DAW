
/* Fes el següent programa complet:

Una funció que donat el radi de la base, i l’altura (en centímetres), 
calculi el volum d’un cilindre en centímetres cúbics (π r² h).

Una funció que donades les mides dels dos costats de la base i altura (en centímetres), 
calculi el volum d’un cub en centímetres cúbics. (costar elevat a 3)

Una funció que donat el radi (en centímetres), calculi el volum d’una esfera en centímetres cúbics (4/3 π r³).

El programa ha de permetre a l’usuari triar quina figura utilitzarà com a recipient. 
Després li demanarà les mides del recipient. Després li ha de demanar que introdueixi el volum. 
I finalment ha de mostrar per pantalla si el volum elegit cap a dins la figura.

*/

import java.util.Arrays;
import java.util.Scanner;

public class activitat14 {

    public static void main(String[] args) {

        byte opcioFigura=0;

        Scanner input = new Scanner(System.in);
        System.out.print("Sobre quina figura vol calcular el Volum, Cilindre (1), Cub (2) o Esfera (3) ");
        opcioFigura = input.nextByte();

        while (opcioFigura < 1 || opcioFigura > 3) {

            System.out.print("Valors que es permeten: Cilindre (1), Cub (2) o Esfera (3) ");
            System.out.print("Sobre quina figura vol calcular el Volum, Cilindre (1), Cub (2) o Esfera (3) ");
            opcioFigura = input.nextByte();

        }


        isVolumSuficient(opcioFigura, input);


    }


    static void isVolumSuficient(byte opcioFigura, Scanner input) {

        double volum = 0;

        switch (opcioFigura) {
            case 1:
                
                volum = calculVolumCilindre(input);

                System.out.println("El volum del Cilindre es: " + volum);

                break;
            case 2:
                
                volum = calculVolumCub(input);
                System.out.println("El volum del Cub es: " + volum);

                break;
            case 3:
                
                volum = calculVolumEsfera(input);
                System.out.println("El volum del l'Esfera es: " + volum);
                break;
        }

        System.out.print("Quin volum vols introduir? ");

        double volumInput = input.nextDouble();

        System.out.println(volumInput > volum ? "No hi ha cap a la figura, volum introduït: " + volumInput + " ,volum figura: " + volum: "Si hi ha cap a la figura, volum introduït:" + volumInput + "volum figura: " + volum);

    }

    static double calculVolumCilindre(Scanner input){

        double radi, alçada;
        System.out.print("Introdueix el radi del cilindre: ");
        radi = input.nextDouble();
        System.out.print("Introdueix l'alçada del cilindre: ");
        alçada = input.nextDouble();

        return (Math.PI*Math.pow(radi, 2)* alçada);

    }

    static double calculVolumCub(Scanner input){

        double costat;
        System.out.print("Introdueix el costat del cub: ");
        costat = input.nextDouble();

        return Math.pow(costat, 3);

    }

    static double calculVolumEsfera(Scanner input){

        double radi;
        System.out.print("Introdueix el radi de l'esfera: ");
        radi = input.nextDouble();

        return (4*Math.PI*Math.pow(radi, 3))/3;

    }
}

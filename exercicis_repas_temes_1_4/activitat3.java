
/* Demana a l’usuari si vol calcular l’àrea del triangle o del quadrat, 
i demani les dades segons el cas i mostri el resultat. */

import java.util.Arrays;
import java.util.Scanner;

public class activitat3 {

    public static void main(String[] args) {

        byte opcio=0;
        Scanner input = new Scanner(System.in);

        System.out.print("Si vol àrea del triangle introdueixi 1 si vol l'àrea del quadrat introdueixi 2: ");

        opcio = input.nextByte();

        while (opcio != 1 && opcio !=2) {

            System.out.print("Si vol àrea del triangle introdueixi 1 si vol l'àrea del quadrat introdueixi 2: ");

            opcio = input.nextByte();
        }
        
        System.out.println(opcio == 1 ? "L'àrea del triangle es igual a: " +  calcularArea(opcio): "L'àrea del quadrat es igual a: " +  calcularArea(opcio) );

    }

    static double calcularArea(byte opcio) {

        double base=0, alçada=0;
        Scanner input = new Scanner(System.in);

        if (opcio == 1) {

            System.out.print("Introdueixi base del triangle: ");
            base = input.nextDouble();
            System.out.print("Introdueixi l'alçada del triangle: ");
            alçada = input.nextDouble();

            while (base < 0 || alçada < 0) {

                System.out.println("Base i alçada han d'èsser major o igual a 0.");
                System.out.print("Introdueixi base del triangle: ");
                base = input.nextDouble();
                System.out.print("Introdueixi l'alçada del triangle: ");
                alçada = input.nextDouble();
            }


            return ((base * alçada) /2);


        } else {

            System.out.print("Introdueixi el costat del quadrat: ");
            base = input.nextDouble();

            while (base < 0 ) {

                System.out.println("El costat del quadrat ha d'èsser major o igual a 0.");
                System.out.print("Introdueixi el costat del quadrat: ");
                base = input.nextDouble();

            }

            return Math.pow(base, 2);
            

        }

    }
}


/* Fer una aplicació que demani el màxim entre 2 o 3 números. Ha de tenir dues funcions
    amb sobrecárrega ales que puguem passar 2 o 3 xifres.
 */

// import java.text.DecimalFormat;

import java.util.Scanner;

public class Unitat4_Activitat6 {

    public static void main(String[] args) {

        int nombresIntroduir=0;

        double numero1=0, numero2=0, numero3=0;

        Scanner input = new Scanner(System.in);

        System.out.print("Quants de nombres vols introduir (2 o 3): ");

        nombresIntroduir = input.nextInt();

        if (nombresIntroduir != 2 && nombresIntroduir != 3) {

            System.out.println("Només pots introduir 2 o 3 nombres.");

        } else {

            if (nombresIntroduir == 2) {

                System.out.print("Introdueix valor 1: ");
                numero1 = input.nextDouble();
                System.out.print("Introdueix valor 2: ");
                numero2 = input.nextDouble();

                System.out.println(nombreMaxim(numero1, numero2));


            } else {

                System.out.print("Introdueix valor 1: ");
                numero1 = input.nextDouble();
                System.out.print("Introdueix valor 2: ");
                numero2 = input.nextDouble();
                System.out.print("Introdueix valor 3: ");
                numero3 = input.nextDouble();

                System.out.println(nombreMaxim(numero1, numero2, numero3));
            }

            
        }

    }

    static double nombreMaxim (double numero1, double numero2, double numero3) {

        double major1 = numero1 >= numero2 ? numero1 : numero2;
        double major2 = major1 >= numero3 ? major1 : numero3;

        return nombreMaxim(major1, major2);


    }

    static double nombreMaxim (double numero1, double numero2) {

        return numero1 >= numero2 ? numero1 : numero2;

    }


}


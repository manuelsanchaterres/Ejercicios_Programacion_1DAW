/* Escriu un programa que incrementi l’hora d’un rellotge. Es demana per teclat l’hora (0-23), els minuts (0-59) i els segons (0-59)  així com 
el nombre de segons a incrementar a la hora introduïda (no n'hi ha limit d'increment de segons).
L’aplicació mostrarà la nova hora en format 24 hores*/

package unitat3_activitats_voluntaries;

import java.util.Scanner;

public class unitat3_activitat_voluntaria_1 {

    public static void main(String[] args) {

        int hora=0, minuts=0, segons=0, nombreSegons=0, incrementHores=0, incrementMinuts=0, incrementSegons=0;
        
        Scanner input = new Scanner(System.in);

        System.out.print("Introdueixi hores entre 0 y 23: ");
        
        hora = input.nextInt();

        System.out.print("Introdueixi minuts entre 0 y 59: ");
        
        minuts = input.nextInt();

        System.out.print("Introdueixi segons entre 0 y 59: ");
        
        segons = input.nextInt();

        while (!(hora >=0 && hora <=23 && minuts >=0 && minuts <=59 && segons >=0 && segons <=59)) {
            
            System.out.println("Hores entre 0 i 23, minuts entre 0 i 59 i segons entre 0 y 59. ");

            System.out.print("Introdueixi hora entre 0 y 23: ");
            
            hora = input.nextInt();

            System.out.print("Introdueixi minuts entre 0 y 59: ");
            
            minuts = input.nextInt();

            System.out.print("Introdueixi segons entre 0 y 59: ");
            
            segons = input.nextInt();

        }

        System.out.print("Segons a incrementar: ");
    
        nombreSegons = input.nextInt();
        incrementHores = nombreSegons / 3600;
        incrementMinuts = (nombreSegons - (incrementHores * 3600))/60;
        incrementSegons = nombreSegons - (incrementHores * 3600) -(incrementMinuts*60);
        hora +=incrementHores;
        minuts +=incrementMinuts;
        segons += incrementSegons;

        // System.out.println(hora);
        // System.out.println(minuts);
        // System.out.println(segons);

        while (hora >= 24 || minuts >= 60 || segons >= 60) {
            
            if (hora >= 24) {

                /*Obtenemos el resto de horas para expresar en formato 24
                * toda hora mayor o igual a 24.
                */
                hora %= 24;

            } else if (minuts >= 60) {

                /*Obtenemos el resto de minutos para expresar en formato 60 minutos
                * todo minuto mayor o igual a 60. Por cada fraccion de minutos mayor o igual a 60
                * se modifica la hora en relación a dicho número de fracciones.
                */
                hora += (minuts /60);
                minuts %= 60;

            } else if (segons >= 60) {

                /*Obtenemos el resto de minutos para expresar en formato 60 segundos
                * todo segundo mayor o igual a 60. Por cada fraccion de segundos mayor o igual a 60
                * se modifica los minutos en relación a dicho número de fracciones.
                */

                minuts += (segons /60);
                segons %= 60;

            }

        }

        System.out.println(hora);
        System.out.println(minuts);
        System.out.println(segons);
        System.out.println("Resultat: " + hora + " hores " + minuts + " minuts y " + segons +  " segons.");
    }
}

/* Demanar a l’usuari la hora, minut i segons. Determinar quina serà la hora un segon més tard. */

import java.util.Scanner;

public class Unitat2_Activitat9 {
    
    public static void main(String[] args) {

        byte hora, minuts, segons ;

        Scanner input = new Scanner(System.in);

        System.out.print("Introduzca valor hora: ");

        hora = input.nextByte();

        System.out.print("Introduzca valor minutos: ");

        minuts = input.nextByte();

        System.out.print("Introduzca valor segundos: ");

        segons = input.nextByte();

        if (hora <= 23 && minuts <= 59 && segons <= 59) {

            segons +=1;

            if (segons == 60) {


                if (minuts == 59) {


                    hora +=1;
                    minuts = 0;

                    System.out.println(hora + " horas " + " 00 minuts 00 segons");

                } else  {

                    minuts +=1;
                    segons = 0;

                    System.out.println(hora + " horas, " + minuts + "  minuts, " + segons + " segons.");
                    
                }


            
            } else if (hora == 23 && minuts == 59 && segons == 59) {

                System.out.println(" 00 horas 00 minuts 00 segons");

            } else {

                System.out.println(hora + " horas, " + minuts + "  minuts, " + segons + " segons.");

            }
            


        } else {

            System.out.print("Hora debe ser inferior o igual a 23 , minutos inferior o igual a 59 y segundos inferior o igual a 59 ");

        }



    }
}

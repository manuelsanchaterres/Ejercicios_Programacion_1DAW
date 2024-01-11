
/* Fes un programa que mostri totes les taules de multiplicar de l'1 al 10 */

public class Unitat3_Activitat9 {

    public static void main(String[] args) {

        for (int i=1; i<=9; i++) {

            System.out.println("Taula del " + i + "\n");

            for (int j= 1; j <=10; j++) {

                if (j == 10) {

                    System.out.println(i + " per " + j + " = " + i*j + "\n");

                } else {

                    System.out.println(i + " per " + j + " = " + i*j);

                }


            }


        }

        


    }
}

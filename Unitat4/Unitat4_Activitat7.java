
/* 
    Fes una funció recursiva per a calcular el terme n de la sèrie de Fibonacci. 
    El n-terme de la sèrie de Fibonacci es calcula obtenint la suma dels dos termes anteriors, és a dir:
    fibonacci(n) = fibonacci(n-1) + fibonacci(n-2)
    fibonacci(0) = 0;
    fibonacci(1) = 1;

*/


    import java.util.Scanner;

    public class Unitat4_Activitat7 {

    public static void main(String[] args) {

        int termeNFibonacci=0, resultatFibonacci=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Introdueix un nombre: ");
        termeNFibonacci = input.nextInt();
        resultatFibonacci = calculTermeFibonacci(termeNFibonacci);
        System.out.println(resultatFibonacci);
    }

    static int calculTermeFibonacci (int termeNFibonacci) {
        
        if (termeNFibonacci == 0) {

            return 0;

        } else if (termeNFibonacci == 1) {

           return 1;

        } else {

            return calculTermeFibonacci(termeNFibonacci - 1) + calculTermeFibonacci(termeNFibonacci - 2);
        }

    }



}


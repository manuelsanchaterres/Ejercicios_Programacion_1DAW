/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author manue
 */
public class Unitat1_Activitat7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /* Dissenya una aplicació que demani a un usuari una quantitat de segons. L’aplicació ha de mostrar quantes hores, 
        minuts i segons hi ha en el nombre de segons introduïts per l’usuari. */
        
        int horas, minutos, segundos, resto, valorUsuario;
        String textoHoras, textoMinutos, textoSegundo;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Introduzca un valor en segundos: ");
        
        valorUsuario = input.nextInt();
        
        horas = valorUsuario/3600;
        
        // if (horas == 1) {
        
        //     textoHoras = " hora ";
        // } else {
            
        //     textoHoras = " horas ";
            
        // }
        
        textoHoras = horas == 1 ? " hora ": " horas ";

       
        resto = valorUsuario-(horas * 3600);
        
        minutos = resto / 60;
        
        // if (minutos == 1) {
        
        //     textoMinutos = " minuto ";
        // } else {
        
        //     textoMinutos = " minutos ";
            
        // }

        textoMinutos = minutos == 1 ? " minuto ": " minutos ";

        segundos = resto -(minutos * 60);
        
        // if (segundos == 1) {
        
        //     textoSegundo = " segundo ";
        // } else {
        
        //     textoSegundo = " segundos ";
            
        // }

        textoSegundo = segundos == 1 ? " segundo ": " segundos ";

        
        System.out.println(segundos + " segundos");
        
        System.out.println(valorUsuario + " segundos" + " es igual a " + horas + textoHoras + minutos + textoMinutos + segundos + textoSegundo + ".");
        
        
    }
    
}

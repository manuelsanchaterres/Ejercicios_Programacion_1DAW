/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebas.paquete1;
import pruebas.paquete1.C;
import pruebas.A;
/**
 *
 * @author Asus
 */
public class B {
    public static void show (){
        System.out.println("Soy la funcion de la clase: B");
        System.out.println("Me ha llamado la clase: " + A.show());
        C.showC();
    }
    static String who (){
        return "B";
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Lab3.P1;

import java.util.Scanner;

/**
 *
 * @author kennr
 */
public class KennethRomero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        byte opc;
        
        System.out.println("");
        System.out.println("_________________________________________________");
        System.out.println("Lab 3");
        System.out.println("_________________________________________________");
        System.out.println("");
        System.out.println("0)- Salir.");
        System.out.println("");
        System.out.println("1)- Adivina el numero.");
        System.out.println("");
        System.out.println("2)- Aproximacion del coseno.");
        System.out.println("");
        System.out.println("3)- Numero Feliz.");
        System.out.println("");
        System.out.println("_________________________________________________");
        System.out.println("");
        
        
        do {
            System.out.print("Ingrese su opcion (0-3): ");
            opc=leer.nextByte();
            
        } while (opc!=0);
    }
    
}

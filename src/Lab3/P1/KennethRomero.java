/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Lab3.P1;

import java.util.Random;
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
        Random rand = new Random();
        
        byte opc,contin,cont0=0,cont=7,cont2=1;
        int num,num2,z,n;
        do {
            contin=1;
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
        
        
        
            System.out.print("Ingrese su opcion (0-3):");
            opc=leer.nextByte();
            
            if (opc==1) {
                do {
                num =rand.nextInt(101);
                System.out.println("");
                System.out.println("Opcion 1 - Adivina el numero.");
                System.out.println("");
                System.out.println("Estoy pensando un numero entre 1 y 100,tienes que descubrirlo, tienes 7 intentos para adivinarlo");
                cont=7;
                cont2=1;
                do {
                    System.out.println("Te quedan "+cont+" intentos");
                    System.out.print("Intento "+cont2+" de 7, Ingresa tu numero: ");
                    num2=leer.nextInt();
                    System.out.println("");
                    cont--;
                    cont2++;
                    
                    
                    
                } while (cont2<=7 && num!=num2);
                    if (num==num2) {
                        System.out.println("Felicidades adivinaste el numero, te tomo "+cont2+" intentos.");
                        System.out.println("");
                        
                        
                    }else{
                     System.out.println("Te quedaste sin intentos");
                     System.out.println("El numero era:"+num);
                     System.out.println("");
                    }
                    System.out.println("");
                    System.out.print("Si no desea continuar presione 0:");
                    contin=leer.nextByte();
                    System.out.println("");
                     
                } while (contin!=0);
            }else if (opc==2) {
                System.out.println("");
                System.out.println("Opcion 2 - Aproximacion de coseno.");
                System.out.println("");
                do {
                    System.out.print("Ingrese el anuglo en radianes (entre -10 y 10):");
                    z=leer.nextInt();
                    System.out.println("");
                    if (z>10 || z<-10) {
                        System.out.println("Numero invalido vuelva a ingresar los numeros.");
                    }
                    System.out.println("Ingrese el nivel de aproximacion (1 a 50):");
                    n=leer.nextInt();
                    System.out.println("");
                    if (n<1 || n>50) {
                        System.out.println("Numero invalido vuelva a ingresar los numeros.");
                    }
                    
                } while (contin!=0);
                
            }
        } while (opc!=0);
    }
    
}

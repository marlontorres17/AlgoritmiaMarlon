/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg3.pkg10.pkg3;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int edad = 0;
        double preciot, precioc;
        int categoria = 0;
        System.out.println("Ingrese el valor de la entrada en COP");                                                    
        preciot = scan.nextInt();
        do {
            categoria++;
            System.out.println("Ingrese su edad ");
            edad = scan.nextInt();
            if (edad >= 5 && edad <= 14) {
                System.out.println("Usted pertenece a la categoria 1");
                precioc = (double) (preciot * 0.35);
                System.out.println("Su descuento del precio original es" + precioc);
            }else if (edad >= 15 && edad <= 19) {
                System.out.println("Usted pertenece a la categoria 2");
                precioc = (double) (preciot * 0.25);
                System.out.println("Su descuento del precio original es" + precioc);
            } else if (edad >= 20 && edad <= 45) {
                System.out.println("Usted pertenece a la categoria 3");
                precioc = (double) (preciot * 0.10);
                System.out.println("Su descuento del precio original es" + precioc);
            } else if (edad >= 46 && edad <= 65) {
                System.out.println("Usted pertenece a la categoria 4");
                precioc = (double) (preciot * 0.25);
                System.out.println("Su descuento del precio original es" + precioc);
            } else if (edad >= 66) {
                System.out.println("Usted pertenece a la categoria 5");
                precioc = (double) (preciot * 0.35);
                System.out.println("Su descuento del precio original es" + precioc);
            } else if (edad == 0) {
                break;
            
            } else {
                System.out.println("Edad no valida no puede ingresar");
                continue;
            }
            System.out.println("0 para salir");
        } while (edad != 0);
        System.out.println("clientes procesados " + categoria);
    }
}

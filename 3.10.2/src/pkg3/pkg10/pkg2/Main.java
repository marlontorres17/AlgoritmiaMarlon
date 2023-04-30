/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg3.pkg10.pkg2;

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
        double total = 0;
        System.out.println("Ingrese la cantidad de productos y el precio");
        System.out.println("Para saber su total ingrese (0)");
        double precio = 0;
        int cantidad;
        do {
            System.out.println("Ingrese el precio del articulo en COP");
            precio = scan.nextDouble();
            if (precio == 0) {
                break;
            }
            System.out.println("Ingresa el numero de Articulos a comprar: ");
            cantidad = scan.nextInt();
            double subtotal = precio * cantidad;
            total += subtotal;
            System.out.println("Subtotal: " + subtotal);
        } while (precio != 0);
        System.out.println("Total de compra  COP " + total);
    }
}           
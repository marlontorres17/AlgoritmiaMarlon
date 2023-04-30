/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg3.pkg10.pkg1;

import java.util.Scanner;

public class TiendaDescuento {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int numClientes; 
        double totalVentas = 0;
       
        System.out.print("Ingrese el número de clientes que visitaron la tienda: ");
        numClientes = sc.nextInt();
        
        int i = 1;
        do {
           
            System.out.print("Cliente #" + i + ": ¿Qué color de bolita sacó? (r = roja, a = amarilla, b = blanca): ");
            char color = sc.next().charAt(0);
           
            double descuento;
            if (color == 'r') {
                descuento = 0.4;
            } else if (color == 'a') {
                descuento = 0.25;
            } else {
                descuento = 0;
            }
           
            System.out.print("Ingrese el total de la compra del cliente #" + i + ": ");
            double totalCompra = sc.nextDouble();
         
            double totalPagar = totalCompra - (totalCompra * descuento);
            System.out.println("El cliente #" + i + " pagará: $" + totalPagar);
            
            totalVentas += totalPagar;
            
            i++;
        } while (i <= numClientes);
        
        // Mostrar el total de ventas de la tienda al final del día
        System.out.println("El total de ventas de la tienda es: $" + totalVentas);
    }
}


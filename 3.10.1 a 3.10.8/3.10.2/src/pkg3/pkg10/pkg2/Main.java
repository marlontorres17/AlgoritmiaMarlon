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
        Scanner scanner = new Scanner(System.in);
        double totalCompra = 0;
        String respuesta;
        do {
            System.out.print("Ingrese el precio del artículo: ");
            double precio = scanner.nextDouble();
            System.out.print("Ingrese la cantidad de artículos: ");
            int cantidad = scanner.nextInt();
            double subtotal = precio * cantidad;
            totalCompra += subtotal;
            System.out.println("El subtotal para este artículo es: " + subtotal);
            System.out.print("¿Desea tomar otro artículo? (S/N): ");
            respuesta = scanner.next();
        } while (respuesta.equalsIgnoreCase("S"));
        System.out.println("El total de la compra es: " + totalCompra);
    }
}
    
    


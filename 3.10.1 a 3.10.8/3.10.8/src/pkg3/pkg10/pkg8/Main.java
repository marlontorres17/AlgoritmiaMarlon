/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg3.pkg10.pkg8;
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
        double total = 0.0;
        String respuesta;
        do {
            System.out.print("Ingrese el precio del artículo: ");
            double precio = scan.nextDouble();
            System.out.print("¿La etiqueta es roja? (S) para si (N) para no: ");
            String etiqueta = scan.next();
            if (etiqueta.equalsIgnoreCase("S")) {
                total += precio * 0.8;
            } else {
                total += precio;
            }
            System.out.print("¿Desea agregar otro artículo? (S) para si (N) para no: ");
            respuesta = scan.next();
        } while (respuesta.equalsIgnoreCase("S"));
        System.out.println("El total a pagar es: $" + total);
    }
}
    

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
        Scanner scanner = new Scanner(System.in);
        int categoria1 = 0, categoria2 = 0, categoria3 = 0, categoria4 = 0, categoria5 = 0;
        double precioAsiento = 10000;
        int edad;
        do {
            System.out.print("Ingrese la edad del cliente (0 para salir): ");
            edad = scanner.nextInt();
            if (edad >= 5 && edad <= 14) {
                categoria1++;
            } else if (edad >= 15 && edad <= 19) {
                categoria2++;
            } else if (edad >= 20 && edad <= 45) {
                categoria3++;
            } else if (edad >= 46 && edad <= 65) {
                categoria4++;
            } else if (edad >= 66) {
                categoria5++;
            }
        } while (edad != 0);
        double totalDescuento = categoria1 * precioAsiento * 0.35 + categoria2 * precioAsiento * 0.25
                + categoria3 * precioAsiento * 0.10 + categoria4 * precioAsiento * 0.25
                + categoria5 * precioAsiento * 0.35;
        System.out.println("El teatro por cada categoria deja de percebir lo siguiente:");
        System.out.println("Categoría 1: " + categoria1 * precioAsiento * 0.35);
        System.out.println("Categoría 2: " + categoria2 * precioAsiento * 0.25);
        System.out.println("Categoría 3: " + categoria3 * precioAsiento * 0.10);
        System.out.println("Categoría 4: " + categoria4 * precioAsiento * 0.25);
        System.out.println("Categoría 5: " + categoria5 * precioAsiento * 0.35);
        System.out.println("Total: " + totalDescuento);
    }
}
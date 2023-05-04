/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg3.pkg10.pkg1;
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
        double descuento, totalCompra, precioFinal;
        String colorBolita;
        System.out.println("Bienvenido a su tienda de confianza");
        do {
            System.out.print("Ingrese el color de su bolita (roja, amarilla o blanca): ");
            colorBolita = scan.nextLine();
            switch (colorBolita) {
                case "roja":
                    descuento = 0.4;
                    break;
                case "amarilla":
                    descuento = 0.25;
                    break;
                case "blanca":
                    descuento = 0;
                    break;
                default:
                    descuento = 0;
                    System.out.println("Esa bolita no sirve meta la mano otra vez.");
                    break;
            }
            if (descuento != 0) {
                System.out.print("Ingrese el total de su compra: ");
                totalCompra = scan.nextDouble();
                scan.nextLine(); // Limpiar el buffer del scanner

                precioFinal = totalCompra - (totalCompra * descuento);
                System.out.printf("Su precio final es de : $", precioFinal);
            }
       } while (!colorBolita.equals("salir"));
        System.out.println("Gracias por comprar aqui vuelva pronto caballero o dama lo que ud sea");
    }
}
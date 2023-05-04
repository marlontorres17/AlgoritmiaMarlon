/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg3.pkg10.pkg4;
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
        int n, tipoVehiculo, contador = 0;
        double presion, volumen, temperatura, masa, sumaMasa = 0, promedioMasa;
        char respuesta;
        do {
            System.out.print("Ingrese el tipo de vehículo (1. motocicleta, 2. automóvil): ");
            tipoVehiculo = scanner.nextInt();
            System.out.print("Ingrese la presión del neumático: ");
            presion = scanner.nextDouble();
            System.out.print("Ingrese el volumen del neumático: ");
            volumen = scanner.nextDouble();
            System.out.print("Ingrese la temperatura del neumático: ");
            temperatura = scanner.nextDouble();
            masa = presion * volumen * 0.37 * (temperatura + 460);
            if (tipoVehiculo == 1) {
                sumaMasa += masa * 2;
                contador++;
            } else if (tipoVehiculo == 2) {
                sumaMasa += masa * 4;
                contador++;
            }
            System.out.print("¿Desea ingresar datos de otro vehículo? (S) para si y (N) para no: ");
            respuesta = scanner.next().charAt(0);
        } while (respuesta == 'S' || respuesta == 's');
        if (contador > 0) {
            promedioMasa = sumaMasa / contador;
            System.out.println("El promedio de masa de aire de los neumáticos es: " + promedioMasa);
        } else {
            System.out.println("No se ingresaron datos de vehículos.");
        }
    }
} 
  

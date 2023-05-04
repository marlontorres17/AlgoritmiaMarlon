/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg3.pkg10.pkg6;
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
      double sumaCalidad = 0, pesoTotal = 0, alturaTotal = 0, huevosTotal = 0;
      int gallinas, contador = 0;
      System.out.print("Ingrese la cantidad de gallinas en la granja: ");
      gallinas = scan.nextInt();
      do {
         contador++;
         System.out.println("Gallina #" + contador);
         System.out.println("Ingrese el peso de la gallina: ");
         double peso = scan.nextDouble();
         System.out.println("Ingrese la altura de la gallina: ");
         double altura = scan.nextDouble();
         System.out.println("Ingrese la cantidad de huevos que pone la gallina por semana: ");
         double huevos = scan.nextDouble();   
         double calidad = peso * altura / huevos;
         sumaCalidad += calidad;
         pesoTotal += peso;
         alturaTotal += altura;
         huevosTotal += huevos;
      } while (contador < gallinas);
      double promedioCalidad = sumaCalidad / gallinas;
      double pesoPorKiloDeHuevo;     
      if (promedioCalidad >= 15) {
         pesoPorKiloDeHuevo = 1.2 * promedioCalidad;
      } else if (promedioCalidad > 8 && promedioCalidad < 15) {
         pesoPorKiloDeHuevo = 1.0 * promedioCalidad;
      } else {
         pesoPorKiloDeHuevo = 0.8 * promedioCalidad;
      }     
      double precioPorKiloDeHuevo = pesoPorKiloDeHuevo / pesoTotal * huevosTotal;
      System.out.println("El precio por kilo es: $" + precioPorKiloDeHuevo);
   }
}
    
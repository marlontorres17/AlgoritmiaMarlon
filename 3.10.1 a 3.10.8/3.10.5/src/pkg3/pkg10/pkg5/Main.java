/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg3.pkg10.pkg5;
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
        System.out.print("Introduzca el numero de obreros que quieren cobrar: ");
        int obreros = scan.nextInt();
        double salarioTotal = 0;
        int contador = 0;
        do {
            contador++;
            System.out.println("Obrero " + contador);
            System.out.print("Introduzca la cantidad de horas trabajadas durante la semana: ");
            int horasTrabajadas = scan.nextInt();          
            double salarioSemanal = 0;                 
            if (horasTrabajadas <= 40) {
                salarioSemanal = horasTrabajadas * 16; 
            } else if (horasTrabajadas <= 48) {
                salarioSemanal = 40 * 16 + (horasTrabajadas - 40) * 32; 
            } else {
                salarioSemanal = 40 * 16 + 8 * 32 + (horasTrabajadas - 48) * 48; 
            }
            salarioTotal += salarioSemanal;
            System.out.println("El salario semanal del obrero es de: " + salarioSemanal + " dólares");
        } while (contador < obreros);

        double salarioPromedio = salarioTotal / obreros;
        System.out.println("El salario promedio de los " + obreros + " obreros es de: " + salarioPromedio + " dólares");
    }

}

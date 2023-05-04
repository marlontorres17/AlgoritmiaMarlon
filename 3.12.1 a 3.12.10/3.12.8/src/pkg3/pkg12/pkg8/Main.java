/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg3.pkg12.pkg8;
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
        int num1, num2, gcd;
        System.out.print("Ingrese el primer número: ");
        num1 = scan.nextInt();
        System.out.print("Ingrese el segundo número: ");
        num2 = scan.nextInt();
        if (num1 % 2 == 0) {
            int dividend = num1;
            int divisor = num2;
            int residuo = dividend % divisor;
            while (residuo != 0) {
                dividend = divisor;
                divisor = residuo;
                residuo = dividend % divisor;
            }
            gcd = divisor;
            System.out.println("El máximo común divisor de " + num1 + " y " + num2 + " es: " + gcd);
        } else {
            System.out.println("El primer número debe ser par para encontrar el máximo común divisor.");
        }
    }
}
    
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg3.pkg12.pkg2;
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
        System.out.println("Ingrese el primer número: ");
        int num1 = scan.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = scan.nextInt();
        int producto = 0;
        for (int i = 1; i <= num2; i++) {
            producto += num1;
        }
        System.out.println("El producto de " + num1 + " y " + num2 + " es: " + producto);
    }
}
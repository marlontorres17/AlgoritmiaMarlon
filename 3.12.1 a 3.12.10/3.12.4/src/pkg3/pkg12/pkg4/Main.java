/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg3.pkg12.pkg4;
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
        System.out.print("Ingrese el multiplicando: ");
        int multiplicando = scan.nextInt();
        System.out.print("Ingrese el multiplicador: ");
        int multiplicador = scan.nextInt();
        for (int i = 0; i <= multiplicador; i++) {
            int producto = multiplicando * i;
            System.out.println(multiplicando + " * " + i + " = " + producto);
        }
    }
}
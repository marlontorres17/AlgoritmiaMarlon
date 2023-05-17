/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg1.pkg13.pkg2;
import java.util.Scanner;
/**
 * @author USUARIO
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner=new Scanner(System.in); 
        System.out.println("Ingrese sus digitos aca");
   int n = scanner.nextInt();
    int[] numeros = new int[n];
    for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;
        }
        System.out.println("Los numeros almacenados son");
        for(int i=0;i<numeros.length;i++){
            System.out.println(numeros[i]);
        }
    } 
}

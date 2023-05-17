/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg3.pkg13.pkg7;

/**
 *
 * @author USUARIO
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 100;     
        //  almacenar los números del 1 al n
        int[] numeros = new int[n];
        for (int i = 0; i < n; i++) {
            numeros[i] = i + 1;
        }
        // números no primos como 0 en el arreglo
        for (int i = 1; i < n; i++) {
            if (numeros[i] != 0) {
                for (int j = i + numeros[i]; j < n; j += numeros[i]) {
                    numeros[j] = 0;
                }
            }
        }
        // Imprimir los números primos 
        System.out.println("Números primos hasta " + n + ":");
        for (int i = 1; i < n; i++) {
            if (numeros[i] != 0) {
                System.out.print(numeros[i] + " ");
            }
        }
    }
}
 
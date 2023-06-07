/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matriz.pkg1;
import java.util.Scanner;
/**
 *
 * @author USUARIO
 */
public class Matriz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //definir la matriz
        int[][] matriz = new int[4][4];
        int numero;
        Scanner scan = new Scanner(System.in);
        //se recorre la matriz para cargar
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("Ingrese el valor para "
                        + "" + (i + 1) + "," + (j + 1));
                matriz[i][j] = scan.nextInt();
            }
        }
//se recorre la matriz para mostrar
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("El valor de la posición "+ "" + (i + 1) + "," + (j + 1));
                System.out.println(matriz[i][j]);
            }
        }    
        //se recorre la matriz para mostrar ORGANIZADO
        for (int i = 0; i < 4; i++) {
            System.out.println("");
            System.out.print("|");
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j]+"|");
            }
        }
        System.out.println("Ingrese el numero que desea buscar");
         numero = scan.nextInt();
         for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                if ((matriz[i][j])==numero){           
                System.out.print("SU numero se encuentra en la posicion: "+"x("+i+"), "+"y("+j+")");
                System.out.println("");
                }        
            }
        }
         
    }
}

    






 
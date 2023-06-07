/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matriz2;
import java.util.Scanner;
/**
 *
 * @author USUARIO
 */
public class Matriz2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //definir la matriz
        int[][] matriza = new int[3][3];
        int[][] matrizb = new int[3][3];
        int[][] matrizc = new int [3][3];
        Scanner scan = new Scanner(System.in);
        //se recorre la matriz para cargar
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese el valor para "
                        + "" + (i + 1) + "," + (j + 1));
                matriza[i][j] = scan.nextInt();
            }
        }
//se recorre la matriz para mostrar
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("El valor de la posición "+ "" + (i + 1) + "," + (j + 1));
                System.out.println(matriza[i][j]);
            }
        }    
        //se recorre la matriz para mostrar ORGANIZADO
        for (int i = 0; i < 3; i++) {
            System.out.println("");
            System.out.print("|");
            for (int j = 0; j < 3; j++) {
                System.out.print(matriza[i][j]+"|");
               
            }
        }
        //se recorre la matriz para cargar
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese el valor de la segunda matriz para "
                        + "" + (i + 1) + "," + (j + 1));
                matrizb[i][j] = scan.nextInt();
            }
        }
//se recorre la matriz para mostrar
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("El valor de la posición "+ "" + (i + 1) + "," + (j + 1));
                System.out.println(matrizb[i][j]);
            }
        }    
        //se recorre la matriz para mostrar ORGANIZADO
        for (int i = 0; i < 3; i++) {
            System.out.println("");
            System.out.print("|");
            for (int j = 0; j < 3; j++) {
                System.out.print(matrizb[i][j]+"|");
               
            }
        }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(" "
                        + "" + (i + 1) + "," + (j + 1));
                matrizc [i][j] = matriza [i][j] + matrizb [i][j];
    }
           
    }/*
        /*for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("El valor de la posición "+ "" + (i + 1) + "," + (j + 1));
                System.out.println(matrizc[i][j]);
            }
        }*/
                
        for (int i = 0; i < 3; i++) {
            System.out.println("");
            System.out.print("|");
            for (int j = 0; j < 3; j++) {
                System.out.print(matrizc[i][j]+"|");
               
            }
        }
}
}


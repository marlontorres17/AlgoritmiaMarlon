/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.matriz3;

import java.util.Scanner;

/**
 *
 * @author Ambiente 209-1
 */
public class Matriz3 {

    public static void main(String[] args) {
        /*
        int suma=0;
        int[][] matriz = new int[2][3];
        Scanner Scam = new Scanner(System.in);
        for (int f = 0; f < 2; f++) {
            for (int c = 0; c < 3; c++) {
                System.out.println("ingrese el valor para " + "" + (f + 1) + "," + (c + 1));
                matriz[f][c] = Scam.nextInt();
            }
        }
         for (int f = 0; f < 2; f++) {
            for (int c = 0; c < 3; c++) {
                suma += matriz[f][c];

                
            }
         }
         System.out.print( "la suma de su matriz es: " + suma); 
         */
 /*
        int[][] matriz = new int[5][5];
        Scanner Scam = new Scanner(System.in);
        for (int f = 0; f < 5; f++) {
            for (int c = 0; c < 5; c++) {
                System.out.println("ingrese el valor para " + "" + (f + 1) + "," + (c + 1));
                matriz[f][c] = Scam.nextInt();
            }
        }
        int mayor = matriz[0][0]; 
        int posicion_renglon = 0;
        int posicion_columna = 0;
        for (int f = 0; f < 5; f++) {
            for (int c = 0; c < 5; c++) {
                if (matriz [f][c]> mayor ){
                    mayor  = matriz [f][c];
                    posicion_renglon = f;
                    posicion_columna = c;
                }

            }

        }
        System.out.println("el numero mayor es "+mayor+" se encuentra en el renglon  "+posicion_renglon+" y en la columna "+posicion_columna);
    
         */
      /*  int suma = 0;
        int[][] matriz = new int[3][3];
        int[] sumaFila = new int[3];
        int[] sumaColumna = new int[3];
        Scanner Scam = new Scanner(System.in);
        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 3; c++) {
                System.out.println("ingrese el valor para " + "" + (f + 1) + "," + (c + 1));
                matriz[f][c] = Scam.nextInt();

            }
        }
        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 3; c++) {
                sumaFila[f] += matriz[f][c];
                sumaColumna[c] += matriz[f][c];
            }
        }
        System.out.println("La sumatoria de las filas es");
        for (int f = 0; f < 3; f++) {
            System.out.println(sumaFila[f]);
        }
        System.out.println("La sumatoria de las columnas es");
        for (int c = 0; c < 3; c++) {
            System.out.println(sumaColumna[c]);
        }*/
  /*
 int[][] matriz = new int[5][5];
       
        int[] sumaColumna = new int[5];
         int mayor = matriz[0][0]; 
        int posicion_columna = 0;
        Scanner Scam = new Scanner(System.in);
        for (int f = 0; f < 5; f++) {
            for (int c = 0; c < 5; c++) {
                System.out.println("ingrese el valor para " + "" + (f + 1) + "," + (c + 1));
                matriz[f][c] = Scam.nextInt();

            }
        }
        for (int f = 0; f < 5; f++) {
            for (int c = 0; c < 5; c++) {
                
                sumaColumna[c] += matriz[f][c];
            }
        }
       
        System.out.println("La sumatoria de las columnas es");
        for (int c = 0; c < 5; c++) {
            System.out.println(sumaColumna[c]);
        }
            for (int f = 0; f < 5; f++) {
            for (int c = 0; c < 5; c++) {
                if (sumaColumna[c]> mayor ){
                    mayor  = sumaColumna[c];
                   
                    posicion_columna = c;
                }

            }
        
        }
          System.out.println("la suma mayor es "+mayor+" se encuentra en la columna  "+posicion_columna);
      */
  int[][] matriz = new int[5][5];
       
        int[] vector = new int[5];
        Scanner Scam = new Scanner(System.in);
        for (int f = 0; f < 5; f++) {
            for (int c = 0; c < 5; c++) {
                System.out.println("ingrese el valor para " + "" + (f + 1) + "," + (c + 1));
                matriz[f][c] = Scam.nextInt();

            }
        }
     for (int f = 0; f < 5; f++) {
            for (int c = 0; c < 5; c++) {
                if ( matriz[f]==matriz[c]){ 
                   vector [f]= matriz [f][c];
                }

            }
        
        }
        for (int f = 0; f < 5; f++) {
            System.out.println(vector[f]);
        }
        }
    }


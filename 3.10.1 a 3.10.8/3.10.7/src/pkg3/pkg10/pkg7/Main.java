/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg3.pkg10.pkg7;
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
        int diputados, favor = 0, contra = 0, abstencion = 0;
        double porcFavor, porcContra, porcAbstencion;
        do {
            System.out.print("Ingrese la cantidad de diputados a encuestar: ");
            diputados = scan.nextInt();
        } while (diputados <= 0);
        for (int i = 1; i <= diputados; i++) {
            System.out.println("Diputado " + i + ":");
            System.out.print("Está a favor del Tratado de Libre Comercio? (S) para si (N) para no: ");
            String respuesta = scan.next();
            if (respuesta.equalsIgnoreCase("S")) {
                favor++;
            } else if (respuesta.equalsIgnoreCase("N")) {
                contra++;
            } else {
                abstencion++;
            }
        }
        porcFavor = (double) favor / diputados * 100;
        porcContra = (double) contra / diputados * 100;
        porcAbstencion = (double) abstencion / diputados * 100;
        System.out.println("RESULTADOS DE LA ENCUESTA:");
        System.out.println("A favor del tratado de libre comercio: " + favor + " diputados (" + porcFavor + "%)");
        System.out.println("En contra del tratado de libre comercio: " + contra + " diputados (" + porcContra + "%)");
        System.out.println("Abstenciones: " + abstencion + " diputados (" + porcAbstencion + "%)");
    }
}
   
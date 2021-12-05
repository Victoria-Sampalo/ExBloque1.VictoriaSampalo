/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

/**
 *
 * @author Victoria
 */
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //DEFINO LAS VARIABLES
        int a = 0, x = 0, b = 0, c = 0;
        Scanner sc = new Scanner(System.in);

        //DEFINO MÉTODO JOPTIONPANE
        String varA = JOptionPane.showInputDialog(null, "Introduce el valor de a");
        //guardo variable numero en tipo double a
        a = Integer.parseInt(varA);

        //repito con las demás variables.
        String varB = JOptionPane.showInputDialog(null, "Introduce el valor de b");
        //guardo variable numero en tipo double a
        b = Integer.parseInt(varB);

        String varC = JOptionPane.showInputDialog(null, "Introduce el valor de c");
        //guardo variable numero en tipo double a
        c = Integer.parseInt(varC);

        //imprimo variables por consola para visualización del ejercicio
        System.out.println("Las variables elegidas son:\n"
                + "a= " + a + "\nb= " + b + "\nc= " + c);
        //RESTRICCIONES.
        /*
        si a==0 && b==0,no tiene solución
         */

        if (a == 0 && b == 0) {
            JOptionPane.showMessageDialog(null, "a y b no pueden ser 0 a la vez.\nNo existe solución para estos valores");

        } else if (a == 0 && b != 0) {
            x = -c / b;
            JOptionPane.showMessageDialog(null, "La solución es: " + x);
        } else {
            double solve1 = (-b + (Math.sqrt((Math.pow(b, 2) - 4 * a * c))) / (2 * a));
            System.out.println("Solución 1= " + solve1);

        
            double solve2 = (-b - (Math.sqrt((Math.pow(b, 2) - 4 * a * c))) / (2 * a));
            System.out.println("Solución 2= " + solve2);
            JOptionPane.showMessageDialog(null, "Solución 1:  " + solve1 + "\nSolución2:  " + solve2);
            //si es menor que 1
            if ((Math.pow(b, 2) - 4 * a * c) < 0) {
                JOptionPane.showMessageDialog(null, "Los valores suministrador no permiten calcular la solución.");

            }
        }

    }

}

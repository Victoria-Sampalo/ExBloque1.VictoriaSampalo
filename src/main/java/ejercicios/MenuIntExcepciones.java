/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Victoria
 */
public class MenuIntExcepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario
        do {
            System.out.println("1. Opcion 1");
            System.out.println("2. Opcion 2");
            System.out.println("3. Opcion 3");
            System.out.println("4. Salir");
            try {
                System.out.println("Escribe una de las opciones");
                opcion = sc.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("Has seleccionado la opción 1");
                        break;
                    case 2:
                        System.out.println("Has seleccionado la opción 2");
                        break;
                    case 3:
                        System.out.println("Has seleccionado la opción 3");
                        break;
                    case 4:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 4");
                }
            } catch (InputMismatchException ime) {
                System.out.println("Debes insertar un número");
                sc.next();
            }
        } while (!salir);

    }

}

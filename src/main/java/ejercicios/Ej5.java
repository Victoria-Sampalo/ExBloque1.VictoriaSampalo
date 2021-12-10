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
public class Ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //DECLARO MÉTODO DE CLASE SCANNER
        Scanner sc = new Scanner(System.in);
        //DECLARO VARIABLES A USAR
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario
        String opt;
        System.out.println("Bienvenido al programa usuario.\n"
                + "\n---------------------------\n");
        do {
            System.out.println("1.Cuenta atrás");
            System.out.println("2.Juego de dados");
            System.out.println("3.Salir");

            try {
                System.out.println("Escribe una de las opciones");
                opcion = sc.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("Has seleccionado la opción CUENTA ATRÁS");
                        int contador;
                        for (contador = 1_000; contador >= 100; contador -= 5) {
                            System.out.println(contador);
                        }
                        break;
                    case 2:
                        System.out.println("Has seleccionado la opción JUEGO DE DADOS");
                        break;
                    case 3:
                        System.out.println("¿Desea salir?. Para salir escriba SI\n");
                        do {
                            // sc.nextInt(); 
                            //bug. se repite la siguiente linea pero no se como es,
                            //System.out.println("¿Desea salir?. Para salir escriba SI\n");

                            opt = sc.nextLine();
                            if (opt.equalsIgnoreCase("si")) {
                                salir = true;
                            }
                        } while (!opt.equalsIgnoreCase("si"));
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 3");
                }
            } catch (InputMismatchException ime) {
                System.out.println("Debes insertar un número");
                //limpio buffer, 
                //porque pido un numero e inserto una letra, de string a int le cuesta
                sc.next();
            }
        } while (!salir);
    }

}

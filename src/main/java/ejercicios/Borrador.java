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
public class Borrador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //BORRADOR
        //DECLARO VARIABLES A USAR
        int opcion = 0;
        boolean salir = false;
        String opt;
        //DECLARO MÉTODO DE CLASE SCANNER
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido al programa usuario.\n"
                + "\n---------------------------\n");
        do {
            
                System.out.println("Elija una de las siguientes opciones"
                        + "\n---------------------------\n");
                System.out.println("1-Cuenta atrás\n"
                        + "2-Juego de dados\n"
                        + "3-Salir");
            try {
                opcion = sc.nextInt();

                switch (opcion) {

                    case 1:
                        System.out.println("Has seleccionado 1-CUENTA ATRÁS");
                        break;
                    case 2:
                        System.out.println("Has seleccionado 2-JUEGO DE DADOS");
                        break;
                    case 3:
                    
                        System.out.println("¿Desea salir?. Para salir escriba SI\n");
                        
                        String confirma=sc.nextLine();
                        //con equalsIgnoreCase no diferencia mayusculas de minusculas
                        if (confirma.equalsIgnoreCase("si")){
                          salir = true;
                          
                          
                          
                        }
                       break;
                    case 4: 
                        do{
                        // sc.nextInt(); 
                        //bug. se repite la siguiente linea pero no se como es
                        System.out.println("¿Desea salir?. Para salir escriba SI\n");
                         
                        opt=sc.nextLine();
                        if (opt.equalsIgnoreCase("si")){
                        salir = true;
                        }
                        } while (!opt.equalsIgnoreCase("si"));
                       break;
                    default:
                        System.out.println("Solo números entre 1 y 3");
                }
            } catch (InputMismatchException ime) {
                System.out.println("Carácter no válido. Inserta un número por favor");
                //limpiamos el buffer
                sc.nextInt();
                //salir = false;
            }

        } while (!salir);
    }
    
}

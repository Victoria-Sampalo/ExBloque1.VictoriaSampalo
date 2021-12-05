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
import java.util.Random;
import java.util.Scanner;

public class Ej6Borrador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //MÉTODO SCANNER
        Scanner sc = new Scanner(System.in);
        //VARIABLES JERCICIO 6
        //moneda tiene 2 caras, la controlaremos por un booleano cara=true,
        boolean cara = true;

        //VARIABLES CONTADORES
        int contadorViajes = 0;
        int nutria = 0, pedregales = 0, corominas = 0;

        //objeto de clase tipo random
        Random numAleatorio = new Random();
        System.out.println("Detalle de cada partida: ");
        //BUCLE FOR 
        for (int jugador = 1; jugador <= 10; jugador++) {
            cara = numAleatorio.nextBoolean();
            System.out.println("\n-------------------------\n");
            System.out.println("Jugador " + jugador + ", tiramos la moneda y sale: " + cara);

            if (cara) {
                //de esta forma es de 1 a 6
                int dado = numAleatorio.nextInt(6) + 1;

                System.out.println("El dado sale: " + dado);
                contadorViajes++;

                if (dado == 1 || dado == 3) {
                    System.out.println("Viaje charca de la Nutria");
                    nutria++;
                } else if (dado == 2 || dado == 6) {
                    System.out.println("Viaje parque de los Pedregales");
                    pedregales++;
                } else {
                    System.out.println("Viaje dólmenes de Corominas");
                    corominas++;
                };

            } else {
                System.out.println("Has perdido");

            }

        }
        //CONTADOR RESULTADO FINAL
        System.out.println("\n-------------------------\n"
                + "MARCADOR SORTEO TOTAL\nEn total han tocado: " + contadorViajes + " viajes");
        System.out.println("\nDetalle repartición de viajes:\n");
        System.out.println(nutria + " jugadores han ganado Viaje charca de la Nutria");
        System.out.println(pedregales + " jugadores han ganado Viaje parque de los Pedregales");
        System.out.println(corominas + " jugadores han ganado Viaje dólmenes de Corominas"
                + "\n-------------------------\n");

    }

}

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
public class BorradorEj5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        maximo 1_000
        minumo 100
        
        
        */
       /* System.out.println("Cuenta atrás");
        for (int i = 1000; i < 100; i -=5 ) {
            
            System.out.println("El número i es"+ i);
            
        }
*/
       
     /*  for (char car='a'; car<='z'; car++){
            System.out.println("El caracter "+ (int)car+ " es= " + car);
        }
*/
     
     int contador;
     for(contador =1_000; contador >=100; contador -=5){
         System.out.println(contador);
     }
    }
    
}

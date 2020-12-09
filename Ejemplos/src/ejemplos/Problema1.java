/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

/**
 *
 * @author Nixon
 */
public class Problema1 {
     public static void main(String[] args) {
        String cadena = "aeiou";
        char valor;
        int valorNumerico;
        
        System.out.println(cadena.length()); // 7
        
        // for (int i = 0; i < 7; i++) { // 0 , 1 , 2, 3, 4 , 5, 6, 7, 8, 9
        for (int i = 0; i < cadena.length(); i++) {
            valor = cadena.charAt(i); // aeiou.charAt(0) >> a 
                                      // aeiou.charAt(1) >> b
                                      // aeiou.charAt(2) >> c
                                      // aeiou.charAt(3) >> d
                                      // aeiou.charAt(4) >> e
                                      // aeiou.charAt(5) >> f
                                      // aeiou.charAt(6) >> g
                                       
            valorNumerico = (int) valor; // 
            System.out.printf("%s (%d)\n", valor, valorNumerico);
        }
    }
}

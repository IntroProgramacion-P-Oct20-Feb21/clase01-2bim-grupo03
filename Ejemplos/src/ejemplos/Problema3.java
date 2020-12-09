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
public class Problema3 {
    public static void main(String[]args){
	int intcontador;
	String cadenaAsterisco = ("*"),cadenaAsteriscos2 = ("*");
	System.out.println(cadenaAsterisco);
	for (intcontador = 1;(!(intcontador == 10)) ; intcontador++) {
            cadenaAsterisco = cadenaAsterisco + cadenaAsteriscos2;
            System.out.println(cadenaAsterisco);
	}
    }
}


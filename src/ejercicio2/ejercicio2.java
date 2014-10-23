/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class ejercicio2 {
    
    
    public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);
double num, log=10, result;

System.out.println( "Introduce su numero:" );
num = entrada.nextDouble();

result=	Math.log(num)/(Math.log(log));	

System.out.print( "El logaritmo de   "     + num +      "      es     "       + result );
}
}
    


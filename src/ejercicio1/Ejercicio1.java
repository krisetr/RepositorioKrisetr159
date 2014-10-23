/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {

Scanner entrada = new Scanner(System.in);
int num, exp, result;
String nombre;
System.out.println( "Introduce su numero:" );
num = entrada.nextInt();
System.out.println( "Introduce numero para elevarlo:" );
exp = entrada.nextInt();

result=	(int) Math.pow(num, exp);	

System.out.print( "el final de la operacion es " + result );
}
}
   

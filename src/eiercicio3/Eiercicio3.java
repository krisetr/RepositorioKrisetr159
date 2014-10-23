/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eiercicio3;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Eiercicio3 {

    /**
     * @param args the command line arguments
     */
  public static void main(String[] args) {

Scanner entrada = new Scanner(System.in);
double num, num2, result, resultD, decim=10, resultfinal, resultfinalD;

System.out.println( "Introduce su numero:" );
num = entrada.nextDouble();
System.out.println( "Introduce segundo numero :" );
num2 = entrada.nextDouble();

result=	num*num2;
resultD=num/num2;
resultfinal= Math.round(result*Math.pow(10, decim)/Math.pow(10, decim));
resultfinalD= Math.round(resultD*Math.pow(10, decim)/Math.pow(10, decim));

System.out.print( "el final de la operacion multiplicada es " + resultfinal +" y dividida es "+resultfinalD);
}
}


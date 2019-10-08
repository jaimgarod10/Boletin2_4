
package boletin2_4;

import java.util.Scanner;


public class Boletin2_4 {

   
    public static void main(String[] args) {
        // € a billetes de 100,20, 5 y 1€
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuanto dinero quieres convertir?");
        int dinero = sc.nextInt();
        int cien = dinero / 100;
        int veinte = (dinero % 100) / 20;
        int five = (dinero % 20) / 5;
        int euro = dinero % 5;
        System.out.println("Cantidad de billetes" + cien + " billetes de 100, "
                + veinte + " billetes de 20, " + five + " billetes de 5 y " + euro
                + " monedas de euro");
    }
    
}

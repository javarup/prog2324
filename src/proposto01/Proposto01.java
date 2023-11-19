/*
Introducir polo teclado un número enteiro entre 0 e 1000 e informar de se é
par ou impar.
*/
package proposto01;

import java.util.Scanner;

public class Proposto01 {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número enteiro entre 0 e 1000");
        int numero;
        try {
            numero = Integer.parseInt(teclado.nextLine());
            if (numero < 0 || numero > 1000) {
                System.out.println("O número debe estar entre 0 e 1000");
            } else {
                System.out.println("O número é " + (numero % 2 == 0 ? "par" : "impar"));
            }
        } catch (NumberFormatException e) {
            System.out.println("Debe introducir un número enteiro");
        }
    }
}
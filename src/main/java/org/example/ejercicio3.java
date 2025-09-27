package org.example;
import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args){
        //ejercicio para determinar si un numero es primo o no

        //declaracion de variables
        boolean primo = true;
        int n;

        //Declaracion de scanner
        Scanner sc = new Scanner(System.in);
        System.out.printf("=========================================\n");
        System.out.printf("       Determinar número primo           \n");
        System.out.printf("=========================================\n");
        System.out.printf("Inserte un número: ");
        n = sc.nextInt();

        /*
        *¿Cómo determinar si un número es primo o no?
        * para determinar si un numero es primo tenemos los siguientes pasos:
        * Si el número es menor o igual a 1, no es primo.
        * Si el número es 2, es primo (es el menor primo).
        * Para números mayores a 2:
        * Se debe verificar si el número se puede dividir (de forma exacta) por algún entero entre 2 y la raíz cuadrada del número.
        * Si se encuentra algún divisor (fuera de 1 y él mismo), entonces NO es primo.
        *
        * Algoritmo:
        * Si n <= 1, entonces NO es primo
        * Para i desde 2 hasta raíz(n):
        *   Si n % i == 0, entonces NO es primo
        * Si no encuentras ningún divisor, SÍ es primo
        */

        if (n <= 1){
            primo = false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++){
            if (n % i == 0){
                primo = false;
            }
        }

        if (primo == true){
            System.out.printf("%d es un número primo",n);
        }
        else {
            System.out.printf("%d NO es primo",n);
        }
    }
}

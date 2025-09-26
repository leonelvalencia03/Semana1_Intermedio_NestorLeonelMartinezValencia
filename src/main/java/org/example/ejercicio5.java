package org.example;
import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args){
        //Programa para determinar el factorial de un número
        //Declaración de Scanner
        Scanner sc = new Scanner(System.in);
        //Declaración de variables
        int fact = 1;
        //Programa principal
        System.out.printf("================================\n");
        System.out.printf("    Calculadora de factorial    \n");
        System.out.printf("================================\n");
        System.out.printf("Ingrese un número: ");
        int n = sc.nextInt();

        if (n < 0){
            System.out.printf("\nERROR: no se puede calcular el factorial de un número negativo");
        }

        else if (n == 0 || n == 1){
            fact = 1;
        }

        for (int i = 2; i <= n; i++){
            fact *= i;
        }

        System.out.printf("!%d = %d",n,fact);
    }
}

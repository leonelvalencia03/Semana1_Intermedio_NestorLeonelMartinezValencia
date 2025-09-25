package org.example;
import java.util.Scanner;
import java.math.MathContext;

public class ejercicio2 {
    public static void main(String[] args){
        //Ejercicio No2: Calculadora
        //Declaración de variables
        double n1, n2;
        //Declaracion de la clase Scanner para poder introducir valores
        Scanner sc = new Scanner(System.in);

        System.out.printf("======================================\n");
        System.out.printf("       Calculadora Avanzada           \n");
        System.out.printf("======================================\n");
        System.out.printf("1- Suma\n");
        System.out.printf("2- Resta\n");
        System.out.printf("3- Multiplicación\n");
        System.out.printf("4- Potencia\n");
        System.out.printf("5- Raíz cuadrada\n");
        System.out.printf("Escoga una opción: ");
        int op = sc.nextInt();

        switch (op){
            case 1:
                System.out.printf("\n\nIngrese valor de número 1: ");
                n1 = sc.nextDouble();
                System.out.printf("\nIngrese valor de número 2: ");
                n2 = sc.nextDouble();

                System.out.printf("\n\n%.2f + %.2f = %.2f",n1,n2, n1+n2);
                break;
            default:
                System.out.printf("ERROR: Seleccione una opción válida");
        }

    }
}

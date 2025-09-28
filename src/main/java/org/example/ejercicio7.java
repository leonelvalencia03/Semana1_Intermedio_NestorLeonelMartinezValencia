package org.example;
import java.util.Scanner;
import java.util.Random;

public class ejercicio7 {
    public static void main(String[] args) {
        //Declaracion de Scanner
        Scanner sc = new Scanner(System.in);
        //Declaracion de random
        Random rand = new Random();

        System.out.printf("===============================\n");
        System.out.printf(" Generador de número aleatorio \n");
        System.out.printf("===============================\n");
        //Generando número aletorio
        int numero = rand.nextInt(100) + 1;
        System.out.printf("\nNúmero generado correctamente!\n");

        while(true){
            System.out.printf("Ingrese un numero (1-100): ");
            int numero1 = sc.nextInt();
            if(numero1 < numero){
                System.out.printf("Numero demasiado bajo\n");
            }else if(numero1 > numero){
                System.out.printf("Numero demasiado alto\n");
            }

            if(numero1 == numero){
                System.out.printf("Numero encontrado: %d\n",numero);
                break;
            }
        }
        sc.close();
    }
}

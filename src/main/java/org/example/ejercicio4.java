package org.example;
import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args){
        //Declaración de variables
        int fn1 = 0, fn2 = 1, fn3 = 0;

        //Declaración de Scanner
        Scanner sc = new Scanner(System.in);


        System.out.printf("===================================\n");
        System.out.printf("         Serie de Fibonacci        \n");
        System.out.printf("===================================\n");
        System.out.printf("Cuantos números de desea obtener: ");
        int n = sc.nextInt();

        System.out.printf("\n");
        for(int i = 0; i <= n; i++){
            System.out.printf("%d ",fn1);
            fn3 = fn1 + fn2;
            fn1 = fn2;
            fn2 = fn3;
        }

        sc.close();
    }
}

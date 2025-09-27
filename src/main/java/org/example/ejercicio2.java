package org.example;
import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args){
        //Ejercicio No2: Calculadora
        //Declaración de variables
        double n1, n2;
        //Declaracion de la clase Scanner para poder introducir valores
        Scanner sc = new Scanner(System.in);

       do {
           System.out.printf("======================================\n");
           System.out.printf("       Calculadora Avanzada           \n");
           System.out.printf("======================================\n");
           System.out.printf("1- Suma\n");
           System.out.printf("2- Resta\n");
           System.out.printf("3- Multiplicación\n");
           System.out.printf("4- División\n");
           System.out.printf("5- Potencia\n");
           System.out.printf("6- Raíz cuadrada\n");
           System.out.printf("Escoga una opción: ");
           int op = sc.nextInt();

           switch (op){
               case 1:
                   System.out.printf("\n\nIngrese valor de número 1: ");
                   n1 = sc.nextDouble();
                   System.out.printf("\nIngrese valor de número 2: ");
                   n2 = sc.nextDouble();

                   System.out.printf("\n\n%.2f + %.2f = %.2f",n1,n2,n1+n2);
                   break;
               case 2:
                   System.out.printf("\n\nIngrese valor de número 1: ");
                   n1 = sc.nextDouble();
                   System.out.printf("\nIngrese valor de número 2: ");
                   n2 = sc.nextDouble();

                   System.out.printf("\n\n%.2f - %.2f = %.2f",n1,n2,n1-n2);
                   break;
               case 3:
                   System.out.printf("\n\nIngrese valor de número 1: ");
                   n1 = sc.nextDouble();
                   System.out.printf("\nIngrese valor de número 2: ");
                   n2 = sc.nextDouble();

                   System.out.printf("\n\n%.2f X %.2f = %.2f",n1,n2,n1*n2);
                   break;
               case 4:
                   System.out.printf("\n\nIngrese valor de número 1: ");
                   n1 = sc.nextDouble();
                   System.out.printf("\nIngrese valor de número 2: ");
                   n2 = sc.nextDouble();

                   if (n2 != 0){
                       System.out.printf("\n\n%.2f X %.2f = %.2f",n1,n2,n1*n2);
                   }

                   if (n2 == 0){
                       System.out.printf("ERROR: El denominador no puede ser 0");
                   }
                   break;
               case 5:
                   System.out.printf("\n\nIngrese valor de número 1: ");
                   n1 = sc.nextDouble();
                   System.out.printf("\nIngrese valor de número 2: ");
                   n2 = sc.nextDouble();

                   System.out.printf("\n\n%.2f ^ %.2f = %.2f",n1,n2,Math.pow(n1,n2));
                   break;
               case 6:
                   System.out.printf("\n\nIngrese valor de número al que le desea sacar la raiz: ");
                   n1 = sc.nextDouble();

                   System.out.printf("\n\nsqrt(%.2f)",n1,Math.sqrt(n1));
                   break;
               default:
                   System.out.printf("ERROR: Seleccione una opción válida");
           }

           System.out.printf("\nDesea continuar? (y/n): ");
           sc.nextLine();
           String select = sc.nextLine();

           if (select.toLowerCase().equals("n")){
               break;
           }
       }while (true);

       sc.close();
    }
}

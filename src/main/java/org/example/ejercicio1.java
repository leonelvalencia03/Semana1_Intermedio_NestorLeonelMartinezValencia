package org.example;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        //Ejercicio de banco

        //Seccion de declaración de variables
        double saldo = 0;

        //Creando objeto sc para lograr leer valores por consola
        Scanner sc = new Scanner(System.in);

        //bucle de menu
        do {
            //Menú inicial
            System.out.println("==================================================");
            System.out.println("                   BANCO LEONEL                   ");
            System.out.println("==================================================");

            System.out.println("1- Consultar saldo ");
            System.out.println("2- Depositar dinero ");
            System.out.println("3- Retirar dinero ");
            System.out.println("4- Salir ");

            System.out.print("Escoga una opcion: ");
            int op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.printf("\n\nSu saldo es: %.2f\n", saldo);
                    System.out.println("Presione ENTER para volver al menú.");
                    sc.nextLine();//Limpia el buffer de la entreda
                    sc.nextLine();//Genera una espera para volver al menú
                    break;
                case 2:
                    System.out.println("\n\n");
                    System.out.println("===============================");
                    System.out.println("       Depositar dinero        ");
                    System.out.println("===============================");
                    System.out.print("Coloque la cantidad de dinero: ");
                    double cantidad = sc.nextDouble();
                    if (cantidad > 0){
                        saldo += cantidad;
                        System.out.println("El saldo depositado es: " + cantidad);
                    }

                    else {
                        System.out.println("ERROR: No puede colocar una cantidad negativa");
                        System.out.println("Cantidad depositada \'$0\'");
                    }
                    break;
                case 3:
                    System.out.println("\n\n");
                    System.out.println("===============================");
                    System.out.println("        Retirar dinero         ");
                    System.out.println("===============================");
                    System.out.print("Coloque la cantidad de dinero que desea retirar: ");
                    double cantidadRetirada = sc.nextDouble();

                    if (saldo >= cantidadRetirada) {
                        saldo -= cantidadRetirada;
                        System.out.println("El saldo retirado es: " + cantidadRetirada);
                    }

                    else {
                        System.out.println("ERROR: Saldo insuficiente");
                        sc.nextLine();//Limpia el buffer de la entreda
                        sc.nextLine();//Genera una espera para volver al menú
                    }
                    break;
                case 4:
                    break;
                default:
                    System.err.println("Por favor ingrese una opcion valida");
            }

            if (op == 4){
                break;
            }
        }while (true);

        sc.close();
    }

}

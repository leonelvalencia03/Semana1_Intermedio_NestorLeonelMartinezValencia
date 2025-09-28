package org.example;
import java.util.Scanner;
import java.util.ArrayList;

public class ejercicio8 {
    public static void main(String[] args) {
        //Declaracion de Scanner
        Scanner sc = new Scanner(System.in);

        //Declaracion de variables
        double valorTotal = 0;
        //Declaracion de los ArrayList
        ArrayList<String> nombre = new ArrayList<>();
        ArrayList<Double> precio = new ArrayList<>();
        ArrayList<Integer> cantidad = new ArrayList<>();

        while(true){
            System.out.printf("\n==============================\n");
            System.out.printf("    Sistema de inventario     \n");
            System.out.printf("==============================\n");
            System.out.printf("1- Registrar un producto\n");
            System.out.printf("2- Mostrar productos registrados\n");
            System.out.printf("3- Calcular valor total del inventario\n");
            System.out.printf("4- Salir\n");
            System.out.printf("Escoga una opción: ");
            int op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.printf("\n********Registrar un producto********\n");
                    System.out.printf("Coloque el nombre del producto: ");
                    sc.nextLine();
                    nombre.add(sc.next());
                    System.out.printf("Coloque precio del producto: ");
                    precio.add(sc.nextDouble());
                    System.out.printf("Coloque cantidad del inventario: ");
                    cantidad.add(sc.nextInt());

                    System.out.printf("Producto agregado correctamente!\n");
                    break;
                case 2:
                    System.out.printf("\n********Mostrar productos registrados********\n");
                    for (int i = 0; i < nombre.size(); i++) {
                        System.out.printf("Producto     ||Nombre     ||Precio      ||Cantidad\n");
                        System.out.printf("%d             %s           $%.2f        %d",i+1,nombre.get(i),precio.get(i),cantidad.get(i));
                    }
                    break;
                case 3:
                    System.out.printf("\n********Calcular valor total del inventario********\n");
                    for (int i = 0; i < nombre.size(); i++) {
                        double valor = cantidad.get(i) * precio.get(i);
                        valorTotal += valor;
                    }

                    System.out.printf("El valor total del inventario es: $%.2f", valorTotal);
                    break;
                case 4:
                    break;
                default:
                    System.out.printf("ERROR: Porfavor ingrese un valor válido");
                    break;
            }

            if (op == 4) {
                break;
            }
        }
        sc.close();
    }
}
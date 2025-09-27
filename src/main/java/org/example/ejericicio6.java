package org.example;
import java.util.Scanner;

public class ejericicio6 {
    public static void main(String[] args) {
        //Ejercicio para determinar la nota más alta y más baja
        //Declaración de escaner
        Scanner sc = new Scanner(System.in);
        //Declaracion de variables
        double notap = 0, notaM = 0, notam = 10, temp = 0;
        int i;

        System.out.printf("=======================================\n");
        System.out.printf("           Control de notas            \n");
        System.out.printf("=======================================\n");
        System.out.printf("Ingrese la cantidad de notas que desea ingresar: ");
        int cantidad = sc.nextInt();

        for (i = 1; i <= cantidad; i++) {
            System.out.printf("\nIngrese el valor nota %d: ",i);
            double nota = sc.nextDouble();
            temp += nota;
            if (notaM < nota) {
                notaM = nota;
            }

            if (notam > nota) {
                notam = nota;
            }
        }
        notap = temp / cantidad;
        System.out.printf("Nota promedio: %.2f\n", notap);
        System.out.printf("Nota menor: %.2f\n", notam);
        System.out.printf("Nota maior: %.2f\n", notaM);
        sc.close();
    }
}
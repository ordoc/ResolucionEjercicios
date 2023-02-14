package com.example;

import java.util.Scanner;
public class Tema2 {
    public static void main(String[] args) {

        int precio = 0;
        calcularIva(precio);
    }

    private static void calcularIva(int precio) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int numero = scanner.nextInt();
        double iva = numero * 0.19;
        double suma = numero + iva;
        System.out.println("El precio con IVA es: " + suma);
    }
}

package br.com.dio.calculadora;

import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double a;
        double b;

        System.out.println("Digite o primeiro valor: ");
        a = scan.nextDouble();
        System.out.println("Digite o segundo valor: ");
        b = scan.nextDouble();

        double somar = somar(a, b);
        double subtrair = subtrair(a, b);
        double multiplicar = multiplicar(a, b);
        double dividir = dividir(a, b);

        System.out.println("somar: " + somar);
        System.out.println("subtrair: " + subtrair);
        System.out.println("multi: " + multiplicar);
        System.out.println("somar: " + dividir);


    }
    public static double somar(double a, double b) {
        return a + b;
    }
    public static double subtrair(double a, double b) {
        return a - b;
    }
    public static double multiplicar(double a, double b) {
        return a * b;
    }
    public static double dividir(double a, double b) {
        return a / b;
    }

}

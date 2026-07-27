package aula_3.Exercicios;

import java.util.Scanner;

public class Algoritmo_460 {
    public static void main(String[] args) {
        double num01;
        double num02;
        double num03;
        double total;
        System.out.println("VIDEO");
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        num01 = ler.nextDouble();
        System.out.println("Digite o segundo numero: ");
        num02 = ler.nextDouble();
        System.out.println("Digite o terceiro numero: ");
        num03 = ler.nextDouble();
        double d1 = dobro1(num01);
        double d2 = dobro2(num02);
        double d3 = dobro3(num03);
        total = d1 + d2 + d3;
        System.out.println("Total: " + total);
    }
    private static double dobro1(double a) {
        double total = a * 2;
        System.out.println("Dobro 1: " + total);
        return total;
    }
    private static double dobro2(double b) {
        double total = b * 2;
        System.out.println("Dobro 2: " + total);
        return total;
    }
    private static double dobro3(double c) {
        double total = c * 2;
        System.out.println("Dobro 3: " + total);
        return total;
    }
}

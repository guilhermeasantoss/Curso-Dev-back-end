package aula_3.Desafios;

import java.util.Scanner;

public class calculadora_parametro {
    public static void main(String[] args) {
        double num01, num02, num03;
        String op = "";

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        num01 = ler.nextDouble();
        System.out.println("Digite outro número: ");
        num02 = ler.nextDouble();
        System.out.println("Digite outro número: ");
        num03 = ler.nextDouble();
        System.out.println("Digite a operação");
        op = ler.next();

        switch (op) {
            case "+": {

                somar(num01, num02);
                somar(num01, num02, num03);
                break;
            }
            case "-": {

                subtrair(num01, num02);
                break;
            }
            case "*": {

                multiplicar(num01, num02);
                break;
            }
            case "/": {

                dividir(num01, num02);
                break;
            }
            default: {
                break;
            }
        }
    }

    private static void somar(double a, double b, double c) {
        double total;
        total = a + b + c;
        System.out.println("Resultado soma: " + total);
    }

    private static void dividir(double a, double b) {
        double total;
        total = a / b;
        System.out.println("Resultado divisão: " + total);


    }

    private static void multiplicar(double a, double b) {
        double total;
        total = a * b;
        System.out.println("Resultado multiplicação: " + total);

    }

    private static void subtrair(double a, double b) {
        double total;
        total = a - b;
        System.out.println("Resultado subtração: " + total);
    }

    private static void somar(double a, double b) {
        double total;
        total = a + b;
    }
}

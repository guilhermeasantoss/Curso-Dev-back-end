package aula_3.Exercicios;

import java.util.Scanner;

public class Algoritmo_43 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		double numero = scanner.nextDouble();
		
		double log10 = Math.log10(numero);
		System.out.println("Log10(" + numero + ")="+log10);
		scanner.close();

	}

}

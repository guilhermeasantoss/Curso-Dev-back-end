package aula_3.Exercicios;

import java.util.Scanner;

public class Algoritmo_44 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		double numero = scanner.nextDouble();
		
		System.out.println("Digite um base: ");
		double base = scanner.nextDouble();
		
		double resultado = Math.log(numero) / Math.log(base);
		System.out.println("log"+base+"("+numero+")="+ resultado);
		scanner.close();

	}

}

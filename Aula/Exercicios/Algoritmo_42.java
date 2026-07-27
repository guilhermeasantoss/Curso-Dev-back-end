package aula_3.Exercicios;

import java.util.Scanner;

public class Algoritmo_42 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Coloque um Ângulo: ");
		int numero = ler.nextInt();
		
		System.out.println("Seno: "+Math.sin(Math.toRadians(numero)));
		System.out.println("Cosseno: "+Math.cos(Math.toRadians(numero)));
		System.out.println("Tangente: "+Math.tan(Math.toRadians(numero)));
		System.out.println("Secante: "+(1.0 / Math.cos(Math.toRadians(numero))));
		System.out.println("Co-Secante: "+(1.0 / Math.sin(Math.toRadians(numero))));
		System.out.println("Co-Tangente: "+(1.0 / Math.tan(Math.toRadians(numero))));
		
		

	}

}

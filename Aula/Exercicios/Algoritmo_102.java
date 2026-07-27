package aula_3.Exercicios;

import java.util.Scanner;

public class Algoritmo_102 {

	public static void main(String[] args) {
		int numero;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite um numero:");
		numero = ler.nextInt();
		
		if(numero>20) {
			System.out.println("Ele é maior que 20");
		}else if(numero == 20) {
			System.out.println("Ele é igual a 20");
		}else {
			System.out.println("Ele é menor que 20");
		}
		ler.close();
	}

}

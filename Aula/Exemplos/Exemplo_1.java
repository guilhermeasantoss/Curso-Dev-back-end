package aula_3;

import java.util.Scanner;

public class Exemplo_1 {

	public static void main(String[] args) {
		int idade;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite a sua idade:");
		idade = ler.nextInt();
		
		if(idade>=18) {
			System.out.println("Pode dirigir");		
		}else {
			System.out.println("Não pode dirigir");
		}

	}

}

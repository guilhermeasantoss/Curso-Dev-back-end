package aula_3;

import java.util.Scanner;

public class Exemplo_3 {

	public static void main(String[] args) {
		int nota;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite sua nota:");
		nota = ler.nextInt();
		
		if(nota>=7) {
			System.out.println("Aprovado!");
		}else if(nota>=5 && nota<7) {
			System.out.println("Recuperação!");
		}else {
			System.out.println("Reprovado!");
		}

	}

}

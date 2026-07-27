package aula_3;

import java.util.Scanner;

public class Exemplo_6 {

	public static void main(String[] args) {
		Scanner ler =  new Scanner(System.in);
		String op="";
		System.out.println("Digite a operação:");
		op = ler.next();
		
		switch(op) {
		
		case "+":
			somar();
		break;
		case "-":
			subtrair();
		break;
		case "*":
			multiplicar();
		break;
		case "/":
			dividir();
		break;
		case "Raiz":
			raiz();
		break;
		default:
			System.out.println("Opção Inválida");
		}
		
	}
	public static void somar() {
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite os numeros:");
		double num01 = ler.nextDouble();
		double num02 = ler.nextDouble();
		double total = num01+num02;
		System.out.println("Total:"+total);
	}
	public static void subtrair() {
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite os numeros:");
		double num01 = ler.nextDouble();
		double num02 = ler.nextDouble();
		double total = num01-num02;
		System.out.println("Total:"+total);
	}
	public static void multiplicar() {
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite os numeros:");
		double num01 = ler.nextDouble();
		double num02 = ler.nextDouble();
		double total = num01*num02;
		System.out.println("Total:"+total);
	}
	public static void dividir() {
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite os numeros:");
		double num01 = ler.nextDouble();
		double num02 = ler.nextDouble();
		double total = num01/num02;
		System.out.println("Total:"+total);
	}
	public static void raiz() {
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite os numeros:");
		double num01 = ler.nextDouble();
		double num02 = ler.nextDouble();
		double total = Math.sqrt(num01);
		System.out.println("Total:"+total);
	}


}

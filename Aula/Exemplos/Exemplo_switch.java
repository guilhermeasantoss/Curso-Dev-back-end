package aula_3;

public class Exemplo_switch {

	public static void main(String[] args) {
		String opcao = "3";
		
		switch(opcao) {
		
		case "1":
			System.out.println("Opção 1:");
			break;
		case "2":
			System.out.println("Opção 2:");
			break;
		default:
			System.out.println("Opção Inválida");
			break;
		}

	}

}

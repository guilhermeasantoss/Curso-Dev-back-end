package aula_3;

import java.util.Scanner;

public class Exemplo_8 {
    public static void main(String[] args) {
        int numero = 0;
        Scanner ler = new Scanner(System.in);

        while (true) {
            System.out.println("Digite o numero ou 0 para encerar: ");
           numero = ler.nextInt();
            if (numero == 0){
               System.out.println("Fim");
               break;
            }
        }
    }
}

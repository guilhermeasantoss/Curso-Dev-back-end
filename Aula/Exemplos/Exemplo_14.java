package aula_3;

import java.util.Scanner;

public class Exemplo_14 {
    public static void main(String[] args) {
        int [][] matriz= new int [3][3];
        int num;
        Scanner ler = new Scanner(System.in);

        for(int linha= 0; linha < matriz.length; linha++){
            for (int coluna = 0; coluna < matriz.length; coluna++){

                System.out.println("Digite um numero:  ");
                matriz[linha][coluna] = ler.nextInt();

                System.out.println("|"+linha+","+coluna+"|");
            }
        }
    }

}

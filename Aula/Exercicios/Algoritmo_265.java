package aula_3.Exercicios;

import java.util.Scanner;

public class Algoritmo_265 {
    public static void main(String[] args) {
        int cont= 0, num;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        num = ler.nextInt();

        while (true){
            if (num >=100 && num<=200){
                cont=cont+1;
            } else if (num == 0) {
                break;
            }
            System.out.println("Digite outro numero: ");
        }



    }

}



package aula_3.Exercicios;

import java.util.Scanner;

public class Algoritmo_262 {
    public static void main(String[] args) throws InterruptedException {
        Scanner x3po= new Scanner(System.in);
        int num;
        int total;
        while (true){
            System.out.println("Digite um numero: ");
            num = x3po.nextInt();
            if(num != -999){
                total= num*3;
                System.out.println(total);
            }else {
                System.out.println("Fim CARALHO");
                break;
            }
        }


    }
}

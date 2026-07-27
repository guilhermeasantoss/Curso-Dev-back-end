package aula_3.Desafios;

import java.util.Scanner;

public class Desafio_01 {
    public static void main(String[] args) {
       int salario;

       Scanner ler = new Scanner(System.in);
       System.out.println("Digite o salrio: ");
       salario = ler.nextInt();

       if (salario < 1000){
           double total1 = salario+(salario*0.40);
       }else if (salario > 1000){
           double total2 = salario+(salario*0.30);
           System.out.println("Seu salario agora é" +total2);
       }
    }
}


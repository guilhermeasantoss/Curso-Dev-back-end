package aula_3.Exercicios;

import java.util.Scanner;

public class Algoritmo_263 {
    public static void main(String[] args) {
      int cont = 0;
      int num;
      Scanner ler = new Scanner(System.in);
        System.out.println("Digite um numero: ");
      while (true){

          num = ler.nextInt();
          if(num>0){
              cont = cont+1;

          }else{
              System.out.println("FIM GALAI");
              break;
          }

      }
        System.out.println("Numeros digitados:  "+cont);
    }








}

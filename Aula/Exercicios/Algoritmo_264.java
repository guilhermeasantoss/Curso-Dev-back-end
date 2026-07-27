package aula_3.Exercicios;

import java.util.Scanner;

public class Algoritmo_264 {
    public static void main(String[] args) {
        double cm = 0;
        int cont=0;
        double media;
        double num;
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um numero positivo: ");
        num = ler.nextDouble();

        while(true){
            if (num>0){
                cm = cm + num;
            }else {
                break;
            } cont++;
            System.out.println("Digite um numero positivo: ");
            num = ler.nextDouble();
        }
        media=cm/cont;
        System.out.println("Media: "+media);


    }
}

import java.util.Scanner;

public class Calculos_aula_01 {
    double num01;
    double num02;
    double total;


    double retornar01(){
        Scanner ler = new Scanner(System.in);
        num01 = ler.nextDouble();
        return  num01;

    }

    double retornar02(){
        Scanner ler = new Scanner(System.in);
        num02 = ler.nextDouble();
        return  num02;

    }

    void somar(double a, double b){
        num01 = a;
        num02 = b;
        total = num01 + num02;
        System.out.println("total: "+total);
    }

    void diminuir(double a, double b){
        num01 = a;
        num02 = b;
        total = num01 - num02;
        System.out.println("total: "+total);
    }

    void multiplicar(double a, double b){
        num01 = a;
        num02 = b;
        total = num01 * num02;
        System.out.println("total: "+total);
    }

    void dividir(double a, double b){
        num01 = a;
        num02 = b;
        total = num01 / num02;
        System.out.println("total: "+total);
    }



}

import java.util.Scanner;

public class Calculadora_Aula_01 {
    public static void main(String[] args) {
        Calculos_aula_01 calculadora = new Calculos_aula_01();
        Scanner ler = new Scanner(System.in);
        String op="";
        op = ler.next();

        switch (op){
            case"+":{
                calculadora.somar(calculadora.retornar01(), calculadora.retornar02());
                break;
            }case"-":{
                calculadora.diminuir(calculadora.retornar01(), calculadora.retornar02());
                break;
            }case"*":{
                calculadora.multiplicar(calculadora.retornar01(), calculadora.retornar02());
                break;
            } case "/":{
                calculadora.dividir(calculadora.retornar01(), calculadora.retornar02());
                break;
            }
        }

    }
}

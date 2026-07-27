import java.util.Scanner;

public class SolicitarCalculos {
    Calculos calc = new Calculos();
    void calcular(){
        Scanner src = new Scanner(System.in);

        System.out.print("Digite a opreação: ");
        String op = src.nextLine();

        switch(op){
            case "+":
                calc.somar(calc.retornar01(),calc.retornar02());

                break;
            case "-":
                calc.subtrair(calc.retornar01(),calc.retornar02());

                break;
            case "*":
                calc.multiplicar(calc.retornar01(),calc.retornar02());

                break;
            case"/":
                calc.dividir(calc.retornar01(), calc.retornar02());

                break;
        }

    }
}

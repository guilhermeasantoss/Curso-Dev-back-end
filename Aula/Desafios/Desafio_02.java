package aula_3.Desafios;

import java.util.Scanner;

public class Desafio_02 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
            System.out.print("Nível (1 a 4): ");
            int nivel = ler.nextInt();

            System.out.print("Dia do pagamento: ");
            int dia = ler.nextInt();

            double valor = 0;

            switch (nivel) {
                case 1: valor = 51.50; break;
                case 2: valor = 65.00; break;
                case 3: valor = 80.00; break;
                case 4: valor = 100.00; break;

                default:
                    System.out.println("Nível inválido!");
                    return;
            }
            double desconto = 0;
            switch (dia) {
                case 1:
                    desconto = 0.15;
                    break;
                case 2:
                case 3:
                case 4:
                case 5:
                    desconto = 0.10;
                    break;

                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    desconto = 0.0389;
                    break;
                default:
                    desconto = 0;
                    break;
            }
            double valorDesconto = valor * desconto;
            double valorFinal = valor - valorDesconto;
            System.out.printf("Valor do desconto: R$ %.2f%n", valorDesconto);
            System.out.printf("Valor final da mensalidade: R$ %.2f%n", valorFinal);

        }
    }



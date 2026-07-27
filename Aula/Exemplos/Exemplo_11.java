package aula_3;

public class Exemplo_11 {
    public static void main(String[] args) {

        int [] vetor = new int[10];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = i+1;
        }
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Posição:"+i);
            System.out.println("\t"+vetor[i]);
        }
    }
}

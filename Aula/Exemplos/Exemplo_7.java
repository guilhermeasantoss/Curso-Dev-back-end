package aula_3;

public class Exemplo_7 {

    public static void main(String[] args) throws InterruptedException {

        int cont= 0;
        while (cont < 3){
            System.out.println("Volta:  "+cont);
            Thread.sleep(1000);
            cont++;
        }
        System.out.println("Voltas concludas");



    }
}

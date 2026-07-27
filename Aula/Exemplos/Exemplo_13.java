package aula_3;

public class Exemplo_13 {
    public static void main(String[] args) throws InterruptedException {
    String[]frutas={"laranja","Banana","Abacate","tomate","Kiwi","Jabuticaba","Acerola","manga","uva","pitaya"};

    for(int i=0;i<frutas.length;i++){
        System.out.println("Fruta: "+frutas[i]);
        Thread.sleep(1000);
    }
    }
}

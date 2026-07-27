package aula_3;

public class Exemplo_19 {
    public static void main(String[] args) {
        double dinheiro = 100.00;
        double carteira= 0;
        double troco =0;

        carteira= bolo(carteira);
        //System.out.println("Receci: "+bolo(carteira);//
        System.out.println("Recebi da amanda: "+bolo(dinheiro));

        comprar_chantiy(carteira);

        troco= comprar_chantiy(carteira);
        System.out.println("Troco: "+troco);
    }

    private static double comprar_chantiy(double a) {
        double total = a+70.00;
        return  total;
    }

    private static double bolo(double a){

        System.out.println("Comprei o material");
        System.out.println("Assei o bolo");
        System.out.println("Bolo pronto");
        System.out.println("Pode vir pegar!!!!");
        System.out.println("Tem 20,00 reais de troco");
        a=20.00;
        return a;
    }
}

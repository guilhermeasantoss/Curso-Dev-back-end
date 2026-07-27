public class Veiculo_01_aula_01 {
    // atributos ou variaveis globais
    // O que tenho ?(Atributos)
    String modelo;
    String cor;
    int capacidade;
    String tipo;
    int velocidade;
    boolean desligado;
    boolean ligado;

    //Definir o que faço(Métodos)
    public void acelerar() throws InterruptedException {
        int cont=0;

        if(ligado == true) {
            while(cont <= 300) {
                System.out.println("Acelerando");
                System.out.println(velocidade);
                Thread.sleep(200);
                cont = cont+10;
                velocidade+=10;
            }
        }else{
            System.out.println("Não posso estou desligado");
        }
    }
    public void parar() throws InterruptedException {
        int cont=0;

        if(ligado == true) {
            while( cont <= velocidade) {
                System.out.println("Parando");
                System.out.println(velocidade);
                Thread.sleep(500);
                cont = cont-10;
                velocidade-=10;
                if(velocidade == 0) {
                    break;
                }
            }
        }else{
            System.out.println("Não posso estou desligado");
        }
    }
    public void ligar() {

    }
    public void desligar() {

    }
}

public class carro_Aula_01 {
        public static void main(String[] args) throws InterruptedException {
            Veiculo_01_aula_01 BMW_M3_06 = new Veiculo_01_aula_01();

            BMW_M3_06.modelo = "BMW";
            BMW_M3_06.cor = "Azul e Prata";
            BMW_M3_06.capacidade = 2;
            BMW_M3_06.tipo = "Esportivo";
            BMW_M3_06.ligado = true;
            BMW_M3_06.desligado = false;

            BMW_M3_06.acelerar();
            BMW_M3_06.parar();


        }
}

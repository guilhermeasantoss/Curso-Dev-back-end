# Curso de Qualificação Profissional — Desenvolvedor Back-End

> O curso tem por objetivo o desenvolvimento de competências relativas a projetar, desenvolver e manter sistemas e aplicativos na parte do servidor, seguindo boas práticas, procedimentos e normas.

**Carga Horária:** 160 horas

---

## Programação — Conhecimentos

### Ambiente de Desenvolvimento Web

- 1.1. Definição
- 1.2. Histórico
- 1.3. Características
- 1.4. Ambiente de desenvolvimento
  - 1.4.1. Instalação e configuração
  - 1.4.2. Recursos e interfaces
  - 1.4.3. Gerenciamento de dependências

---

### Levantamento de Requisitos

- 2.1. Brainstorm
- 2.2. Questionário
- 2.3. Entrevista
- 2.4. Etnografia
- 2.5. Workshop
- 2.6. Prototipagem
- 2.7. **Documentação de Casos de Uso** *(Engenharia de Software I — Profª MSc. Carla Calixto)*

A documentação de casos de uso mapeia a interação entre o **ator** (quem participa) e o **sistema**. A regra de ouro: a documentação deve ser **simples e de fácil acesso**, compreendida tanto por desenvolvedores quanto por stakeholders.

**Anatomia de um documento de caso de uso:**
1. **Identificação** — nome do caso de uso e resumo descritivo do que ele faz.
2. **Atores & Condições** — quem participa (atores principais/secundários), o que deve ser verdade antes (pré-condições) e depois (pós-condições).
3. **Fluxo de Eventos** — passo a passo alternado entre as ações do Ator e as ações do Sistema (o "caminho feliz").

**Exemplo — Caso de Uso "Abrir Conta":**

| Campo | Descrição |
|---|---|
| Ator Principal | Cliente |
| Atores Secundários | Funcionário |
| Resumo | Descreve as etapas percorridas por um cliente para abrir uma conta corrente |
| Pré-condições | O pedido precisa ser aprovado |
| Pós-condições | É necessário realizar um depósito inicial |

| Ações do Ator | Ações do Sistema |
|---|---|
| 1. Solicitar conta | |
| | 2. Consultar cliente por seu CPF |
| | 3. Avaliar pedido do cliente |

---

### Metodologias de Desenvolvimento

- 3.1. Clássicas
- 3.2. Ágeis

---

### Lógica de Programação e Algoritmos

- 4.1. Algoritmos
  - 4.1.1. Descritivo
  - 4.1.2. Fluxogramas
  - 4.1.3. Decisões
  - 4.1.4. Repetições
  - 4.1.5. Estruturas de dados
- 4.2. Lógica
  - 4.2.1. Lógica proposicional
  - 4.2.2. Operadores aritméticos
  - 4.2.3. Operadores lógicos
  - 4.2.4. Operadores relacionais

#### Condicional *(Aula do dia 14/07/2026 — Terça-feira)*

**If e Else:** `if` (se) avalia uma condição inicial. O `else if` (senão se) cria novas condições alternativas testadas em sequência caso as anteriores sejam falsas. O `else` (senão) final executa um código genérico se nenhuma das opções acima for verdadeira.

#### Array *(Aula do dia 16/07/2026 — Quinta-feira)*

> "As vezes você não morre como um herói, apenas..."

Um **array** é simplesmente uma lista de itens guardada dentro de uma única variável. Em vez de criar uma variável para cada coisa (como `item1`, `item2`, `item3`), você cria um único array que guarda tudo junto.

---

### Linguagem de Programação

- 5.1. Variáveis e constantes
- 5.2. Operadores
- 5.3. Laços
  - 5.3.1. De repetição
  - 5.3.2. Condicionais
- 5.4. Classes
- 5.5. Função
- 5.6. Bibliotecas
  - 5.6.1. Manipulação de arquivos
  - 5.6.2. Conversão de arquivos
- 5.7. Documentação de software

#### Métodos com e sem retorno *(Aula do dia 20/07/2026 — Segunda-feira)*

**Métodos sem retorno** (declarados com `void`) executam uma ação específica e encerram suas atividades sem devolver nenhum resultado para quem os chamou. Eles são ideais para operações como alterar variáveis, salvar dados ou imprimir mensagens na tela, em vez de calcular um valor.

**Métodos com retorno** são blocos de código que executam uma tarefa e devolvem um resultado (como um cálculo ou texto) para a parte do sistema que os chamou. Diferente dos métodos `void`, eles declaram o tipo de dado devolvido e usam a instrução `return` para finalizar a execução e enviar o valor.

**Métodos Estáticos:** são funções que pertencem à **classe em si**, e não às instâncias (objetos) criadas a partir dela. Em termos práticos, isso significa que você não precisa usar o comando `new` para criar um objeto antes de chamar o método — você o chama diretamente pelo nome da classe.

---

### Programação Orientada a Objetos

- 6.1. Definição
- 6.2. Pacotes
- 6.3. Classes
- 6.4. Abstrata
- 6.5. Interna
- 6.6. Anônima
- 6.7. Atributos
- 6.8. Métodos
- 6.9. Modificadores de acesso (encapsulamento)
- 6.10. Objetos
- 6.11. Interface
- 6.12. Polimorfismo
- 6.13. Enumerações
- 6.14. Relacionamentos de objetos
- 6.15. Herança
- 6.16. Agregação
- 6.17. Composição
- 6.18. Modelagem UML e Casos de Uso

#### 6.1 Definição — Origem e Fundamentos *(Aula do dia 21/07/2026 — Terça-feira)*

A Programação Orientada a Objetos (POO) surgiu na década de 70. **Alan Kay**, um dos pais da POO, cunhou o termo. Em vez de focar apenas em classes, ele definiu o conceito a partir de **mensagens, isolamento e proteção local de estados** — comparando objetos a células biológicas, que se comunicam exclusivamente enviando mensagens umas às outras.

**Os quatro pilares da POO** — abstração, encapsulamento, herança e polimorfismo — formam a base para criar códigos mais seguros, reutilizáveis e fáceis de dar manutenção.

**Exemplo — Classe Veículo:**

| O que tenho / Atributos | O que faço / Métodos | Como estou |
|---|---|---|
| Modelo | Acelerar | Acelerando |
| Cor | Freio | Freiando |
| Capacidade | Ligar | Ligando |
| | Desligar | Desligando |

```java
package Aula_01;

import java.util.Scanner;

public class Veiculo {
    // Variaveis Globais
    String modelo;
    String cor;
    int capacidade;
    String tipo;
    int velocidade = 0;
    boolean ligado;
    boolean desligado;

    // o que faço
    public void acelerar() throws InterruptedException{
        Scanner ler = new Scanner(System.in);

        // Variaveis locais
        int cont = 0;

        if(ligado == true) {
            while (cont <= 120) {
                System.out.println("Acelerando");
                System.out.println(velocidade);
                Thread.sleep(1000);
                cont = cont + 10;
                velocidade += 10;
            }
        }else {
            System.out.println("Não posso estou desligado");
        }
        ler.close();
    }

    public void parar() throws InterruptedException{
        Scanner ler = new Scanner(System.in);
        int cont = 0;

        if(ligado == true) {
            while (cont <= velocidade) {
                System.out.println("Parando");
                System.out.println(velocidade);
                Thread.sleep(1000);
                cont = cont - 10;
                velocidade -= 10;
                if (velocidade < 0) {
                    System.out.println("Carro parado");
                    break;
                }
            }
        }else {
            System.out.println("Não posso estou desligado");
        }
        ler.close();
    }

    public void ligar(){
        System.out.println("ligando");
    }

    public void desligar(){
        System.out.println("desligando");
    }
}
```

**Exemplo — Calculadora orientada a objetos (Aula_01b):**

```java
package Aula_01b;

import java.util.Scanner;

public class Calculos {
    double num01;
    double num02;
    double total;
    Scanner ler = new Scanner(System.in);

    double retornar01() {
        System.out.println("Digite um numero: ");
        num01 = ler.nextDouble();
        return num01;
    }

    double retornar02() {
        System.out.println("Digite outro numero: ");
        num02 = ler.nextDouble();
        return num02;
    }

    void somar(double a, double b) {
        num01 = a; num02 = b;
        total = num01 + num02;
        System.out.println(num01+" + "+num02+" = "+total);
    }
    void substrair(double a, double b) {
        num01 = a; num02 = b;
        total = num01 - num02;
        System.out.println(num01+" - "+num02+" = "+total);
    }
    void multiplicar(double a, double b) {
        num01 = a; num02 = b;
        total = num01 * num02;
        System.out.println(num01+" * "+num02+" = "+total);
    }
    void dividir(double a, double b) {
        num01 = a; num02 = b;
        total = num01 / num02;
        System.out.println(num01+" / "+num02+" = "+total);
    }
}
```

```java
package Aula_01b;

import java.util.Scanner;

public class SolicitarCalculo {
    void calcular() {
        String operacao = "";
        Scanner ler = new Scanner(System.in);
        Calculos calculadora = new Calculos();
        System.out.println("Escolha a operação: ");
        operacao = ler.next();

        switch (operacao) {
            case "+": calculadora.somar(calculadora.retornar01(), calculadora.retornar02()); break;
            case "-": calculadora.substrair(calculadora.retornar01(), calculadora.retornar02()); break;
            case "*": calculadora.multiplicar(calculadora.retornar01(), calculadora.retornar02()); break;
            case "/": calculadora.dividir(calculadora.retornar01(), calculadora.retornar02()); break;
            default: System.out.println(operacao+" Não é uma operação valida; "); break;
        }
        ler.close();
    }
}
```

```java
package Aula_01b;

public class Calculadora {
    public static void main(String[] args) {
        SolicitarCalculo calc = new SolicitarCalculo();
        calc.calcular();
    }
}
```

#### 6.18 Modelagem UML e Casos de Uso *(Aula 8 — Fundamentos da Orientação a Objetos e Modelagem UML)*

**A Convergência de 1995:** antes da UML, o desenvolvimento de software carecia de uma linguagem universal. Três especialistas unificaram suas metodologias para criar o padrão global: **Grady Booch** (Método Booch), **James Rumbaugh** (OMT) e **Ivar Jacobson** (OOSE), resultando na **UML 0.8 — Linguagem Unificada de Modelagem (1995)**.

**O Paradigma da Orientação a Objetos:** a OO aproxima o desenvolvimento de software do mundo real — entidades digitais recebem características (atributos) e habilidades (métodos) próprias. Ex.: um Carro no mundo real vira uma classe `Carro` com atributos (`nomeFabricante`, `cor`, `numeroPortas`...) e métodos (`abrirPortas()`, `acelerar()`, `frear()`...).

**O Poder da Abstração:** *"Uma abstração define uma fronteira relativa à perspectiva do observador"* (Booch, Rumbaugh e Jacobson, 2005). Um mesmo carro pode ser abstraído de formas diferentes conforme o observador: a Oficina (foco na manutenção — placa, histórico de consertos), a Casa (foco no uso diário — km/litro, agenda de manutenção) e o Detran (foco na legalidade — chassi, impostos, Renavam).

**Classes vs. Objetos:** a classe é a **fôrma** — uma descrição estática do conjunto (atributos: o que tem; métodos: o que faz). Os objetos são as **instâncias** dessa classe — compartilham a semântica da classe, mas possuem identidades únicas (ex.: classe `Cachorro`, objetos `Scooby` e `Rex`).

**O Ciclo de Projeto OO:** da Análise (o quê) para o Projeto (como):
1. **Identificação de Classes** — mapear objetos do mundo real envolvidos no sistema.
2. **Mapeamento de Atributos** — extrair apenas as características relevantes (abstração).
3. **Definição de Métodos** — determinar comportamentos, ações e tempos de resposta.

**O Universo UML** se divide em diagramas **Estruturais** (Classe, Componente, Distribuição, Entidade-Associação) e **Comportamentais** (Caso de Uso, Estado, Sequência, Colaboração, Atividade).

**Anatomia do Diagrama de Casos de Uso:**
- **Ator** — entidade externa que interage com o sistema (representado pelo ícone *stickman*).
- **Associação** — linha sólida de comunicação conectando o ator à ação.
- **Caso de Uso** — a transação/serviço completo, representado por uma elipse.

**A Matriz de Atores:** atores representam **papéis**, não necessariamente seres humanos:
- **Pessoas** — usuários, secretárias, alunos, professores.
- **Dispositivos** — impressoras, computadores terminais.
- **Hardware** — placas de modem, controladoras de sensores.
- **Software** — bancos de dados externos, APIs, outros aplicativos.

**As 3 Regras de Ouro** — todo caso de uso válido deve obrigatoriamente satisfazer:
1. **Conexão Externa** — cada caso de uso está relacionado com, no mínimo, um ator.
2. **Ignição** — cada caso de uso possui um ator iniciador (quem dispara a ação).
3. **Valor de Negócio** — cada caso de uso deve levar a um resultado relevante e completo para o sistema.

**Hierarquia e Generalização:** atores podem herdar características de outros atores, acumulando permissões (ex.: Usuário → pode ler arquivo; Usuário Sênior → herda do Usuário + pode gravar; Administrador → herda do Sênior + pode excluir). A seta aponta do ator especializado para o ator geral.

**Include vs. Extend:**

| | `<<include>>` | `<<extend>>` |
|---|---|---|
| Natureza | Obrigatória | Opcional / condicional |
| Conceito | A execução do caso base **obriga** a execução do incluído (como uma sub-rotina) | Cenário alternativo que só ocorre **se** uma condição for atendida |
| Exemplo | "Realizar Depósito" inclui "Registrar Movimento" | "Realizar login" pode estender para "Auto Registrar" |

Quando a condição de extensão não é óbvia, aplicam-se **notas de restrição (constraints)** entre chaves `{ }` — funcionam como blocos `IF` no design do software (ex.: `{caso o cliente ainda não esteja registrado}`).

**Estudo de caso — Módulo Bancário (Encerrar Conta):**
- Atores: Cliente Banco (iniciador) e Funcionário (apoio).
- Caso base: Encerrar conta.
- `<<extend>>` de "Realizar Saque" para "Encerrar Conta" (se houver saldo positivo).
- `<<extend>>` de "Realizar Depósito" para "Encerrar Conta" (se houver dívida).

**Desafio prático proposto — Engenharia de uma Calculadora:**
- *Escopo de análise:* identificar atores (usuário, sistema operacional?); casos de uso básicos (somar, dividir, multiplicar, subtrair); casos de uso extras/extensões (potenciação, porcentagem).
- *Escopo de projeto:* traduzir a modelagem UML para código funcional em Java.

**Exercício proposto — Sistema de aluguel de temas de festa (Rafaela):** Rafaela possui vários temas de festas infantis para aluguel e precisa controlar os alugueis. A aplicação deve permitir cadastrar nome, telefone e endereço da festa, o tema, a data, hora de início e término. Para alguns clientes ela oferece descontos, sendo necessário saber o valor realmente cobrado em cada aluguel. Para cada tema, controlar: a lista de itens que o compõem (ex.: castelo, bruxa, boneca), o valor do aluguel e a cor da toalha de mesa usada como tema.

---

### Banco de Dados

#### Como Utilizar o Azure (tentativa de configuração de Banco de Dados SQL)

1. Pesquisar "education" no portal do Azure e acessar o serviço **Education**.
2. Na oferta do aluno (créditos disponíveis, dias até expirar), clicar em **Explorar tudo** nos Serviços gratuitos.
3. Em "Serviços que sempre incluem valores gratuitos mensais", escolher **Banco de Dados SQL do Azure** (100.000 segundos de vCore/mês, 32 GB de armazenamento) e clicar em **Criar**.
4. Na nova página, aplicar a oferta gratuita (*Free offer applied*).
5. Criar um novo grupo de recursos, informando um nome.
6. Clicar em **Criar servidor** e preencher nome do servidor e localização. ⚠️ **Atenção:** ao escolher a localização, apenas algumas regiões são aceitas — tentar **Brazil** quando outras localizações (como Australia East) forem rejeitadas.
7. Na aba **Rede**, configurar o método de conectividade (ex.: Ponto de extremidade público), permitir que serviços/recursos do Azure acessem o servidor e adicionar o IP do cliente atual, e clicar em **Revisar + criar**.
8. Caso ocorra falha na validação, revisar as configurações (o erro identificado foi a localização do servidor — resolvido selecionando **Brazil**).

> **Observação da turma:** com base no erro encontrado no Azure, a turma optou por não seguir utilizando esse serviço para o projeto.

---

### Publicação da Aplicação

---

## Arquivos do Projeto

### 📁 Aula/Exemplos

#### Exemplo_1.java — Verificação de idade para dirigir

```java
package aula_3;

import java.util.Scanner;

public class Exemplo_1 {

    public static void main(String[] args) {
        int idade;
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite a sua idade:");
        idade = ler.nextInt();
        
        if(idade>=18) {
            System.out.println("Pode dirigir");     
        }else {
            System.out.println("Não pode dirigir");
        }
    }
}
```

---

#### Exemplo_2.java — Verificação de nota (fixo)

```java
package aula_3;

public class Exemplo_2 {

    public static void main(String[] args) {
        int nota=8;
        
        if(nota>=7) {
            System.out.println("Aprovado!");
        }else {
            System.out.println("Reprovado!");
        }
    }
}
```

---

#### Exemplo_3.java — Verificação de nota com recuperação

```java
package aula_3;

import java.util.Scanner;

public class Exemplo_3 {

    public static void main(String[] args) {
        int nota;
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite sua nota:");
        nota = ler.nextInt();
        
        if(nota>=7) {
            System.out.println("Aprovado!");
        }else if(nota>=5 && nota<7) {
            System.out.println("Recuperação!");
        }else {
            System.out.println("Reprovado!");
        }
    }
}
```

---

#### Exemplo_4.java — Calculadora com if/else (chamada com métodos separados por linha de comando)

```java
package Aula_03;

import java.util.Scanner;

public class Exemplo_04 {

    public static void main(String[] args) {
        String op;
        Scanner operacao = new Scanner(System.in);

        System.out.println("Digite a Operação (+, -, *, /, Raiz): ");
        op = operacao.next();

        if(op.equals("+")) {
            somar();
        }else if (op.equals("-")) {
            subtracao();
        }else if (op.equals("*")) {
            multiplicacao();
        }else if (op.equals("/")) {
            divisao();
        }else if(op.equals("Raiz")) {
            raiz();
        }
        else {
            System.out.println("erro");
        }
        operacao.close();
    }

    public static void somar() {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite os numeros");
        double num01 = ler.nextDouble();
        double num02 = ler.nextDouble();
        double total = num01+num02;
        System.out.println("Total: "+total);
        ler.close();
    }

    public static void subtracao() {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite os numeros");
        double num01 = ler.nextDouble();
        double num02 = ler.nextDouble();
        double total = num01-num02;
        System.out.println("Total: "+total);
        ler.close();
    }

    public static void multiplicacao() {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite os numeros");
        double num01 = ler.nextDouble();
        double num02 = ler.nextDouble();
        double total = num01*num02;
        System.out.println("Total: "+total);
        ler.close();
    }

    public static void divisao() {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite os numeros");
        double num01 = ler.nextDouble();
        double num02 = ler.nextDouble();
        double total = num01/num02;
        System.out.println("Total: "+total);
        ler.close();
    }

    public static void raiz() {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o numero");
        double num01 = ler.nextDouble();
        double total = Math.sqrt(num01);
        System.out.println("Total: "+total);
        ler.close();
    }
}
```

---

#### Exemplo_5.java — Calculadora com funções separadas (if/else)

```java
package aula_3;

import java.util.Scanner;

public class Exemplo_5 {

    public static void main(String[] args) {
        Scanner ler =  new Scanner(System.in);
        String op="";
        System.out.println("Digite a operação:");
        op = ler.next();
        
        if(op.equals("+")) {
            somar();
        }else if(op.equals("-")) {
            subtrair();
        }else if(op.equals("*")) {
            multiplicar();
        }else if(op.equals("/")) {
            dividir();
        }else if(op.equals("Raiz")) {
            raiz();
        }
    }
    public static void somar() { /* lê dois números e exibe a soma */ }
    public static void subtrair() { /* lê dois números e exibe a subtração */ }
    public static void multiplicar() { /* lê dois números e exibe o produto */ }
    public static void dividir() { /* lê dois números e exibe a divisão */ }
    public static void raiz() { /* lê um número e exibe a raiz quadrada */ }
}
```

---

#### Exemplo_6.java — Calculadora com switch/case

```java
package aula_3;

import java.util.Scanner;

public class Exemplo_6 {

    public static void main(String[] args) {
        Scanner ler =  new Scanner(System.in);
        String op="";
        System.out.println("Digite a operação:");
        op = ler.next();
        
        switch(op) {
        case "+":  somar();    break;
        case "-":  subtrair(); break;
        case "*":  multiplicar(); break;
        case "/":  dividir();  break;
        case "Raiz": raiz();   break;
        default:   System.out.println("Opção Inválida");
        }
    }
    // métodos somar, subtrair, multiplicar, dividir e raiz idênticos ao Exemplo_5
}
```

---

#### Exemplo_7.java — Loop while com contador e delay

```java
package aula_3;

public class Exemplo_7 {

    public static void main(String[] args) throws InterruptedException {
        int cont= 0;
        while (cont < 3){
            System.out.println("Volta:  "+cont);
            Thread.sleep(1000);
            cont++;
        }
        System.out.println("Voltas concluídas");
    }
}
```

---

#### Exemplo_8.java — Loop while com break ao digitar 0

```java
package aula_3;

import java.util.Scanner;

public class Exemplo_8 {
    public static void main(String[] args) {
        int numero = 0;
        Scanner ler = new Scanner(System.in);

        while (true) {
            System.out.println("Digite o numero ou 0 para encerrar: ");
            numero = ler.nextInt();
            if (numero == 0){
               System.out.println("Fim");
               break;
            }
        }
    }
}
```

---

#### Exemplo_9.java — Tabuada com while e delay

```java
package aula_3;

import java.util.Scanner;

public class Exemplo_9 {
    public static void main(String[] args) throws InterruptedException {
        int cont= 0;
        int numero;
        int total;

        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        numero = ler.nextInt();

        while (cont<11){
            total= numero * cont;
            System.out.println(numero+"X"+cont+"="+total);
            Thread.sleep(1000);
            cont++;
        }
    }
}
```

---

#### Exemplo_10.java — Loop do/while

```java
package aula_3;

public class Exemplo_10 {

    public static void main(String[] args) {
        int cont=0;

        do{
            System.out.println("Volta: "+cont);
            cont++;
        }while (cont<5);
    }
}
```

---

#### Exemplo_11.java — Vetor (array) com for

```java
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
```

---

#### Exemplo_12.java — Soma de dois arrays

```java
package aula_3;

public class Exemplo_12 {
    public static void main(String[] args) {
        int[]num01 = {1,2,3,4,5,6,7,8,9,10};
        int[]num02 =  {11,12,13,14,15,16,17,18,19,20};
        int[]total= new int[10];

        for(int i=0;i<num01.length;i++){
            total[i]=num01[i]+num02[i];
        }
        for(int i=0;i<total.length;i++){
            System.out.print(total[i]);
        }
    }
}
```

---

#### Exemplo_13.java — Percorrer array de Strings com delay

```java
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
```

---

#### Exemplo_14.java — Matriz 3x3 com entrada do usuário

```java
package aula_3;

import java.util.Scanner;

public class Exemplo_14 {
    public static void main(String[] args) {
        int [][] matriz= new int [3][3];
        Scanner ler = new Scanner(System.in);

        for(int linha= 0; linha < matriz.length; linha++){
            for (int coluna = 0; coluna < matriz.length; coluna++){
                System.out.println("Digite um numero:  ");
                matriz[linha][coluna] = ler.nextInt();
                System.out.println("|"+linha+","+coluna+"|");
            }
        }
    }
}
```

---

#### Exemplo_17.java — Chamada de métodos estáticos

```java
package aula_3;

public class Exemplo_17 {

    public static void main(String[] args) {
        ola();
        bay();
        ficar();
    }
    public static void ola(){
        System.out.println("Olá!!");
    }
    static void bay(){
        System.out.println("Já vouuuu!!");
    }
    static void ficar(){
        // método vazio
    }
}
```

---

#### Exemplo_18.java — Passagem de parâmetro booleano

```java
package aula_3;

public class Exemplo_18 {

    public static void main(String[] args) {
        boolean comida = true;
        churras_na_amanda(comida);
    }
    private static void churras_na_amanda(boolean comida){
        System.out.println("Churras!!Churras!Churras!!");
    }
}
```

---

#### Exemplo_19.java — Retorno de valor em funções

```java
package aula_3;

public class Exemplo_19 {
    public static void main(String[] args) {
        double dinheiro = 100.00;
        double carteira= 0;
        double troco =0;

        carteira= bolo(carteira);
        System.out.println("Recebi da amanda: "+bolo(dinheiro));

        comprar_chantiy(carteira);
        troco= comprar_chantiy(carteira);
        System.out.println("Troco: "+troco);
    }

    private static double comprar_chantiy(double a) {
        double total = a+70.00;
        return total;
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
```

---

#### Exemplo_switch.java — Estrutura switch/case básica

```java
package aula_3;

public class Exemplo_switch {

    public static void main(String[] args) {
        String opcao = "3";
        
        switch(opcao) {
        case "1":
            System.out.println("Opção 1:");
            break;
        case "2":
            System.out.println("Opção 2:");
            break;
        default:
            System.out.println("Opção Inválida");
            break;
        }
    }
}
```

---

#### Exercicio_01.java — Métodos sem retorno (void)

```java
package Aula_17;

public class Exercicio_01 {

    public static void main(String[] args) {
        ola();
        bay();
        ficar();
    }

    private static void ficar() {
        System.out.println("Vou ficar!");
    }
    public static void ola() {
        System.out.println("Olá!");
    }
    public static void bay() {
        System.out.println("Já vou!");
    }
}
```

---

#### Exercicio_02.java — Passagem de parâmetro booleano (aula 17)

```java
package Aula_17;

public class Exercicio_02 {

    public static void main(String[] args) {
        boolean comida = true;
        churras_na_amanda(comida);
    }

    private static void churras_na_amanda(boolean comida) {
        System.out.println("Churras!!Churras!!Churras!!");
    }
}
```

---

#### Calculadora.java (Aula_17) — Sobrecarga de métodos com retorno

```java
package Aula_17;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        double num01, num02, num03;
        String operacao = "";
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o Primeiro Numero: ");
        num01 = ler.nextDouble();

        System.out.println("Digite o Segundo Numero: ");
        num02 = ler.nextDouble();

        System.out.println("Digite o Terceiro Numero: ");
        num03 = ler.nextDouble();

        System.out.println("Escolha a operação");
        operacao = ler.next();

        switch(operacao) {
        case "+":
            somar(num01, num02);
            somar(num01, num02, num03);
        break;

        case"-":
            subtrair(num01, num02);
        break;

        case "*":
            multiplicacao(num01, num02);
        break;

        case "/":
            divisao(num01, num02);
        break;

        default:
            System.out.println("Operação invalida!");
        break;
        }
        ler.close();
    }

    private static void somar(double a, double b) {
        double total = a + b;
        System.out.println("Resultado: "+total);
    }

    private static void somar(double a, double b, double c) {
        double total = a + b + c;
        System.out.println("Resultado: "+total);
    }

    private static void subtrair(double a, double b) {
        double total = a - b;
        System.out.println("Resultado: "+total);
    }

    private static void multiplicacao(double a, double b) {
        double total = a * b;
        System.out.println("Resultado: "+total);
    }

    private static void divisao(double a, double b) {
        double total = a / b;
        System.out.println("Resultado: "+total);
    }
}
```

---

#### Exemplo_01.java (Aula_016) — Array com for e while

```java
package Aula_016;

public class Exemplo_01 {

    public static void main(String[] args) {
        for(int i=0; i<10; i++) {
        }
        int i=0;
        while(i<10) {
            i++;
            System.out.println(i);
        }
    }
}
```

---

#### Exemplo_02.java (Aula_016) — Array de frutas

```java
package Aula_016;

public class Exemplo_02 {

    public static void main(String[] args) throws InterruptedException {
        String[]frutas = {"Laranja", "Manga", "Coco", "Acerola", "Manga", "Tomate",
                "Kiwi", "Uva"};

        for (int i = 0; i < frutas.length; i++) {
            System.out.println("Frutas: "+frutas[i]);
            Thread.sleep(1000);
        }
    }
}
```

---

#### Exemplo_03.java (Aula_016) — Multiplicação elemento a elemento de dois arrays

```java
package Aula_016;

public class Exemplo_03 {
    public static void main(String[] args) {
        int []num01 = {1, 2, 3, 4, 5, 6,7, 8, 9, 10};
        int []num02 = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int []total = new int[10];

        for (int i = 0; i < num01.length; i++) {
            total[i]=num01[i]*num02[i];
        }

        for (int i = 0; i < total.length; i++) {
            System.out.println(total[i]);
        }
    }
}
```

---

#### Exemplo_04.java (Aula_016) — Matriz 3x3

```java
package Aula_016;

public class Exemplo_04 {

    public static void main(String[] args) {
        int [][] matriz = new int [3][3];

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz.length; coluna++) {
                System.out.print("|"+linha+" - "+coluna+"|");
            }
            System.out.println(" ");
        }
    }
}
```

**Versão com entrada do usuário:**

```java
package Aula_016;

import java.util.Scanner;

public class Exemplo_04 {

    public static void main(String[] args) {
        int [][] matriz = new int [3][3];

        Scanner ler = new Scanner(System.in);

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz.length; coluna++) {
                System.out.println("Digite um numero: ");
                matriz[linha][coluna] = ler.nextInt();
            }
        }

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz.length; coluna++) {
                System.out.print("|"+matriz[linha][coluna]+"|");
            }
            System.out.println(" ");
        }
        ler.close();
    }
}
```

---

### 📁 Aula/Desafios

#### calculadora_parametro.java — Calculadora com sobrecarga de métodos

```java
package aula_3.Desafios;

import java.util.Scanner;

public class calculadora_parametro {
    public static void main(String[] args) {
        double num01, num02, num03;
        String op = "";
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        num01 = ler.nextDouble();
        System.out.println("Digite outro número: ");
        num02 = ler.nextDouble();
        System.out.println("Digite outro número: ");
        num03 = ler.nextDouble();
        System.out.println("Digite a operação");
        op = ler.next();

        switch (op) {
            case "+": {
                somar(num01, num02);
                somar(num01, num02, num03);
                break;
            }
            case "-": { subtrair(num01, num02); break; }
            case "*": { multiplicar(num01, num02); break; }
            case "/": { dividir(num01, num02); break; }
        }
    }

    private static void somar(double a, double b, double c) {
        System.out.println("Resultado soma: " + (a + b + c));
    }
    private static void somar(double a, double b) {
        double total = a + b;
    }
    private static void subtrair(double a, double b) {
        System.out.println("Resultado subtração: " + (a - b));
    }
    private static void multiplicar(double a, double b) {
        System.out.println("Resultado multiplicação: " + (a * b));
    }
    private static void dividir(double a, double b) {
        System.out.println("Resultado divisão: " + (a / b));
    }
}
```

---

#### Desafio_01.java — Reajuste de salário por faixa

```java
package aula_3.Desafios;

import java.util.Scanner;

public class Desafio_01 {
    public static void main(String[] args) {
       int salario;
       Scanner ler = new Scanner(System.in);
       System.out.println("Digite o salario: ");
       salario = ler.nextInt();

       if (salario < 1000){
           double total1 = salario+(salario*0.40);
       }else if (salario > 1000){
           double total2 = salario+(salario*0.30);
           System.out.println("Seu salario agora é" +total2);
       }
    }
}
```

---

#### Desafio_02.java — Mensalidade com desconto por nível e dia de pagamento

```java
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
            default: System.out.println("Nível inválido!"); return;
        }

        double desconto = 0;
        switch (dia) {
            case 1:               desconto = 0.15;   break;
            case 2: case 3: case 4: case 5: desconto = 0.10; break;
            case 6: case 7: case 8: case 9: case 10: desconto = 0.0389; break;
            default: desconto = 0; break;
        }

        double valorDesconto = valor * desconto;
        double valorFinal = valor - valorDesconto;
        System.out.printf("Valor do desconto: R$ %.2f%n", valorDesconto);
        System.out.printf("Valor final da mensalidade: R$ %.2f%n", valorFinal);
    }
}
```

---

#### Desafio Prático (Aula 8) — Engenharia de uma Calculadora

**Escopo de análise:**
- Identificar atores (Usuário, Sistema Operacional?)
- Casos de uso básicos: Somar, Dividir, Multiplicar, Subtrair
- Casos de uso extras (extensões?): Potenciação, Porcentagem

**Escopo de projeto:** traduzir a modelagem UML para código funcional utilizando a linguagem Java.

#### Exercício — Sistema de aluguel de temas de festa (Rafaela)

Rafaela possui vários temas de festas infantis para aluguel. Precisa de uma aplicação que permita cadastrar nome, telefone, endereço da festa, tema, data, hora de início e término. Para clientes com desconto, calcular o valor realmente cobrado. Para cada tema, controlar a lista de itens que o compõem, o valor do aluguel e a cor da toalha de mesa usada como tema.

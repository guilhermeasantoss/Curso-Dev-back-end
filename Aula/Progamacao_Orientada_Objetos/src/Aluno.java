public class Aluno {

    public class aluno{
        public static void main(String[] args) {
            PessoaJuridica aluno = new PessoaJuridica();
            aluno.setNome("Jacinto o Pinto");
            aluno.setTelefone("(11)4002-8922");
            aluno.setEmail("jacinto077@gmail.com");
            aluno.getCpf("123.456.789-10");
            aluno.getRg("12345");
            aluno.getCnpj("544545");




            System.out.println("Nome: " + aluno.getNome());
            System.out.println("Telefone: " + aluno.getTelefone());
            System.out.println("Email: " + aluno.getEmail());
            System.out.println("Cpf: " + aluno.getCpf());
            System.out.println("Rg: " + aluno.getRg());
        }
    }
}

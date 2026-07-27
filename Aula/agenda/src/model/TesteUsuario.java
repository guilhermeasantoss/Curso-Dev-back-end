package model;

public class TesteUsuario {
    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        Usuario usuario1 = new Usuario("clara","Feminino","24/11/2005","Parda","rua j","Pinheiro","Itaquacity","(11)8877-6655","clara@email.com","(11)966554433");

        usuario.setNome("Alex");
        System.out.println(usuario.getNome());

        System.out.println(usuario1.getNome());
        usuario1.setNome("Raimunda");


        System.out.println(usuario1.getNome());
        System.out.println(usuario.getEndereco());
        System.out.println(usuario.getTelefone());

    }
}

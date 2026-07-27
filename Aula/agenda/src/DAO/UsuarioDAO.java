package DAO;

import model.Usuario;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDAO {
    public boolean inserir(Usuario usuario) {

    }
    public boolean atualizar(Usuario usuario) {

    }
    public boolean excluir(int id) {

    }
    public list <Usuario>listar(){

    }
    public Usuario BuscarPorId(int id){

    }
    public list <Usuario> BuscarPorNome(String nome){

    }
    //=============================================================//
    //Metodos auxiliares,evitar a repitição do codigos//
    //=============================================================//

    private void preencherParametros(PreparedStatement ps, Usuario u)  throws SQLException {
   ps.setString(1,u.getNome());
   ps.setString(2,u.getGenero());
   ps.setString(3,u.getDataNascimento());
   ps.setString(4,u.getEtnia());
   ps.setString(5,u.getEndereco());
   ps.setString(6,u.getBairro());
   ps.setString(7,u.getCidade());
   ps.setString(8,u.getTelefone());
   ps.setString(9,u.getCelular();
   ps.setString(1,u.getEmail());
    }

    private usuario montarUsuario(ResultSet rs)throws SQLException{
        Usuario u = new Usuario();
        u.setId(rs.getInt("id")));
        u.setNome(rs.getString(rs.getString("nome")));
        u.setGenero(rs.getString(rs.getString("genero")));
        u.setDataNascimento(rs.getString(rs.getString("dataNascimento")));
        u.setEtnia(rs.getString(rs.getString("etnia")));
        u.setEndereco(rs.getString(rs.getString("endereco")));
        u.setBairro(rs.getString(rs.getString("bairro")));
        u.setCidade(rs.getString(rs.getString("cidade")));
        u.setTelefone(rs.getString(rs.getString("telefone")));
        u.setCelular(rs.getString(rs.getString("celular")));
        u.setEmail(rs.getString(rs.getString("email")));
        return u;
    }


}

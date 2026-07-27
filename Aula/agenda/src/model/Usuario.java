package model;

public class Usuario {
    private int id;
    private String nome;
    private String genero;
    private String dataNascimento;
    private String etnia;
    private String endereco;
    private String bairro;
    private String cidade;
    private String telefone;
    private String celular;
    private String email;

    public Usuario() {

    }

    public Usuario(String nome, String gênero, String dataNascimento, String etnia, String endereco, String bairro, String cidade, String telefone, String celular, String email) {
        this.nome = nome;
        this.genero = genero;
        this.dataNascimento = dataNascimento;
        this.etnia = etnia;
        this.endereco = endereco;
        this.bairro = bairro;
        this.cidade = cidade;
        this.telefone = telefone;
        this.celular = celular;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String gênero) {
        this.genero = gênero;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEtnia() {
        return etnia;
    }

    public void setEtnia(String etnia) {
        this.etnia = etnia;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}

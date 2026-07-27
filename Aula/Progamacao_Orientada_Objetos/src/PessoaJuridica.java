public class PessoaJuridica extends Pessoa{
    private  String cnpj;
    private String ie;

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setIe(String ie) {
        this.ie = ie;
    }
    public String getIe() {
        return ie;
    }
}

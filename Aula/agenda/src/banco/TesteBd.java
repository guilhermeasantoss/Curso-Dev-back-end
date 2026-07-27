package banco;

public class TesteBd {
    public static void main(String[] args) {
        BD bd = new BD();

        // Em vez de 'bd.connection;', chame o método correto:
        bd.getConnection();

        bd.close();
    }
}
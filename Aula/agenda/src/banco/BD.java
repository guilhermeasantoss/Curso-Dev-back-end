package banco;

import java.sql.*;

public class BD {
    public Connection connection=null;
    private final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private final String DBNAME = "agenda";
    private final String URL = "jdbc:mysql://localhost:3306/" + DBNAME;
    private final String login = "root";
    private final String senha= "senai@126";

    public boolean getConnection() {
        try {
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(URL, login, senha);
            System.out.println("Conectado com sucesso!");
            return true;

        }catch (ClassNotFoundException e){
            System.out.println("Driver não encontrado" +e.toString());
            return false;
        }catch (SQLException e){
            System.out.println("Falha ao conectar com o banco"+e.toString());
            return false;
        }

    }
    public void close(){
        try {
            connection.close();
            System.out.println("Fechado com sucesso!");
        }catch (Exception e){

        }



    }
}

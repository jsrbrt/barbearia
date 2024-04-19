package demoBarbearia.src.main.java.com.inter.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBD {

    public static void main (String [] args) throws SQLException{
        
        String url = "jdbc:mysql://localhost:3306/barbearia";
        String user = "root";
        String password = "root";
        
        try (Connection connection = DriverManager.getConnection(url, user, password)){
            System.out.println("Conexão bem sucedida");
        } catch (SQLException e){
            System.out.println("Falha na conexão com o banco de dados" + e.getMessage());
            e.printStackTrace();
        }
    }
}
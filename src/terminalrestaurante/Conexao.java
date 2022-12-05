package terminalrestaurante;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexao {

    public static void main(String[] args) {
        conecta();
    }

    public static Connection conecta() {
        Connection conn;
        conn = null;

        String url = "jdbc:mysql://localhost:3306/TerminalVendasBD";
        String user = "root";
        String senha = "";

        try {
            conn = (Connection) DriverManager.getConnection(url, user, senha);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao conectar com BD:\n" + ex.getMessage());
        }
        return conn;
    }
}

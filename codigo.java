package login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * A classe User é responsável por lidar com a autenticação do usuário e a conexão com o banco de dados.
 */
public class User {
    /**
     * Conecta-se ao banco de dados e retorna o objeto de conexão.
     *
     * @return a conexão com o banco de dados
     */
    public Connection conectarBD() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.Driver").newInstance();
            String url = "jdbc:mysql://127.0.0.1/test?user=lopes&password=123";
            conn = DriverManager.getConnection(url);
        } catch (Exception e) {
            // Lidar com a exceção
        }
        return conn;
    }

    /**
     * O nome do usuário.
     */
    public String nome = "";

    /**
     * O resultado da verificação do usuário.
     */
    public boolean result = false;

    /**
     * Verifica as credenciais de login e senha do usuário.
     *
     * @param login o login do usuário
     * @param senha a senha do usuário
     * @return true se as credenciais do usuário forem válidas, false caso contrário
     */
    public boolean verificarUsuario(String login, String senha) {
        String sql = "";
        Connection conn = conectarBD();

        // Instrução SQL
        sql += "select nome from usuarios ";
        sql += "where login = '" + login + "'";
        sql += " and senha = '" + senha + "'";

        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                result = true;
                nome = rs.getString("nome");
            }
        } catch (Exception e) {
            // Lidar com a exceção
        }

        return result;
    }
}
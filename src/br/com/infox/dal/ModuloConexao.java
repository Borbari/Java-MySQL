package br.com.infox.dal;

import java.sql.*;

public class ModuloConexao {

    //conexao com banco
    public static Connection conector() {
        java.sql.Connection conexao = null;
        //chama o driver
        String driver = "com.mysql.jdbc.Driver";
        //Armazenando informações referente ao banco
        String url = "jdbc:mysql://localhost:3306/dbinfox";
        String user = "root";
        String password = "";
        //Estabelecendo a conexão com o banco
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e) {
            return null;
        }
    }
}

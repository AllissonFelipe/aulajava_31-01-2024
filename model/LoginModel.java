package model;

import java.sql.*;
import java.util.*;
import controller.*;

public class LoginModel {
    public static void acessarConta(String id, String senha) {

        //String status = "Nada aconteceu ainda...";
        String idDoUsuario = "", senhaDoUsuario = "";
        try {
            Connection conn = MySQLConnectorModel.conectar();
            //Scanner scnInput = new Scanner(System.in);
            //System.out.println("Digite o login para verificação: ");
            //String strBusca = scnInput.nextLine();
            String strSqlSelect = "select * from `db_mysql_connector`.`tbl_clientes` where `nome` = '" + id + "' and `senha` = '" + senha + "';";
            Statement stmSql = conn.createStatement();
            ResultSet rsSql = stmSql.executeQuery(strSqlSelect);
            //String nomes = "";
            while (rsSql.next()) {
                idDoUsuario = rsSql.getString("nome");
                senhaDoUsuario = rsSql.getString("senha");
            }
            //status = "Nome(s): " + nomes;
            stmSql.close();
            rsSql.close();
            //scnInput.close();
        } catch (Exception e) {
            System.out.println("Ops! Ocorreu o erro " + e);
        }
        //System.out.println(status);
        LoginController.login(idDoUsuario, senhaDoUsuario);
    }
}
    



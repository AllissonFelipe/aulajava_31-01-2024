package model;

import controller.*;
import java.sql.*;

public class CadastroModel {
    public static void cadastro(String id, String senha) {
        try { 
            Connection conn = MySQLConnectorModel.conectar();
            String strInsertMySQL = "insert into `db_mysql_connector`.`tbl_clientes` (`nome`,`senha`) values ('" + id + "','" + senha + "');";
            Statement stmSql = conn.createStatement();
            stmSql.addBatch(strInsertMySQL);
            stmSql.executeBatch();
            stmSql.close();
            //status = "Ok! Login inserido com sucesso";
        } 
        catch (Exception e) { 
            System.err.println("Ops! Ocorreu o erro " + e);
        } 
        //System.out.println(status);    
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package DalConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

/**
 *Metodo que habilita a conexão ao banco de dados Xamp/Sql
 * Importante que tenha na libraries o arquivo msql-connector-j-8.1.jar
 * @author sudar
 */

public class ModuloConexao {
    
    public static Connection conector(){
        java.sql.Connection conexao = null;
        
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/unagaragemproject";
        String user = "root";
        String password = "";
        
        try{
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user,password);
            return conexao;
        }catch (Exception e){
            
            System.out.print(e);
            
               return null;
        }
        }
    
    
}

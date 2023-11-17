/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import java.sql.SQLException;
import Model.Produto;


/**
 *
 * @author sudar
 */
public class ProdutoController {//Criei o caminho dos metodos a classe Model (instanciada),
    //com parametros a serem recebidos e em seguida chama-se o metodo adcionar da Model.

    public boolean adicionar(String codigo, String descricao, String modelo, 
            String qtde, String valor) throws java.sql.SQLException {
      
        Model.Produto obj = new Model.Produto(codigo, descricao, modelo, qtde, valor);
        obj.adicionar();
        return true;
    }
    
     public Produto consultar(String codigo) throws java.sql.SQLException {
        Model.Produto obj = new Model.Produto();
        
        return obj.consultar(codigo);
        
     }
     
     public boolean alterar(String codigo, String descricao, String modelo, 
            String qtde, String valor) throws java.sql.SQLException {
        Model.Produto obj = new Model.Produto(codigo, descricao, modelo,
                qtde, valor);
        obj.alterar();
        return true;
      }
     
     public void deletar(String codigo) throws java.sql.SQLException {
        Model.Produto obj = new Model.Produto();
        
        obj.deletar(codigo);
        
     }
}


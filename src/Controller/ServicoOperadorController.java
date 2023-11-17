/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.sql.SQLException;
import Model.ServicoOperador;

/**
 *
 * @author sudar
 */
public class ServicoOperadorController {
    //Criei o casminho do metodo boolean adicionar() com a classe Model 
    //instanciada com parametros a serem recebidos e em seguida chama-se o metodo adcionar da Model

    public boolean adicionar(String departamento, String nomeOperador, String codigo, String descricaoServico,   
            String modelo, String tempoExecucao) throws java.sql.SQLException {
        Model.ServicoOperador obj = new Model.ServicoOperador(departamento, nomeOperador,codigo,
                descricaoServico, modelo, tempoExecucao);
        obj.adicionar();
        return true;
        
    }
    
     public ServicoOperador consultar(String codigo) throws java.sql.SQLException {
        Model.ServicoOperador obj = new Model.ServicoOperador();
        
        return obj.consultar(codigo);
        
     }
     
      public boolean alterar(String departamento, String nomeOperador, String codigo, String descricaoServico,   
            String modelo, String tempoExecucao) throws java.sql.SQLException {
        Model.ServicoOperador obj = new Model.ServicoOperador(departamento, nomeOperador,codigo,
                descricaoServico, modelo, tempoExecucao);
        obj.alterar();
        return true;
      }
      
      public void deletar(String codigo) throws java.sql.SQLException {
        Model.ServicoOperador obj = new Model.ServicoOperador();
        
        obj.deletar(codigo);
        
     }
}



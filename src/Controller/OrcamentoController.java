/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DalConnection.ModuloConexao;
import static java.awt.image.ImageObserver.WIDTH;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author sudar
 */
public class OrcamentoController {

    public boolean salvarExecucaoServico() {

        return true;
    }

    public String orcamento(String modelo, String descricao) {
        String ValorProduto;
         Connection conexao = ModuloConexao.conector();
        // conexao = null;
        PreparedStatement pat = null;
        ResultSet rs = null;

        String sql = "select * from cadastroproduto where modelo=? and descricao=?";

        try {
            //Preparação e Passagem dos parametros    
            pat = conexao.prepareStatement(sql);
            pat.setString(1, modelo);//variaveis condição de chamada
            pat.setString(2, descricao);
            rs = pat.executeQuery();
            //**Tratamento de exceções de "digitação" não foram considerado neste momento.  
            if (rs.next()) {

                ValorProduto=rs.getString(5);

            } else {
                ValorProduto = "0.00";
              JOptionPane.showInternalMessageDialog(null, "Cadastrado inexistente ou campo não digitado");

            }
        } catch (Exception e) {
            ValorProduto = "0.00";
             JOptionPane.showInternalMessageDialog(null,e);
        }
        return ValorProduto;
    }

//return false;
}

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

    /**
     *Metodo intermediario previsto para salvar informações do orçamento de serviço, no momento ainda totalmente na View
     * @return
     */
    public boolean salvarExecucaoServico() {

        return true;
    }

    /**
     * Metodo intermediario que preve o select/consulta na tabela cadastroproduto e busca informações de valores aos parametros 
     * (modelo e descrição do produto), para que seja concretizado o orçamento.
     * @param modelo
     * @param descricao
     * @return disponibilidade dos valores correspondentes (valor produto, tempo e valor de mão de obra valor total(somatorio).
     */
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

                ValorProduto = rs.getString(5);

            } else {
                ValorProduto = "0.00";
                JOptionPane.showInternalMessageDialog(null, "Cadastrado inexistente ou campo não alimentado");

            }
        } catch (Exception e) {
            ValorProduto = "0.00";
            JOptionPane.showInternalMessageDialog(null, e);
        }
        return ValorProduto;
    }

//return false;
}

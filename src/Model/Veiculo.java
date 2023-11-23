/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import DalConnection.ModuloConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

/**
 *
 * @author sudar
 */
public class Veiculo {//extends ModuloConexao.java

    private String placa;
    private String cpf_cnpj;
    private String modelo;
    private String anoFabricacao;
    private String motorizacao;
    private String combustivel;
    private String quilometragem;

    public Veiculo() {//Criação de construtor sem parametro coerente com o metodo de consulta da Model
    }

    public Veiculo(String placa, String cpf_cnpj, String modelo, String anoFabricacao, String motorizacao,
            String combustivel, String quilometragem) {
        this.placa = placa;
        this.cpf_cnpj = cpf_cnpj;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.motorizacao = motorizacao;
        this.combustivel = combustivel;
        this.quilometragem = quilometragem;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCpf_cnpj() {
        return cpf_cnpj;
    }

    public void setCpf_cnpj(String cpf_cnpj) {
        this.cpf_cnpj = cpf_cnpj;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(String anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public String getMotorizacao() {
        return motorizacao;
    }

    public void setMotorizacao(String motorizacao) {
        this.motorizacao = motorizacao;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public String getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(String quilometragem) {
        this.quilometragem = quilometragem;
    }

    /**
     **Metodo que ao receber o comando da classe VeiculoController e efetua a ação adicionar, solicitada pela View.
     * @throws SQLException
     */
    public void adicionar() throws SQLException {//Execução do insert no DB

        Connection conexao = null;
        PreparedStatement pat = null;
        ResultSet rs = null;
        conexao = ModuloConexao.conector();

        String sql = "insert into cadastroveiculo(placa,cpf_cnpj,modelo,anofabricacao,motorizacao,combustivel,"
                + "quilometragem) values(?,?,?,?,?,?,?)";
        // try {//Definindo o que vai do campo da tela para o campo respectivo do DB.

        pat = conexao.prepareStatement(sql);

        pat.setString(1, this.placa);
        pat.setString(2, this.cpf_cnpj);
        pat.setString(3, this.modelo);
        pat.setString(4, this.anoFabricacao);
        pat.setString(5, this.motorizacao);
        pat.setString(6, this.combustivel);
        pat.setString(7, this.quilometragem);

        //A linha abaixo atualiza a tabela
        pat.executeUpdate();

    }

    /**
     **Metodo que ao receber o comando da classe VeiculoController e efetua a ação consultar, solicitada pela View.
     * @param placa
     * @return
     * @throws SQLException
     */
    public Veiculo consultar(String placa) throws SQLException {//Execução do select atraves do objeto, no DB

        Connection conexao = null;
        PreparedStatement pat = null;
        ResultSet rs = null;
        conexao = ModuloConexao.conector();

        String sql = "select * from cadastroveiculo where placa=?";

        try {
            //Preparação e Passagem dos parametros    
            pat = conexao.prepareStatement(sql);
            pat.setString(1, placa);
            rs = pat.executeQuery();
            //**Tratamento de exceções de "digitação" não foram considerado neste momento.  
            if (rs.next()) {

                this.placa = rs.getString(1);
                this.cpf_cnpj = rs.getString(2);
                this.modelo = rs.getString(3);
                this.anoFabricacao = rs.getString(4);
                this.motorizacao = rs.getString(5);
                this.combustivel = rs.getString(6);
                this.quilometragem = rs.getString(7);

            } else {
                this.placa = "0";

            }
        } catch (Exception e) {
            JOptionPane.showInternalMessageDialog(null, e);
        }
        return this;

    }

    /**
     **Metodo que ao receber o comando da classe VeiculoController e efetua a ação alterar, solicitada pela View.
     * @throws SQLException
     */
    public void alterar() throws SQLException {//Execução do insert no DB

        Connection conexao = null;
        PreparedStatement pat = null;
        ResultSet rs = null;
        conexao = ModuloConexao.conector();

        String sql = "update cadastroveiculo set cpf_cnpj=?,modelo=?,anofabricacao=?,"
                + "motorizacao=?,combustivel=?,quilometragem=? where placa=?";

        pat = conexao.prepareStatement(sql);
        pat.setString(1, this.cpf_cnpj);
        pat.setString(2, this.modelo);
        pat.setString(3, this.anoFabricacao);
        pat.setString(4, this.motorizacao);
        pat.setString(5, this.combustivel);
        pat.setString(6, this.quilometragem);
        pat.setString(7, this.placa);//Campo da busca/Id é o ultimo na inclusão

        //**Tratamento de exceções de "digitação" não foram considerado neste momento.           
        //A linha abaixo atualiza a tabela
        pat.executeUpdate();

    }

    /**
     **Metodo que ao receber o comando da classe VeiculoController e efetua a ação deletar, solicitada pela View.
     * @param placa
     * @throws SQLException
     */
    public void deletar(String placa) throws SQLException {//Execução do insert no DB

        Connection conexao = null;
        PreparedStatement pat = null;
        ResultSet rs = null;
        conexao = ModuloConexao.conector();

        String sql = "delete from cadastroveiculo where placa=?";
        pat = conexao.prepareStatement(sql);
        pat.setString(1, placa);
        pat.executeUpdate();

    }

}

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
public class Produto {

    private String codigo;
    private String descricao;
    private String modelo;
    private String qtde;
    private String valor;

    public Produto() {

    }

    public Produto(String codigo, String descricao, String modelo, String qtde, String valor) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.modelo = modelo;
        this.qtde = qtde;
        this.valor = valor;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getQtde() {
        return qtde;
    }

    public void setQtde(String qtde) {
        this.qtde = qtde;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    /**
     **Metodo que ao receber o comando da classe ProdutoCcontroller e efetua a
     * ação adicionar, solicitada pela View.
     *
     * @throws SQLException
     */
    public void adicionar() throws SQLException {//Execução do insert no DB

        Connection conexao = null;
        PreparedStatement pat = null;
        ResultSet rs = null;
        conexao = ModuloConexao.conector();

        String sql = "insert into cadastroproduto(codigo,descricao,modelo,qtde,valor) values(?,?,?,?,?)";
        // try {//Definindo o que vai do campo da tela para o campo respectivo do DB.

        pat = conexao.prepareStatement(sql);

        pat.setString(1, this.codigo);
        pat.setString(2, this.descricao);
        pat.setString(3, this.modelo);
        pat.setString(4, this.qtde);
        pat.setString(5, this.valor);

        pat.executeUpdate();

    }

    /**
     **Metodo que ao receber o comando da classe ProdutoCcontroller e efetua a
     * ação consultar, solicitada pela View.
     *
     * @param codigo
     * @return
     * @throws SQLException
     */
    public Produto consultar(String codigo) throws SQLException {//Execução do select atraves do objeto, no DB

        Connection conexao = null;
        PreparedStatement pat = null;
        ResultSet rs = null;
        conexao = ModuloConexao.conector();

        String sql = "select * from cadastroproduto where codigo=?";

        try {
            //Preparação e Passagem dos parametros    
            pat = conexao.prepareStatement(sql);
            pat.setString(1, codigo);
            rs = pat.executeQuery();
            //**Tratamento de exceções de "digitação" não foram considerado neste momento.  
            if (rs.next()) {

                this.codigo = rs.getString(1);
                this.descricao = rs.getString(2);
                this.modelo = rs.getString(3);
                this.qtde = rs.getString(4);
                this.valor = rs.getString(5);

            } else {
                this.codigo = "0";

            }
        } catch (Exception e) {
            JOptionPane.showInternalMessageDialog(null, e);
        }
        return this;

    }

    /**
     **Metodo que ao receber o comando da classe ProdutoCcontroller e efetua a
     * ação alterar, solicitada pela View.
     *
     *
     * @throws SQLException
     */
    public void alterar() throws SQLException {//Execução do insert no DB

        Connection conexao = null;
        PreparedStatement pat = null;
        ResultSet rs = null;
        conexao = ModuloConexao.conector();

        String sql = "update cadastroproduto set descricao=?,modelo=?,qtde=?,valor=? where codigo=?";

        pat = conexao.prepareStatement(sql);
        pat.setString(1, this.descricao);
        pat.setString(2, this.modelo);
        pat.setString(3, this.qtde);
        pat.setString(4, this.valor);
        pat.setString(5, this.codigo);//Campo da busca/Id é o ultimo na inclusão

        //**Tratamento de exceções de "digitação" não foram considerado neste momento.           
        //A linha abaixo atualiza a tabela
        pat.executeUpdate();

    }

    /**
     **Metodo que ao receber o comando da classe ProdutoCcontroller e efetua a
     * ação deletar, solicitada pela View.
     *
     * @param codigo
     * @throws SQLException
     */
    public void deletar(String codigo) throws SQLException {//Execução do insert no DB

        Connection conexao = null;
        PreparedStatement pat = null;
        ResultSet rs = null;
        conexao = ModuloConexao.conector();

        String sql = "delete from cadastroproduto where codigo=?";

        pat = conexao.prepareStatement(sql);
        pat.setString(1, codigo);
        pat.executeUpdate();

    }
}

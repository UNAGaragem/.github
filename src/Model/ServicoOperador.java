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
public class ServicoOperador {

    private String departamento;
    private String nomeOperador;
    private String codigo;
    private String descricaoServico;
    private String modelo;
    private String tempoExecucao;

    public ServicoOperador() {

    }

    public ServicoOperador(String departamento, String nomeOperador, String codigo, String descricaoServico,
            String modelo, String tempoExecucao) {
        this.codigo = codigo;
        this.descricaoServico = descricaoServico;
        this.departamento = departamento;
        this.nomeOperador = nomeOperador;
        this.modelo = modelo;
        this.tempoExecucao = tempoExecucao;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescricaoServico() {
        return descricaoServico;
    }

    public void setDescricaoServico(String descricaoServico) {
        this.descricaoServico = descricaoServico;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getNomeOperador() {
        return nomeOperador;
    }

    public void setNomeOperador(String nomeOperador) {
        this.nomeOperador = nomeOperador;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTempoExecucao() {
        return tempoExecucao;
    }

    public void setTempoExecucao(String tempoExecucao) {
        this.tempoExecucao = tempoExecucao;
    }

    public void adicionar() throws SQLException {//Execução do insert no DB

        Connection conexao = null;
        PreparedStatement pat = null;
        ResultSet rs = null;
        conexao = ModuloConexao.conector();

        String sql = "insert into cadastroOperador(departamento, nomeoperador, codigo, descricao, "
                + "modelo,tempoexecucao) values(?,?,?,?,?,?)";
        //try {//Definindo o que vai do campo da tela para o campo respectivo do DB.

        pat = conexao.prepareStatement(sql);

        pat.setString(1, this.departamento);
        pat.setString(2, this.nomeOperador);
        pat.setString(3, this.codigo);
        pat.setString(4, this.descricaoServico);
        pat.setString(5, this.modelo);
        pat.setString(6, this.tempoExecucao);

        // .getSelectedItem()
        //A linha abaixo atualiza a tabela
        pat.executeUpdate();

    }

    public ServicoOperador consultar(String codigo) throws SQLException {//Execução do select atraves do objeto, no DB

        Connection conexao = null;
        PreparedStatement pat = null;
        ResultSet rs = null;
        conexao = ModuloConexao.conector();

        String sql = "select * from cadastrooperador where codigo=?";

        try {
            //Preparação e Passagem dos parametros    
            pat = conexao.prepareStatement(sql);
            pat.setString(1, codigo);
            rs = pat.executeQuery();
            //**Tratamento de exceções de "digitação" não foram considerado neste momento.  
            if (rs.next()) {

                this.departamento = rs.getString(1);
                this.nomeOperador = rs.getString(2);
                this.codigo = rs.getString(3);
                this.descricaoServico = rs.getString(4);
                this.modelo = rs.getString(5);
                this.tempoExecucao = rs.getString(6);

            } else {
                this.codigo = "0";

            }
        } catch (Exception e) {
            JOptionPane.showInternalMessageDialog(null, e);
        }
        return this;
    }

    public void alterar() throws SQLException {//Execução do insert no DB

        Connection conexao = null;
        PreparedStatement pat = null;
        ResultSet rs = null;
        conexao = ModuloConexao.conector();

        String sql = "update cadastrooperador set departamento=?,nomeoperador=?,descricao=?,modelo=?, tempoexecucao=? where codigo=?";

        pat = conexao.prepareStatement(sql);
        pat.setString(1, this.departamento);
        pat.setString(2, this.nomeOperador);
        pat.setString(3, this.descricaoServico);
        pat.setString(4, this.modelo);
        pat.setString(5, this.tempoExecucao);
        pat.setString(6, this.codigo);//Campo da busca/Id é o ultimo na inclusão

        //**Tratamento de exceções de "digitação" não foram considerado neste momento.           
        //A linha abaixo atualiza a tabela
        pat.executeUpdate();

    }

    public void deletar(String codigo) throws SQLException {//Execução do insert no DB

        Connection conexao = null;
        PreparedStatement pat = null;
        ResultSet rs = null;
        conexao = ModuloConexao.conector();
        
        String sql = "delete from cadastrooperador where codigo=?";

                pat = conexao.prepareStatement(sql);
                pat.setString(1, codigo);
                pat.executeUpdate();

    }

}

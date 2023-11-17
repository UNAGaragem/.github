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
public class Cliente {

    private String cpf_cnpj;
    private String nome;
    private String endereco;
    private String complemento;
    private String bairro;
    private String cidade;
    private String cep;
    private String estado;
    private String email;
    private String telefone;

    public Cliente() {//Criação de construtor sem parametro coerente com o metodo de consulta da Model
    }

    public Cliente(String cpf_cnpj, String nome, String endereco, String complemento, String bairro,
            String cidade, String cep, String estado, String email, String telefone) {
        this.cpf_cnpj = cpf_cnpj;
        this.nome = nome;
        this.endereco = endereco;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.cep = cep;
        this.estado = estado;
        this.email = email;
        this.telefone = telefone;
    }

    public String getCpf_cnpj() {
        return cpf_cnpj;
    }

    public void setCpf_cnpj(String cpf_cnpj) {
        this.cpf_cnpj = cpf_cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void adicionar() throws SQLException {//Execução do insert no DB

        Connection conexao = null;
        PreparedStatement pat = null;
        ResultSet rs = null;
        conexao = ModuloConexao.conector();

        String sql = "insert into cadastrocliente(cpf_cnpj,nome,endereco,complemento,bairro, cidade, "
                + "cep, estado, email, telefone) values(?,?,?,?,?,?,?,?,?,?)";
        //try {//Definindo o que vai do campo da tela para o campo respectivo do DB.

        pat = conexao.prepareStatement(sql);

        pat.setString(1, this.cpf_cnpj);
        pat.setString(2, this.nome);
        pat.setString(3, this.endereco);
        pat.setString(4, this.complemento);
        pat.setString(5, this.bairro);
        pat.setString(6, this.cidade);
        pat.setString(7, this.cep);
        pat.setString(8, this.estado);
        pat.setString(9, this.email);
        pat.setString(10, this.telefone);

        pat.executeUpdate();

    }

    public Cliente consultar(String cpf_cnpj) throws SQLException {//Execução do select atraves do objeto, no DB

        Connection conexao = null;
        PreparedStatement pat = null;
        ResultSet rs = null;
        conexao = ModuloConexao.conector();

        String sql = "select * from cadastrocliente where cpf_cnpj=?";

        try {
            //Preparação e Passagem dos parametros    
            pat = conexao.prepareStatement(sql);
            pat.setString(1, cpf_cnpj);
            rs = pat.executeQuery();
            //**Tratamento de exceções de "digitação" não foram considerado neste momento.  
            if (rs.next()) {

                this.cpf_cnpj = rs.getString(1);
                this.nome = rs.getString(2);
                this.endereco = rs.getString(3);
                this.complemento = rs.getString(4);
                this.bairro = rs.getString(5);
                this.cidade = rs.getString(6);
                this.cep = rs.getString(7);
                this.estado = rs.getString(8);
                this.email = rs.getString(9);
                this.telefone = rs.getString(10);

            } else {
                this.cpf_cnpj = "0";

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

        String sql = "update cadastrocliente set nome=?,endereco=?,complemento=?,"
                + "bairro=?,cidade=?,cep=?,estado=?,email=?,telefone=? where cpf_cnpj=?";

        pat = conexao.prepareStatement(sql);
        pat.setString(1, this.nome);
        pat.setString(2, this.endereco);
        pat.setString(3, this.complemento);
        pat.setString(4, this.bairro);
        pat.setString(5, this.cidade);
        pat.setString(6, this.cep);
        pat.setString(7, this.estado);
        pat.setString(8, this.email);
        pat.setString(9, this.telefone);
        pat.setString(10, this.cpf_cnpj);//Campo da busca/Id é o ultimo na inclusão

        //**Tratamento de exceções de "digitação" não foram considerado neste momento.           
        //A linha abaixo atualiza a tabela
        pat.executeUpdate();

    }

    public void deletar(String cpf_cnpj) throws SQLException {//Execução do insert no DB

        Connection conexao = null;
        PreparedStatement pat = null;
        ResultSet rs = null;
        conexao = ModuloConexao.conector();

        String sql = "delete from cadastrocliente where cpf_cnpj=?";
        pat = conexao.prepareStatement(sql);
        pat.setString(1, cpf_cnpj);
        pat.executeUpdate();

    }
}

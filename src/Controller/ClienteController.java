/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;


import Model.Cliente;
import java.sql.SQLException;

/**
 *
 * @author sudar
 */
public class ClienteController {//Criei o casminho do metodo boolean adicionar() com a classe Model 
    //instanciada com parametros a serem recebidos e em seguida chama-se o metodo adcionar da Model.

    /**
     *Metodo intermediario que repassa a classe Cliente, da pasta Model, a ação adicionar dados do cliente ao Banco de Dados, tabela cadastrocliente
     * @param cpf_cnpj
     * @param nome
     * @param endereco
     * @param complemento
     * @param bairro
     * @param cidade
     * @param cep
     * @param estado
     * @param email
     * @param telefone
     * @return cadastro dos dados
     * @throws SQLException
     */
    public boolean adicionar(String cpf_cnpj, String nome, String endereco, String complemento, String bairro,
            String cidade, String cep, String estado, String email, String telefone) throws SQLException {

        Model.Cliente obj = new Model.Cliente(cpf_cnpj, nome, endereco, complemento, bairro, cidade, cep,
                estado, email, telefone);
        obj.adicionar();
        return true;
    }

    /**
     *Metodo intermediario que repassa a classe Cliente, da pasta Model, a ação que permite o select/consulta dos dados do cliente na tabela cadastrocliente, atraves do cpf-cnpj.
     * @param cpf_cnpj
     * @return
     * @throws java.sql.SQLException
     */
    public Cliente consultar(String cpf_cnpj) throws java.sql.SQLException {
        Model.Cliente obj = new Model.Cliente();

        return obj.consultar(cpf_cnpj);

    }

    /**
     *Metodo intermediario que repassa a classe Cliente, da pasta Model, a ação que permite alterar dados do cliente na tabela cadastrocliente.
     * @param cpf_cnpj
     * @param nome
     * @param endereco
     * @param complemento
     * @param bairro
     * @param cidade
     * @param cep
     * @param estado
     * @param email
     * @param telefone
     * @return disponibilidade a alteração
     * @throws java.sql.SQLException
     */
    public boolean alterar(String cpf_cnpj, String nome, String endereco, String complemento, String bairro,
            String cidade, String cep, String estado, String email, String telefone) throws java.sql.SQLException {
        Model.Cliente obj = new Model.Cliente(cpf_cnpj, nome, endereco, complemento, bairro,
                cidade, cep, estado, email, telefone);
        obj.alterar();
        return true;
    }

    /**
     *Metodo intermediario que repassa a classe Cliente, da pasta Model, a ação que permite o deletar todos os dados do cliente na tabela cadastrocliente.
     * @param cpf_cnpj
     * @throws java.sql.SQLException
     */
    public void deletar(String cpf_cnpj) throws java.sql.SQLException {
        Model.Cliente obj = new Model.Cliente();

        obj.deletar(cpf_cnpj);

    }
}

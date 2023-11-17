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

    public boolean adicionar(String cpf_cnpj, String nome, String endereco, String complemento, String bairro,
            String cidade, String cep, String estado, String email, String telefone) throws SQLException {

        Model.Cliente obj = new Model.Cliente(cpf_cnpj, nome, endereco, complemento, bairro, cidade, cep,
                estado, email, telefone);
        obj.adicionar();
        return true;
    }

    public Cliente consultar(String cpf_cnpj) throws java.sql.SQLException {
        Model.Cliente obj = new Model.Cliente();

        return obj.consultar(cpf_cnpj);

    }

    public boolean alterar(String cpf_cnpj, String nome, String endereco, String complemento, String bairro,
            String cidade, String cep, String estado, String email, String telefone) throws java.sql.SQLException {
        Model.Cliente obj = new Model.Cliente(cpf_cnpj, nome, endereco, complemento, bairro,
                cidade, cep, estado, email, telefone);
        obj.alterar();
        return true;
    }

    public void deletar(String cpf_cnpj) throws java.sql.SQLException {
        Model.Cliente obj = new Model.Cliente();

        obj.deletar(cpf_cnpj);

    }
}

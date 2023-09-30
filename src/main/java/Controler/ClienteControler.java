/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controler;

import Model.Cliente;

    //private String codCliente;
   

/**
 *
 * @author sudar
 */
public class ClienteControler {
    
    public boolean CadastrarCliente(String nome,String cpf_cnpj,String endereco, String complemento, String bairro, 
           String cidade, int cep, String estado, String email, int telefone) {
        
        if(nome != null && nome.length()>0 &&
           cpf_cnpj != null && cpf_cnpj.length()>0 &&
           endereco != null && endereco.length()>0 && 
           complemento != null && complemento.length()>0 && 
           bairro != null && bairro.length()>0 &&
           cidade != null && cidade.length()>0 &&
           cep>0 &&
           estado != null && estado.length()>0 && 
           email != null && email.length()>0  &&
           telefone>0){
           
            Cliente  cliente = new Cliente();
            
            cliente.setNome(nome);
            cliente.setCpf_cnpj(cpf_cnpj);
            cliente.setEndereco(endereco);
            cliente.setComplemento(complemento);
            cliente.setBairro(bairro);
            cliente.setCidade(cidade);
            cliente.setCep(cep); 
            cliente.setEstado(estado);
            cliente.setEmail(email);
            cliente.setTelefone(telefone);
            cliente.cadastrarCliente(cliente);
        return true;
        }
        return false;
    }
    
}

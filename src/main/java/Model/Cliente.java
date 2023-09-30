/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author sudar
 */
public class Cliente {
    
    
    private String nome;
    private String cpf_cnpj;
    private String endereco;
    private String complemento;
    private String bairro;
    private int cep;
    private String cidade;
    private String estado;
    private String email;
    private int telefone;

    
     //Declaração Array List
    ArrayList<Cliente> ListaCli;

    
     public Cliente () { //Declaração ArrayList no 1ºconstrutor Array List
        ListaCli = new ArrayList();

    }
    
    public Cliente(String nome, String cpf_cnpj, String endereco, String complemento, 
            String bairro, int cep, String cidade, String estado, String email, int telefone) {
       // this.codCliente = codCliente;
        this.nome = nome;
        this.cpf_cnpj = cpf_cnpj;
        this.endereco = endereco;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cep = cep;
        this.cidade = cidade;
        this.estado = estado;
        this.email = email;
        this.telefone = telefone;
         //Declaração ArrayList no 2ºconstrutor Array List
        ListaCli = new ArrayList();
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf_cnpj() {
        return cpf_cnpj;
    }

    public void setCpf_cnpj(String cpf_cnpj) {
        this.cpf_cnpj = cpf_cnpj;
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

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
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

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public void cadastrarCliente(Cliente cliente){
    
   }
   
          //Metodo reconhecimento CLientes
    public ArrayList<Cliente> getListaCli() {
        return ListaCli;
    }

    public void setListaCli(ArrayList<Cliente> ListaCli) {
        this.ListaCli = ListaCli;
    }
      //Metodo de inclusão especifico produto para inclusão na lista
      public void addCli (Cliente Ci){
             ListaCli.add(Ci);
      }
    
}

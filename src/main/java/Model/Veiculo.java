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
public class Veiculo {
    
    private String placa;
    private String modelo;
    private String ano;
    private String motorizacao;
    private String combustivel;
    private String quilometragem;
     //Declaração Array List
    ArrayList<Veiculo> ListaVec;
    
    
   public Veiculo () { //Declaração ArrayList no 1ºconstrutor Array List
        ListaVec = new ArrayList();
    }

    public Veiculo(String placa, String modelo, String ano, String motorizacao,
            String combustivel, String quilometragem){ 
        this.placa = placa;
        this.modelo = modelo;
        this.ano = ano;
        this.motorizacao = motorizacao;
        this.combustivel = combustivel;
        this.quilometragem = quilometragem;
           
         //Declaração ArrayList no 2ºconstrutor Array List
        ListaVec = new ArrayList();
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
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
       //Metodo reconhecimento Veiculos
    public ArrayList<Veiculo> getListaVec() {
        return ListaVec;
    }

    public void setListaVec(ArrayList<Veiculo> ListaVec) {
        this.ListaVec = ListaVec;
    }
   
    public void cadastrarVeiculo(Veiculo veiculo){
    
   }
   
        //Metodo de inclusão especifico produto para inclusão na lista
    public void addVec (Veiculo Vc){
             ListaVec.add(Vc);
      }
}

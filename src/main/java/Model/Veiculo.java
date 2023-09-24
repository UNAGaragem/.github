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
    private ArrayList<Veiculo> itens = new ArrayList <Veiculo> ();

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

    
    public ArrayList<Veiculo> getItens() {
        return itens;
    }

    public void setItens(ArrayList<Veiculo> itens) {
        this.itens = itens;
    }

    public void cadastrarVeiculos(Veiculo veiculo){
    
   }
}

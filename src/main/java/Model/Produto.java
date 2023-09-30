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
public class Produto {
    
    private int codProduto;
    private String aplicacaoProduto;
    private String descricaoProduto;
    private int qtdeProduto;
    private Double precoProduto;
    
    //Declaração Array List
    ArrayList<Produto> ListaProd;

    public Produto () { //Declaração ArrayList no 1ºconstrutor Array List
        ListaProd = new ArrayList();

    }

    public Produto(int codProduto, String aplicacaoProduto, String descricaoProduto, int qtdeProduto, Double precoProduto) {
        this.codProduto = codProduto;
        this.aplicacaoProduto = aplicacaoProduto;
        this.descricaoProduto = descricaoProduto;
        this.qtdeProduto = qtdeProduto;
        this.precoProduto = precoProduto;
        //Declaração ArrayList no 2ºconstrutor Array List
         ListaProd = new ArrayList();
         
    }

  

    public int getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(int codProduto) {
        this.codProduto = codProduto;
    }

    public String getAplicacaoProduto() {
        return aplicacaoProduto;
    }

    public void setAplicacaoProduto(String aplicacaoProduto) {
        this.aplicacaoProduto = aplicacaoProduto;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public int getQtdeProduto() {
        return qtdeProduto;
    }

    public void setQtdeProduto(int qtdeProduto) {
        this.qtdeProduto = qtdeProduto;
    }

    public Double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(Double precoProduto) {
        this.precoProduto = precoProduto;
    }

    
     public void cadastrarProduto(Produto produto){
    
   }
       //Metodo reconhecimento produtos
    public ArrayList<Produto> getListaProd() {
        return ListaProd;
    }

    public void setListaProd(ArrayList<Produto> ListaProd) {
        this.ListaProd = ListaProd;
    }
      //Metodo de inclusão especifico produto para inclusão na lista
      public void addProd (Produto Pd){
             ListaProd.add(Pd);
      }
   
   
}

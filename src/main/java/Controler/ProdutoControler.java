/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controler;

import Model.Produto;

/**
 *
 * @author sudar
 */
public class ProdutoControler {
    
    public boolean CadastrarProduto(int codProduto,String aplicacaoProduto,String descricaoProduto, int qtdeProduto, 
           double precoProduto) {
        
        if(codProduto>0 &&
           aplicacaoProduto != null && aplicacaoProduto.length()>0 &&
           descricaoProduto != null && descricaoProduto.length()>0 && 
           qtdeProduto>0 &&
           precoProduto>0){
           
           
            Produto produto = new Produto();
           
            produto.setCodProduto(codProduto);
            produto.setAplicacaoProduto(aplicacaoProduto);
            produto.setDescricaoProduto(descricaoProduto);
            produto.setQtdeProduto(qtdeProduto);
            produto.setPrecoProduto(precoProduto);
            produto.cadastrarProduto(produto);
          
        return true;
        }
        return false;
    }
}

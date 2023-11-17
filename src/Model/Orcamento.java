/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author sudar
 */
public class Orcamento {

   // private String codigo;
    private String descricao;
    private String modeloAplicacao;
    private String qtde;
    private String valor;

    public Orcamento(String modeloAplicacao, String descricao) {
       // this.codigo = codigo;
        this.descricao = descricao;
        this.modeloAplicacao = modeloAplicacao;
        this.qtde = qtde;
        this.valor = valor;
    }

   
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getModeloAplicacao() {
        return modeloAplicacao;
    }

    public void setModeloAplicacao(String modeloAplicacao) {
        this.modeloAplicacao = modeloAplicacao;
    }

    public String getQtde() {
        return qtde;
    }

    public void setQtde(String qtde) {
        this.qtde = qtde;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public void salvarOrcamento(String cpf_cnpj) {

    }
    
    public String retornarOi(){
        return "Oi";
    }
}

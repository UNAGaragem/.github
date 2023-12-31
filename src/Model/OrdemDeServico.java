/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author sudar
 */
public class OrdemDeServico {

    private String itemServico;
    private String descricao;
    private String codigoProd;
    private String codigoMo;
    private String valorItem;
    private String valorTotal;

    public OrdemDeServico(String itemServico, String descricao, String codigoProd, String codigoMo, String valorItem, String valorTotal) {
        this.itemServico = itemServico;
        this.descricao = descricao;
        this.codigoProd = codigoProd;
        this.codigoMo = codigoMo;
        this.valorItem = valorItem;
        this.valorTotal = valorTotal;
    }

    public String getItemServico() {
        return itemServico;
    }

    public void setItemServico(String itemServico) {
        this.itemServico = itemServico;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCodigoProd() {
        return codigoProd;
    }

    public void setCodigoProd(String codigoProd) {
        this.codigoProd = codigoProd;
    }

    public String getCodigoMo() {
        return codigoMo;
    }

    public void setCodigoMo(String codigoMo) {
        this.codigoMo = codigoMo;
    }

    public String getValorItem() {
        return valorItem;
    }

    public void setValorItem(String valorItem) {
        this.valorItem = valorItem;
    }

    public String getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(String valorTotal) {
        this.valorTotal = valorTotal;
    }

    /**
     **Metodo previsto a receber o comando da classe OrdemDeServicoController e
     * efetua a ação salvar, solicitada pela View
     *
     * @param cpf_cnpj
     */
    public void salvarOrdemDeServico(String cpf_cnpj) {

    }

}

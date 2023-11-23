/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author sudar
 */
public class ManutencaoServico {

    public String itemServico;
    public String codigoProd;
    public String descricao;
    public String codigoMo;
    public String valorItem;
    public String valorTotal;
    public String dataTerminoServico;
    public String dataPagamento;
    public String dataEntregaVeiculo;

    public ManutencaoServico(String itemServico, String codigoProd, String descricao, String codigoMo, String valorItem, String valorTotal, String dataTerminoServico, String dataPagamento, String dataEntregaVeiculo) {
        this.itemServico = itemServico;
        this.codigoProd = codigoProd;
        this.descricao = descricao;
        this.codigoMo = codigoMo;
        this.valorItem = valorItem;
        this.valorTotal = valorTotal;
        this.dataTerminoServico = dataTerminoServico;
        this.dataPagamento = dataPagamento;
        this.dataEntregaVeiculo = dataEntregaVeiculo;
    }

    public String getItemServico() {
        return itemServico;
    }

    public void setItemServico(String itemServico) {
        this.itemServico = itemServico;
    }

    public String getCodigoProd() {
        return codigoProd;
    }

    public void setCodigoProd(String codigoProd) {
        this.codigoProd = codigoProd;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
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

    public String getDataTerminoServico() {
        return dataTerminoServico;
    }

    public void setDataTerminoServico(String dataTerminoServico) {
        this.dataTerminoServico = dataTerminoServico;
    }

    public String getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(String dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public String getDataEntregaVeiculo() {
        return dataEntregaVeiculo;
    }

    public void setDataEntregaVeiculo(String dataEntregaVeiculo) {
        this.dataEntregaVeiculo = dataEntregaVeiculo;
    }

    /**
     **Metodo previsto a receber o comando da classe ManutencaoOrdemDeServicoController
     * e efetua a ação salvar, solicitada pela View
     *
     * @param cpf_cnpj
     */
    public void salvarManutencaoOrdemDeServico(String cpf_cnpj) {

    }
}

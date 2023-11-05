/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author sudar
 */
public class ExecucaoServico {

    private String itemServico;
    private String descricao;
    private String nomeOperador;
    private String codigoMo;
    private String valorItem;
    private String valorTotal;

    public ExecucaoServico(String itemServico, String descricao, String nomeOperador, String codigoMo, String valorItem, String valorTotal) {
        this.itemServico = itemServico;
        this.descricao = descricao;
        this.nomeOperador = nomeOperador;
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

    public String getNomeOperador() {
        return nomeOperador;
    }

    public void setNomeOperador(String nomeOperador) {
        this.nomeOperador = nomeOperador;
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

    public void salvarExecucaoDeServico(String cpf_cnpj) {

    }
}

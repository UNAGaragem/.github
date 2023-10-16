/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author sudar
 */
public class ServicoOperador {
    
    private String departamento;
    private String nomeOperador;
    private String descricaoServico;
    private String modeloAplicacao;
    private String tempoExecucao;

    public ServicoOperador(String departamento, String nomeOperador, String descricaoServico, String modeloAplicacao,
            String tempoExecucao) {
        this.departamento = departamento;
        this.nomeOperador = nomeOperador;
        this.descricaoServico = descricaoServico;
        this.modeloAplicacao = modeloAplicacao;
        this.tempoExecucao = tempoExecucao;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getNomeOperador() {
        return nomeOperador;
    }

    public void setNomeOperador(String nomeOperador) {
        this.nomeOperador = nomeOperador;
    }

    public String getDescricaoServico() {
        return descricaoServico;
    }

    public void setDescricaoServico(String descricaoServico) {
        this.descricaoServico = descricaoServico;
    }

    public String getModeloAplicacao() {
        return modeloAplicacao;
    }

    public void setModeloAplicacao(String modeloAplicacao) {
        this.modeloAplicacao = modeloAplicacao;
    }

    public String getTempoExecucao() {
        return tempoExecucao;
    }

    public void setTempoExecucao(String tempoExecucao) {
        this.tempoExecucao = tempoExecucao;
    }

    
}
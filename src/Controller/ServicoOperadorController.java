/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.sql.SQLException;
import Model.ServicoOperador;

/**
 *
 * @author sudar
 */
public class ServicoOperadorController {

    //Criei o casminho do metodo boolean adicionar() com a classe Model 
    //instanciada com parametros a serem recebidos e em seguida chama-se o metodo adcionar da Model
    /**
     *Metodo intermediario que repassa á classe ServicoOperador, da pasta Model, a ação que permite adicionar/cadastrar informações do Serviço e Ooerador nao banco de dados,
     * tabelça servicooperador. Atraves deste cadastro indetifica-se o o departamento, o operador, o codigo do 
     * serviço em execução, a descrição, o modelo e o tempo de execução.
     * @param departamento
     * @param nomeOperador
     * @param codigo
     * @param descricaoServico
     * @param modelo
     * @param tempoExecucao
     * @return habilitação dos dados para uso nas telas de orçamentpo e na execução de serviço.
     * @throws java.sql.SQLException
     */
    public boolean adicionar(String departamento, String nomeOperador, String codigo, String descricaoServico,
            String modelo, String tempoExecucao) throws java.sql.SQLException {
        Model.ServicoOperador obj = new Model.ServicoOperador(departamento, nomeOperador, codigo,
                descricaoServico, modelo, tempoExecucao);
        obj.adicionar();
        return true;

    }

    /**
     *Metodo intermediario que repassa á classe ServicoOperador, da pasta Model, a ação que permite a o select/consulta das informações de serviço, atraves do codigo  
     * @param codigo
     * @return todas as informações referente ao serviço 
     * @throws java.sql.SQLException
     */
    public ServicoOperador consultar(String codigo) throws java.sql.SQLException {
        Model.ServicoOperador obj = new Model.ServicoOperador();

        return obj.consultar(codigo);

    }

    /**
     *Metodo intermediario que repassa á classe ServicoOperador, da pasta Model, a ação que permite a o alteração das informações de serviço na tabela cadastroservicooperador.  
     * @param departamento
     * @param nomeOperador
     * @param codigo
     * @param descricaoServico
     * @param modelo
     * @param tempoExecucao
     * @return disponibilidade de alteração a todos os campos
     * @throws java.sql.SQLException
     */
    public boolean alterar(String departamento, String nomeOperador, String codigo, String descricaoServico,
            String modelo, String tempoExecucao) throws java.sql.SQLException {
        Model.ServicoOperador obj = new Model.ServicoOperador(departamento, nomeOperador, codigo,
                descricaoServico, modelo, tempoExecucao);
        obj.alterar();
        return true;
    }

    /**
     *Metodo intermediario que repassa á classe ServicoOperador, da pasta Model, a ação que permite a o deletar todas das informações do codigo na tabela serviçooperador.  
     * @param codigo
     * @throws java.sql.SQLException
     */
    public void deletar(String codigo) throws java.sql.SQLException {
        Model.ServicoOperador obj = new Model.ServicoOperador();

        obj.deletar(codigo);

    }
}

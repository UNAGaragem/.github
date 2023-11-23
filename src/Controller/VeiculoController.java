/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Veiculo;
import java.sql.SQLException;

/**
 *
 * @author sudar
 */
public class VeiculoController {//Criei o casminho do metodo boolean adicionar() com a classe Model 
    //instanciada com parametros a serem recebidos e em seguida chama-se o metodo adcionar da Model.

    /**
     *Metodo intermediario que repassa á classe Veiculo, da pasta Model, a ação que permite adicionar dados do veiculo na tabela cadastroveiculo.  
     * @param placa
     * @param cpf_cnpj
     * @param modelo
     * @param anoFabricacao
     * @param motorizacao
     * @param combustivel
     * @param quilometragem
     * @return cadastro das informações do veiculo
     * @throws SQLException
     */
    public boolean adicionar(String placa, String cpf_cnpj, String modelo, String anoFabricacao, String motorizacao,
            String combustivel, String quilometragem) throws SQLException {
        Model.Veiculo obj = new Model.Veiculo(placa, cpf_cnpj, modelo, anoFabricacao,
                motorizacao, combustivel, quilometragem);
        obj.adicionar();

        return true;

    }

    /**
     *Metodo intermediario que repassa á classe Veiculo, da pasta Model, a ação que permite select/consultar dados do veiculo na tabela cadastroveiculo, atraves da placa.
     * @param placa
     * @return disponibilidade dos dados
     * @throws java.sql.SQLException
     */
    public Veiculo consultar(String placa) throws java.sql.SQLException {
        Model.Veiculo obj = new Model.Veiculo();

        return obj.consultar(placa);

    }

    /**
     *Metodo intermediario que repassa á classe Veiculo, da pasta Model, a ação que altera dados do veiculo na tabela cadastroveiculo
     * @param placa
     * @param cpf_cnpj
     * @param modelo
     * @param anoFabricacao
     * @param motorizacao
     * @param combustivel
     * @param quilometragem
     * @return disponibilidade de alteração dos campos
     * @throws java.sql.SQLException
     */
    public boolean alterar(String placa, String cpf_cnpj, String modelo, String anoFabricacao, String motorizacao,
            String combustivel, String quilometragem) throws java.sql.SQLException {
        Model.Veiculo obj = new Model.Veiculo(placa, cpf_cnpj, modelo, anoFabricacao, motorizacao, combustivel,
                quilometragem);
        obj.alterar();
        return true;
    }

    /**
     *Metodo intermediario que repassa á classe Veiculo, da pasta Model, a ação que deleta, atraves do parametro placa, todos os dados do veiculo na tabela cadastroveiculo
     * @param placa
     * @throws java.sql.SQLException
     */
    public void deletar(String placa) throws java.sql.SQLException {
        Model.Veiculo obj = new Model.Veiculo();

        obj.deletar(placa);

    }
}

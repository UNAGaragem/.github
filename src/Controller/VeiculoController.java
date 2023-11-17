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

    public boolean adicionar(String placa, String cpf_cnpj, String modelo, String anoFabricacao, String motorizacao,
            String combustivel, String quilometragem) throws SQLException {
        Model.Veiculo obj = new Model.Veiculo(placa, cpf_cnpj, modelo, anoFabricacao,
                motorizacao, combustivel, quilometragem);
        obj.adicionar();

        return true;

    }

    public Veiculo consultar(String placa) throws java.sql.SQLException {
        Model.Veiculo obj = new Model.Veiculo();

        return obj.consultar(placa);

    }

    public boolean alterar(String placa, String cpf_cnpj, String modelo, String anoFabricacao, String motorizacao,
            String combustivel, String quilometragem) throws java.sql.SQLException {
        Model.Veiculo obj = new Model.Veiculo(placa, cpf_cnpj, modelo, anoFabricacao, motorizacao, combustivel,
                quilometragem);
        obj.alterar();
        return true;
    }

    public void deletar(String placa) throws java.sql.SQLException {
        Model.Veiculo obj = new Model.Veiculo();

        obj.deletar(placa);

    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controler;
import Model.Veiculo;
/**
 *
 * @author sudar
 */
public class VeiculoControler {
    
   public boolean CadastrarVeiculo(String placa,String modelo,String ano, String motorizacao, 
           String combustivel, String quilometragem) {
        
        if(placa != null && placa.length()>0 &&
                modelo != null && modelo.length()>0 &&
                ano != null && ano.length()>0 && 
                motorizacao != null && motorizacao.length()>0 &&
                combustivel != null &&
                quilometragem != null && quilometragem.length()>0){
           
            Veiculo  veiculo = new Veiculo();
            veiculo.setPlaca(placa);
            veiculo.setModelo(modelo);
            veiculo.setAno(ano);
            veiculo.setMotorizacao(motorizacao);
            veiculo.setCombustivel(combustivel);
            veiculo.setQuilometragem(quilometragem);
            veiculo.cadastrarVeiculo(veiculo);
        return true;
        }
        return false;
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;

import Controller.LoginController;
import io.cucumber.java.pt.Dado;
//import io.cucumber.java.pt.Quando;
import io.cucumber.java.pt.*;
import org.junit.Assert;
/**
 *
 * @author sudar
 */

public class LoginSteps {
    
    private LoginController c;
    private String result;
    
    @Dado("buscando data atualizada das telas do sistema")
    public void test1(){
        c = new LoginController();
       result = c.AtualizarCampoData();
          
    }
    
      @Entao("o resultado devera ser {String} na tela")
    public void a_data_devera_aparecer_na_tela(String expectedResult) {
        Assert.assertEquals(expectedResult, result);
    }
    
    public void ValidarLogin(String usuario, String senha, int contadorLoginErrado) {   
 
            c = new LoginController();
       result = c.ValidarLogin(usuario, senha, contadorLoginErrado);
        
    }   
    
      @Entao("o resultado devera ser {String} na tela")
    public void sera_retornado_validacao_usuario(String expectedResult) {
        Assert.assertEquals(expectedResult, result);
    }

     public void BuscarPermissaoDeAcesso(String usuario, String senha)
     {               
         c = new LoginController();
        result = c.BuscarPermissaoDeAcesso(usuario, senha);
      
     }  
     
         @Entao("o resultado devera ser {String} na tela")
    public void sera_retornado_a_permissao_de_acesso(String expectedResult) {
        Assert.assertEquals(expectedResult, result);
    }
 
}

package Test;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sudar
 */

import com.mycompany.calculadora.Calculadora;
import io.cucumber.java.pt.*;
import org.junit.Assert;

public class UnaGaragemSteps {
    
    private UnaGaragem c;
    private int result;
    
    @Dado("que \"Fulano\" digitou {int} e {int} na calculadora")
    public void fulano_digitou_na_calculadora(int a, int b) {
        c = new Calculadora(a,b);
    }
   
    @Quando("\"Fulano\" escolher somar")
    public void fulano_escolher_somar() {
        result = c.somar();
    }

    @Quando("\"Fulano\" escolher subtrair")
    public void fulano_escolher_subtrair() {
        result = c.subtrair();
    }
    
    @Quando("\"Fulano\" escolher multiplicar")
    public void fulano_escolher_multiplicar() {
        result = c.multiplicar();
    }
    @Quando("\"Fulano\" escolher dividir")
    public void fulano_escolher_dividir() {
        result = c.dividir();
    }
   
    @Entao("o resultado devera ser {int} na tela")
    public void o_resultado_devera_aparecer_na_tela(int expectedResult) {
        Assert.assertEquals(expectedResult, result);
    }
}
    

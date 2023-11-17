package Test;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author sudar
 */
import Model.Orcamento;
import Controller.OrcamentoController;
import io.cucumber.java.pt.*;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class OrcamentoSteps {

    public Orcamento c;
    public String result;
    // private String resultString;

    /* @Dado("que \"Fulano\" digitou {String} e {String} no orçamento")
    public void fulano_digitou_no_orcamento(String modelo, String descricao) {
        c = new Orcamento("Gm","Buzina");
    }*/
    @Test
    @Dado("que \"Fulano\" digitou {String} e {String} no orçamento")
    public void testorcamento(String modelo, String descricao) {
        String expResult = "920,00";
        Controller.OrcamentoController objOrcamento = new Controller.OrcamentoController();
        result = objOrcamento.orcamento("Gm", "Motor");
        assertEquals(expResult, result, 0);//920,00
    }
    @Test
    @Quando("\"Fulano\" escolher somar")
    public void testretornarOi() {
        result = c.retornarOi();
    }

    /* @Quando("\"Fulano\" escolher subtrair")
    public void fulano_escolher_subtrair() {
      //  result = c.subtrair();
    }
    
    @Quando("\"Fulano\" escolher multiplicar")
    public void fulano_escolher_multiplicar() {
       // result = c.multiplicar();
    }
    @Quando("\"Fulano\" escolher dividir")
    public void fulano_escolher_dividir() {
       // result = c.dividir();
    }*/
    @Entao("o resultado devera ser {int} na tela")
    public void o_resultado_devera_aparecer_na_tela(String expectedResult) {
        Assert.assertEquals(expectedResult, result);
    }
}

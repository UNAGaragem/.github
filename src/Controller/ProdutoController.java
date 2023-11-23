/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.sql.SQLException;
import Model.Produto;

/**
 *
 * @author sudar
 */
public class ProdutoController {//Criei o caminho dos metodos a classe Model (instanciada),
    //com parametros a serem recebidos e em seguida chama-se o metodo adcionar da Model.

    /**
     *Metodo intermediario que repassa á classe Produto, da pasta Model, a ação de adicionar dados do produto á tabela cadastroproduto
     * @param codigo
     * @param descricao
     * @param modelo
     * @param qtde
     * @param valor
     * @return cadastro das informações do produto
     * @throws java.sql.SQLException
     */
    public boolean adicionar(String codigo, String descricao, String modelo,
            String qtde, String valor) throws java.sql.SQLException {

        Model.Produto obj = new Model.Produto(codigo, descricao, modelo, qtde, valor);
        obj.adicionar();
        return true;
    }

    /**
     *Metodo intermediario que repassa á classe Produto, da pasta Model, a ação que permite o select/consulta de dados do produto na tabela cadastroproduto, atraves do codigo.
     * @param codigo
     * @return disponibilidade das informações do produto
     * @throws java.sql.SQLException
     */
    public Produto consultar(String codigo) throws java.sql.SQLException {
        Model.Produto obj = new Model.Produto();

        return obj.consultar(codigo);

    }

    /**
     *Metodo intermediario que repassa á classe Produto, da pasta Model, a ação que permite o alterar dados do produto na tabela cadastroproduto.
     * @param codigo
     * @param descricao
     * @param modelo
     * @param qtde
     * @param valor
     * @return alteração das informações do produto
     * @throws java.sql.SQLException
     */
    public boolean alterar(String codigo, String descricao, String modelo,
            String qtde, String valor) throws java.sql.SQLException {
        Model.Produto obj = new Model.Produto(codigo, descricao, modelo,
                qtde, valor);
        obj.alterar();
        return true;
    }

    /**
     *Metodo intermediario que repassa á classe Produto, da pasta Model, a ação que permite deletar todos os dados do produto na tabela cadastroproduto, eliminando-o.
     * @param codigo
     * @throws java.sql.SQLException
     */
    public void deletar(String codigo) throws java.sql.SQLException {
        Model.Produto obj = new Model.Produto();

        obj.deletar(codigo);

    }
}

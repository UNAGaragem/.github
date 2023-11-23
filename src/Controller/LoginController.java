/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import Model.Login;
import DalConnection.ModuloConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author sudar
 */
public class LoginController {

    /**
     *Metodo intermediario que permite o alimentação da data do sistema na parte superior das telas View.
     * @return disponibilidade da data
     */
    public String AtualizarCampoData() {

        String formatodDate = "";
        Date date = new Date();
        DateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        formatodDate = formato.format(date);
        return formatodDate;

    }

    /**
     * Metodo intermediario que define usuario e senha para login aos rc - recepcionista, Lj - lava jato e pr - produtivo.
     * Também limita o erro de acesso e a quantidade de erro em acesso. 
     * @param usuario
     * @param senha
     * @param contadorLoginErrado
     * @return
     */
    public String ValidarLogin(String usuario, String senha, int contadorLoginErrado) {
        String msgErro = "";

        try {
            // Model.Login mdlLogin = new Model.Login(usuario, senha);// criou objeto

            if (usuario.equals("rc00001") && senha.equals("12345")) {
                msgErro = "";
            } else if (usuario.equals("of00001") && senha.equals("12345")
                    || usuario.equals("lj00001") && senha.equals("12345")
                    || usuario.equals("pr00001") && senha.equals("12345")) {
                msgErro = "";
            } else {
                contadorLoginErrado = contadorLoginErrado + 1;
                if (contadorLoginErrado > 1) {
                    msgErro = "Excedeu numero de vezes permitido em entrada usuário com Login incorreto";
                    return msgErro;
                }
                //  System.out.println("Usuário ou Senha incorreta.");
                msgErro = "Usuário ou Senha incorreta.";
                return msgErro;
            }
        } catch (Exception ex) {
            msgErro = ex.getMessage();
            return msgErro;
        }
        return msgErro;
    }

    /**
     *Metodo intermediario que permite a ação de validação de usuario e senha no Login, aos usuarios rc - recepcionista, Lj - lava jato e 
     * pr - produtivo direcionando-os ao , caminho usuario, tela inicial.
     * @param usuario
     * @param senha
     * @return
     */
    public String BuscarPermissaoDeAcesso(String usuario, String senha) {
        String permissaoAcesso = "";
        if (usuario.equals("rc00001") && senha.equals("12345")) {
            permissaoAcesso = "CaminhoUsuario";
        } else if (usuario.equals("of00001") && senha.equals("12345")
                || usuario.equals("lj00001") && senha.equals("12345")
                || usuario.equals("pr00001") && senha.equals("12345")) {
            permissaoAcesso = "CaminhoUsuario";
        }

        return permissaoAcesso;
    }
}

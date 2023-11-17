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
    
    public String AtualizarCampoData(){
     
     String formatodDate = "";
     Date date = new Date();
     DateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm");
     formatodDate = formato.format(date);
     return formatodDate;
    
    }
    
    public String ValidarLogin(String usuario, String senha, int contadorLoginErrado) {   
        String msgErro = "";      
        
        try {
           // Model.Login mdlLogin = new Model.Login(usuario, senha);// criou objeto
            
         
            if (usuario.equals("rc00001") && senha.equals("12345")){
               msgErro = "";
            }
            else if (usuario.equals("of00001") && senha.equals("12345")||
                usuario.equals("lj00001") && senha.equals("12345")||
                usuario.equals("pr00001") && senha.equals("12345")){
             msgErro = "";
            }  

            else {
                contadorLoginErrado = contadorLoginErrado +1;
                if (contadorLoginErrado>1){
                    msgErro="Excedeu numero de vezes permitido em entrada usuário com Login incorreto";
                    return msgErro;
                }
                //  System.out.println("Usuário ou Senha incorreta.");
                msgErro = "Usuário ou Senha incorreta.";
                return msgErro;
            }
        }catch(Exception ex){
            msgErro = ex.getMessage();
            return msgErro;
        }
        return msgErro;
    }                                        

     public String BuscarPermissaoDeAcesso(String usuario, String senha)
     {
         String permissaoAcesso = "";
            if (usuario.equals("rc00001") && senha.equals("12345")){
                permissaoAcesso = "CaminhoUsuario";
            }
            else if (usuario.equals("of00001") && senha.equals("12345")||
                usuario.equals("lj00001") && senha.equals("12345")||
                usuario.equals("pr00001") && senha.equals("12345")){
                 permissaoAcesso = "CaminhoUsuario";
            }
            
            return permissaoAcesso;
     }
 }

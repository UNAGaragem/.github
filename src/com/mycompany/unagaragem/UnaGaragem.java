/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.unagaragem;

/**
 *
 * @author sudar
 */
public class UnaGaragem {
    
   "Tentativa de teste do Login"
           
   String usuario = jTextField1.getText();????
   String senha = jPasswordField1.getText();????
   
   Funcionalidade: UnaGaragem

Cenario: Verificar se o Banco de Dados esta Ativo (Icone verde) na tela de login
    Dado que o "Usuário" queira entrar no sistema
    Quando o "Usuário" estiver com o sistema aberto, deve visualizar se o icone de identificação Db esta em "verde".
    Então a resposta devera ser abertura do sistema pós inclusão de usuário e senha 

Cenario: Verificar se o Banco de Dados esta Inativo (Icone vermelho) na tela de login
    Dado que o "Usuário" queira entrar no sistema
    Quando o "Usuário" estiver com o sistema aberto, deve visualizar se o icone de identificação Db esta em "vermelho".
    Então a resposta será "Sistema desabilitado". 

Cenario: Realizar Login com sucesso
    Dado que o "Usuário" digitou seu usuário e senha corretos
    Quando o "Usuário" clicar o botão entrar
    Então a resposta devera ser apresentação das tela de orçamento 

Cenario: Realizar Login com reprovação
    Dado que o "Usuário" digitou seu usuário e senha incorretos
    Quando "Usuário" clicar o botão entrar
    Então a resposta será Usuário ou Senha incorreta 

Cenario: Realizar Login com reprovação
    Dado que o "Usuário" digitou seu usuário e senha incorretos mais de "2x"
    Quando "Usuário" clicar o botão entrar
    Então a resposta será Excedeu numero de vezes permitido em entrada usuário com Login incorreto 

Cenario: Sair do sistema
    Dado que o "Usuário" finalizou suas atividades no Una Garagem e queira sair do sistema
    Quando "Usuário" clicar o botão sair
    Então a resposta será fechamento/abandono das operações 
    
    private int a;
    private int b;

   public Calculadora(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int somar() {
        return a + b;
    }

    public int subtrair() {
        return a - b;
    }

    public int multiplicar() {
        return a * b;
    }

    public int dividir() {
        if (b > 1) {
            return a / b;
        }
        return 0;

    }

}


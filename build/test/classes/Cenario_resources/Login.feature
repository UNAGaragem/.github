
# language: pt

Funcionalidade: Pesquisa no UnaGaragem

Cenario: Verificar se o Banco de Dados esta Ativo (Icone verde) na tela de login
    Dado que o "Usuário" queira entrar no sistema
    Quando o "Usuário" estiver com o sistema aberto, deve visualizar se o icone de identificação Db esta em "verde".
    Então a resposta devera ser abertura do sistema pós inclusão de usuário e senha 

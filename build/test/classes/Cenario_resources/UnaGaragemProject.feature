# language: pt
Funcionalidade: UnaGaragem

Cenario: Verificar se o Banco de Dados esta Ativo (Icone verde) na tela de login
    Dado que o "Usuário" queira entrar no sistema
    Quando o "Usuário" estiver com o sistema aberto, deve visualizar se o icone de identificação Db esta em "verde".
    Então a resposta devera ser abertura do sistema pós inclusão de usuário e senha 

Cenario: Verificar se o Banco de Dados esta Inativo (Icone vermelho) na tela de login
    Dado que o "Usuário" queira entrar no sistema
    Quando o "Usuário" estiver com o sistema aberto, deve visualizar se o icone de identificação Db esta em "vermelho".
    Então a resposta será "Em estudo a resposta) kkkk 

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

Cenario: Realizar Orçamento com cadastro inexistente
    Dado que o "Recepcionista" digitou o modelo e a descrição
    Quando "Recepcionista" sair do campo descrição.
    Então a resposta devera ser modelo ou descrição inexistente caso algum dele não exista

Cenario: Realizar Orçamento com cadastro existente
    Dado que o "Recepcionista" digitou ao modelo e a descrição
    Quando "Recepcionista" sair do campo descrição.

    Então a resposta devera ser a apresentação valor do produto, tempo de serviço, valor de MO e valor total do orçamento

Cenario: Realizar mais orçamentos para o mesmo cliente
    Dado que o "Recepcionista" queira realizar novos orçamentos do mesmo cliente e momento, ele deverá clicar o botão + e em seguida ter a informação “copiada” no campo vazio disponível abaixo. 
    Quando "Recepcionista" já saiu do campo descrição e teve a resposta a sua pesquisa.
    Então a resposta devera ser o campo vazio inferiores “ocultos” com uma replica das informações obtidas em resposta da pesquisa. Descrição,  valor do produto, tempo de serviço, valor de MO e valor total. 




Cenario: Limpar campo descrição para realizar novos orçamentos para o mesmo cliente
    Dado que o "Recepcionista" queira realizar novos orçamentos do mesmo cliente e a pesquisa anterior ja esteja ocupando os campos de”replica” disponiveis abaixo, ele deverá clicar o botão limpar.
    Quando "Recepcionista" já saiu do campo descrição e teve a resposta a sua pesquisa.
    Então a resposta devera ser o campo descrição liberado para nova alimentação de orçamento.


Cenario: Limpar dados de orçamento
    Dado que o "Recepcionista" finalizou sua pesquisas de orçamento ele vai limpar 
    Quando o "Recepcionista" clicar o botão limpar a tela
    Então o resultado será limpeza da tela deixando a tela em condição inicial para nova pesquisa

Cenario: Orçamento aprovado
    Dado que o "Recepcionista" conseguiu realizar a pesquisa de orçamento e o cliente aprovou o orçamento
    Quando o "Recepcionista" clicar o botão Autorizado
    Então o resultado será a mudança de tela para execução da abertura de serviço.

Cenario: Voltar a tela de Login/Inicial
    Dado que o "Recepcionista" finalizou suas pesquisas ou queira voltar a tela de login
    Quando o "Recepcionista" clicar o botão Voltar
    Então o resultado ele será direcionado a tela de Login/Inicial.
# language:pt

Funcionalidade: Validar informações do endereço via Cep

  Contexto:
    Dado que acessei a api ViaCep


  Esquema do Cenario: Inserir cep para verificar o nome da sua rua
    Quando informei o cep "<CEP>"
    Então deverá mostrar o nome da rua "<RUA>"
    Exemplos:
    |      CEP     |         RUA             |
    |   90619-900   | Avenida Ipiranga       |
    |   90480-003   | Avenida Carlos Gomes   |


  Esquema do Cenario: Inserir cep para verificar o nome do bairro
    Quando informei o cep "<CEP>"
    Então deverá mostrar o nome do bairro "<BAIRRO>"
    Exemplos:
      |      CEP     |    BAIRRO    |
      |   90619-900   | Partenon    |
      |   90480-003   | Auxiliadora |


  Esquema do Cenario: Inserir cep para verificar a cidade
    Quando informei o cep "<CEP>"
    Então deverá mostrar o nome do cidade"<CIDADE>"
    Exemplos:
      |      CEP     |     CIDADE     |
      |   90619-900   | Porto Alegre  |
      |   90480-003   | Porto Alegre  |
      |   88010-000   | Florianópolis |
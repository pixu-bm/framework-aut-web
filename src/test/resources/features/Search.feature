Feature: Teste modelo

  Scenario: Realizar pesquisa no Google
    Given acessei o site do Google
    When pesquisar por hello world
    Then sera exibido Programa Olá Mundo
    And voltara para página inicial do Google
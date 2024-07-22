#Autor: Kevin Girón
  # Versión: 1.0
  # Languaje: Español
  # Fecha: 20/07/2024

@stories
Feature:  Reclutar un candidato
  Como usuario del sistema
  Quiero poder agregar y registrar candidatos, programar entrevistas y validar resultados
  Para poder gestionar el proceso de selección de manera eficiente

  @scenario1
  Scenario: Agregar candidato
    Given Usuario quiere agregar candidato
    When usuario realiza la acción
    Then se debe registrar el candidato

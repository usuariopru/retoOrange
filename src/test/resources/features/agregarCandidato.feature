#Autor: Kevin Girón
  # Versión: 1.0
  # Languaje: es
  # Fecha: 20/07/2024

@Orange
Feature:  Reclutar un candidato
  Como usuario del sistema
  Quiero poder agregar y registrar candidatos, programar entrevistas y validar resultados
  Para poder gestionar el proceso de selección de manera eficiente

  @IngresarCandidato
  Scenario: Agregar candidato
    Given Usuario quiere agregar candidato
      | strNombre | strContrasena | strTitulo |
      | Admin     | admin123      | Dashboard |
    When ingrese datos al formulario
      | strPrimerNombre | strSegundoNombre | strApellido | strVacante     | strCorreo            | strNumero  | strClaves | strNoteUno |
      | Usuario1        | Orange           | Choucair    | Senior QA Lead | vayatah263@padvn.com | 3012923869 | orange    |Exitoso     |
    And de clic en guardar
    Then se debe registrar el candidato

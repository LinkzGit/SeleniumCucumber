@Test
Feature: Proyecto de practica - Naguieta


    Scenario Outline: I can access to Naguieta Links
        Given I navigate to naguieta.github.io
        When I go to "<string>"
        Examples:
            | string                                                                  |
            | Visita mi perfil de LinkedIn                                            |
            | Visita mi perfil de GitHub                                              |
            | Pipeline de Machine Learning usando Apache Spark - Databricks community |
            | Análisis, app y presentación sobre restaurantes y negocios afines       |
            | Análisis y presentación sobre MOOCs                                     |
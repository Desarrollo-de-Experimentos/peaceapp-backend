Feature: Recibir Alertas de Zonas de Riesgo
  Como ciudadano,
  quiero recibir alertas si me acerco a una zona de alto riesgo,
  para tomar las precauciones necesarias

  Scenario Outline: Recibir alerta al acercarse a una zona de riesgo
    Given el usuario está en la ubicación "<ubicacion_usuario>"
    And hay una zona de riesgo en "<zona_riesgo>"
    When el usuario se acerca a la zona de riesgo
    Then el usuario recibe una alerta de riesgo

    Examples:
      | ubicacion_usuario | zona_riesgo       |
      | Ciudad A          | Zona de Inundación |
      | Ciudad B          | Zona de Terremoto  |
      | Ciudad C          | Zona de Incendio   |
      | Ciudad D          | Zona de Deslizamiento |

    Scenario Outline: No recibir alerta al alejarse de una zona de riesgo
    Given el usuario está en la ubicación "<ubicacion_usuario>"
    And hay una zona de riesgo en "<zona_riesgo>"
    When el usuario se aleja de la zona de riesgo
    Then el usuario no recibe alerta de riesgo

    Examples:
      | ubicacion_usuario | zona_riesgo       |
      | Ciudad A          | Zona de Inundación |
      | Ciudad B          | Zona de Terremoto  |
      | Ciudad C          | Zona de Incendio   |
      | Ciudad D          | Zona de Deslizamiento |
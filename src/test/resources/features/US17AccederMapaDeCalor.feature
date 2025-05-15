Feature: Acceder a Mapa de Calor
  Como usuario,
  Quiero poder ver un mapa de calor que muestre las zonas de mayor peligrosidad en mi área,
  Para tomar decisiones informadas sobre mi seguridad.

  Scenario Outline: Zonas peligrosas en el Mapa de Calor
    Given que el usuario está en la página principal de la aplicación,
    When selecciona el mapa de calor,
    Then se muestra el mapa de calor señalando las zonas peligrosas y/o zonas seguras de acuerdo con su ubicación

    Examples:
        | Ubicación         | Zonas peligrosas |
        | Centro de la ciudad | Zona A, Zona B  |
        | Parque Central     | Zona C          |
        | Barrio residencial  | Zona D          |
        | Playa              | Zona E          |
        | Montaña            | Zona F          |
        | Centro comercial    | Zona G          |
        | Aeropuerto         | Zona H          |
        | Estación de tren   | Zona I          |

    Scenario Outline: Acceso a información adicional
      Given que el usuario está en la página principal de la aplicación,
      When selecciona una zona peligrosa en el mapa de calor,
      Then se muestra información adicional sobre la zona seleccionada, incluyendo estadísticas y recomendaciones de seguridad

      Examples:
          | Zona peligrosa | Información adicional |
          | Zona A        | Estadísticas de delitos, recomendaciones de seguridad |
          | Zona B        | Estadísticas de delitos, recomendaciones de seguridad |
          | Zona C        | Estadísticas de delitos, recomendaciones de seguridad |
          | Zona D        | Estadísticas de delitos, recomendaciones de seguridad |
          | Zona E        | Estadísticas de delitos, recomendaciones de seguridad |
          | Zona F        | Estadísticas de delitos, recomendaciones de seguridad |
          | Zona G        | Estadísticas de delitos, recomendaciones de seguridad |
          | Zona H        | Estadísticas de delitos, recomendaciones de seguridad |

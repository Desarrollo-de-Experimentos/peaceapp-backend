Feature: US13 Visualización de Reportes
  Como ciudadano
  quiero poder ver los reportes de otros usuarios sobre incidentes ocurridos en la zona,
  para estar al tanto de los eventos de seguridad.

  Scenario Outline: Visualizar reportes
    Given que el ciudadano está navegando por la aplicación,
    When accede a la opción de "ver reportes"
    Then la aplicación muestra los reportes más recientes en la zona del ciudadano
    Examples:
      |  reporte_id | fecha       | tipo_incidente | descripcion               |
      |  1          | 2023-10-01  | Robo            | Robo de celular en la calle|
      |  2          | 2023-10-02  | Vandalismo      | Grafitis en la plaza      |
      |  3          | 2023-10-03  | Accidente       | Choque entre vehículos    |

    Scenario Outline: Reportes flotantes en el mapa
      Given que el ciudadano está utilizando el mapa interactivo en la aplicación,
      When activa la opción de mostrar reportes en el mapa,
      Then la aplicación superpone los reportes relevantes en el mapa, mostrando la ubicación exacta de cada incidente

        Examples:
            |  reporte_id | latitud  | longitud  | tipo_incidente | descripcion               |
            |  1          | -34.6037 | -58.3816  | Robo            | Robo de celular en la calle|
            |  2          | -34.6037 | -58.3816  | Vandalismo      | Grafitis en la plaza      |
            |  3          | -34.6037 | -58.3816  | Accidente       | Choque entre vehículos    |
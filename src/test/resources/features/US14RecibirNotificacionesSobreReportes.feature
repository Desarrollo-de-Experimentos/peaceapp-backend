Feature: US14 Recibir Notificaciones sobre Reportes
  Como ciudadano
  quiero recibir notificaciones sobre los reportes recientes en mi área,
  para estar informado y tomar precauciones si es necesario.

  Scenario Outline: Notificaciones activadas en dispositivo del usuario
    Given que el usuario tiene activadas las notificaciones,
    When se recibe un nuevo reporte en su área
    Then el usuario es notificado anteriormente.
Examples:

    | usuario_id | area       | reporte_id |
    | 1          | Centro     | 101        |
    | 2          | Norte      | 102        |
    | 3          | Sur        | 103        |
    | 4          | Este       | 104        |
    | 5          | Oeste      | 105        |

  Scenario Outline: Notificaciones personalizadas
    Given que el ciudadano desea ajustar la frecuencia o tipo de notificaciones que recibe,
    When accede a la configuración de notificaciones en la aplicación,
    Then puede seleccionar qué tipo de reportes desea ser notificado y con qué frecuencia.
Examples:
    | usuario_id | tipo_notificacion | frecuencia |
    | 1          | Emergencias      | Inmediata  |
    | 2          | Alertas          | Diaria     |
    | 3          | Información      | Semanal    |
    | 4          | Advertencias     | Mensual    |
    | 5          | Recomendaciones  | Semanal    |
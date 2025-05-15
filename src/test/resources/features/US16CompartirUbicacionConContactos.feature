Feature: Compartir Ubicación con Contactos
  Como usuario,
  quiero poder compartir mi ubicación con mis contactos cercanos
  para que puedan monitorear mi trayecto y estar alerta ante cualquier peligro.

  Scenario Outline: Contactos reciben la ubicación actual
    Given que un usuario desea compartir su ubicación,
    When activa la opción de compartir ubicación en la aplicación,
    Then los contactos seleccionados reciben la ubicación en tiempo real

    Examples:
        | Contacto         |
        | Juan Pérez       |
        | María González    |
        | Carlos Rodríguez  |

    Scenario Outline: Ubicación no se puede compartir
      Given que un usuario intenta compartir su ubicación con sus contactos cercanos,
      When la aplicación no puede acceder a la ubicación del usuario,
      Then  se muestra un mensaje de error indicando que no se puede compartir la ubicación

        Examples:
            | Error de ubicación |
            | Sin conexión GPS   |
            | Permisos denegados |
            | Aplicación cerrada  |
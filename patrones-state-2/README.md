# Ejemplo Patrón State - Tanque Terran de StarCraft

Este proyecto demuestra la implementación del patrón de diseño State utilizando el tanque Terran del juego StarCraft. El tanque puede alternar entre dos estados: Modo Móvil y Modo Asedio. Cada estado tiene comportamientos específicos para los métodos `disparar` y `moverse`.

## Estructura del Proyecto

El proyecto consta de las siguientes clases principales:

- `ModoTanque`: Clase abstracta que define los métodos `disparar` y `moverse` que serán implementados por los estados concretos.
- `ModoMovil`: Clase que representa el estado móvil del tanque. Implementa los métodos `disparar` y `moverse`.
- `ModoAsedio`: Clase que representa el estado de asedio del tanque. Implementa los métodos `disparar` y `moverse`.
- `Tanque`: Clase que actúa como el contexto. Mantiene una referencia al estado actual del tanque y delega las llamadas a los métodos `disparar` y `moverse` al estado actual.

## Diagrama de Clases

TBD

## Cómo Funciona
- Tanque: Es la clase principal que contiene una referencia al estado actual (ModoMóvil o ModoAsedio).
- ModoTanque: Clase abstracta que define los métodos disparar y moverse.
- ModoMovil: Implementa los métodos para disparar y moverse en el modo móvil.
- ModoAsedio: Implementa los métodos para disparar y moverse en el modo de asedio.

El tanque puede cambiar entre los estados utilizando el método cambiarModo y ejecutará los métodos de disparar y moverse según el estado actual.
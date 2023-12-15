# WebTestAutomation

## Descripción
Este proyecto, denominado *WebTestAutomation*, es una implementación de un conjunto de pruebas de aceptación automatizadas para la aplicación [LuegoPago](https://www.luegopago.com/). El propósito principal de estas pruebas es validar el comportamiento esperado de las funcionalidades clave de la aplicación y garantizar su calidad.

## Objetivos

- Garantizar la calidad del software mediante pruebas automatizadas, centrándose en la aplicación [LuegoPago](https://www.luegopago.com/).
- Facilitar la detección temprana de problemas y reducir el tiempo de desarrollo.
- Proporcionar una base sólida para la implementación de nuevas funcionalidades.

## Características Principales

- Utiliza Java SDK 19 para aprovechar las características más recientes del lenguaje.
- Implementa pruebas de aceptación escritas en lenguaje natural con Cucumber 6.
- Aplica el patrón de diseño Serenity Screenplay para crear pruebas más expresivas y mantenibles.
- Utiliza Gradle 8.5 como sistema de construcción para una configuración fácil y una ejecución eficiente de pruebas.

## Requisitos Previos
Antes de comenzar, asegúrate de tener instalados los siguientes requisitos:

### Java SDK
Instala Java SDK 19 desde [oracle.com](https://www.oracle.com/java/technologies/javase/jdk19-archive-downloads.html).


### Verifica la instalación de Java SDK
```bash
java -version
```

### Ejecución de los test

```bash
# Ejecución de los test
./gradlew clean test
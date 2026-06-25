# Aprendiendo Java — Universidad Fidelitas

Repositorio de ejercicios y prácticas del curso de Java en Universidad Fidelitas.

## Descripción

Este repositorio reúne ejercicios, prácticas y un proyecto final del curso "Aprendiendo Java" en Universidad Fidelitas. Está organizado por semana y contiene ejemplos de conceptos básicos de Java: sintaxis, estructuras de control, manejo de cadenas, objetos simples y lógica de programación.

## Estructura del repositorio

- `CasoSimulado1/` — Ejercicios de clases y objetos que forman un caso evaluado con módulos para:
  - `CasoEvaluado1.java`: menú principal para ejecutar los distintos ejercicios.
  - `MainEstudiante.java` / `Estudiante.java`: captura datos del estudiante, calcula promedio y determina si aprueba.
  - `MainProducto.java` / `Producto.java`: calcula subtotal y aplica descuento sobre productos.
  - `MainCuentaBancaria.java` / `CuentaBancaria.java`: simula creación de cuenta, depósito, retiro y consulta de saldo.
  - `MainVehiculo.java` / `Vehiculo.java`: registra vehículos, calcula antigüedad y simula avance de kilometraje.
- `Semana2/` — Ejercicios básicos de control de flujo y estructuras simples.
- `Semana3/` — Ejercicios de bucles, condicionales, cadenas y ejemplos prácticos.
- `Semana4/` — Ejercicios adicionales de Java y casos de práctica.
- `Semana5/` —
- `Semana6/` —
- `Semana7/` —
- `Semana8/` —
- `Semana9/` —
- `Semana10/` —
- `Semana11/` —
- `Semana12/` —
- `Semana13/` —
- `Proyecto/` — Proyecto final del curso.

> Las carpetas pueden contener uno o varios archivos `.java` con ejercicios, prácticas y ejemplos. Algunas carpetas aún pueden estar en desarrollo o vacías.

## Requisitos

- JDK instalado (Java 8 o superior recomendado).
- Opcional: IDE como IntelliJ IDEA, Eclipse o Visual Studio Code con extensión Java.

Verifica la instalación de Java en PowerShell:

```powershell
java -version
javac -version
```

## Compilar y ejecutar ejemplos

### Compilar y ejecutar un solo archivo

```powershell
javac Semana3\FOR.java
java -cp Semana3 FOR
```

Reemplaza `Semana3\FOR.java` y `FOR` por la ruta y el nombre de la clase que contiene el método `main`.

### Usar un IDE / VS Code (recomendado)

- Abre la carpeta del repositorio en tu IDE.
- Localiza y abre el archivo `.java` que contiene `public static void main`.
- Ejecuta la clase directamente desde el IDE.

### Compilar todos los archivos Java

```powershell
Get-ChildItem -Recurse -Filter '*.java' | ForEach-Object { javac $_.FullName }
```

Luego ejecuta la clase deseada con:

```powershell
java -cp . NombreDeLaClase
```

## Buenas prácticas

- Mantener cada clase en su propio archivo con el mismo nombre de la clase pública.
- Usar paquetes cuando los ejercicios crezcan en complejidad.
- Preferir un IDE para proyectos con múltiples archivos.
- Añadir comentarios y nombres descriptivos a clases, métodos y variables.

## Cómo contribuir

- Agrega ejercicios en la carpeta de la semana correspondiente.
- Conserva el orden y el nombre de los archivos para facilitar su revisión.
- Abre issues o pull requests para corregir, mejorar o ampliar los ejemplos.

## Recursos recomendados

- Documentación oficial de Java: https://docs.oracle.com/javase/8/docs/
- Material del curso proporcionado por Universidad Fidelitas.

## Licencia y contacto

Este repositorio es de uso educativo y se comparte para apoyar el aprendizaje de Java.

Si deseas añadir comentarios, mejoras o consultas, usa issues o pull requests.

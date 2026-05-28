# Aprendiendo Java — Universidad Fidelitas

Repositorio de ejercicios y prácticas del curso de Java en Universidad Fidelitas.

## Descripción

Este repositorio recoge ejercicios, ejemplos y prácticas organizadas por semana para el curso "Aprendiendo Java" en Universidad Fidelitas. Está pensado como apoyo didáctico para repasar conceptos básicos y estructurales de Java: sintaxis, estructuras de control, manejo de cadenas, y ejemplos prácticos.

## Estructura del repositorio

- `Semana3/` — Ejercicios básicos: `FOR`, `IF`, `WHILE`, `SWITCH`, `STRINGS`, etc.
- `Semana4/` —
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

Nota: las carpetas pueden contener uno o varios archivos `.java` con ejemplos y ejercicios.

## Requisitos

- JDK instalado (Java 8+ recomendado).
- Opcional: IDE como IntelliJ IDEA, Eclipse o VS Code con extensión Java.

Verifique la instalación de Java en PowerShell:

```powershell
java -version
javac -version
```

## Compilar y ejecutar ejemplos

Método 1 — Compilar y ejecutar un solo archivo Java (PowerShell):

```powershell
javac Semana3\FOR.java
java -cp Semana3 FOR
```

Nota: Reemplace `Semana3\FOR.java` y `FOR` por la ruta y el nombre de la clase que contiene el método `main`.

Método 2 — Usar un IDE / VS Code (recomendado):

- Abra la carpeta del repositorio en su IDE.
- Importe o abra los archivos `.java` y ejecute la clase que contiene `public static void main`.

Método 3 — Compilar todos los archivos (sencillo, IDE recomendado para proyectos grandes):

```powershell
Get-ChildItem -Recurse -Filter '*.java' | ForEach-Object { javac $_.FullName }
```

Luego ejecute la clase deseada con `java -cp . RutaDeLaClase`.

## Buenas prácticas

- Mantener cada clase en su propio archivo con el mismo nombre de la clase pública.
- Usar paquetes si los ejercicios crecen en complejidad.
- Preferir un IDE para compilar y ejecutar proyectos con varias dependencias.

## Cómo contribuir

- Agregar tus ejercicios en la carpeta de la semana correspondiente.
- Abrir issues o pull requests para corregir o mejorar ejemplos.

## Recursos recomendados

- Documentación oficial de Oracle: https://docs.oracle.com/javase/8/docs/
- Curso y material de la asignatura (proporcionado por Universidad Fidelitas).

## Licencia y contacto

Este repositorio es de uso educativo. Si necesitas contactar al autor o al profesor, añade tus datos en un issue o PR.

---

Archivo creado para apoyar el aprendizaje de Java en Universidad Fidelitas.

# Aprendiendo Java — Universidad Fidelitas

Repositorio de ejercicios, prácticas y ejemplos del curso de Java en Universidad Fidelitas.

## Descripción

Este repositorio reúne material didáctico organizado por semanas para practicar conceptos básicos y intermedios de Java. Incluye ejercicios de lógica, estructuras de control, clases, objetos, herencia, encapsulamiento y ejemplos de aplicación.

## Estructura del repositorio

- Semana2/: ejercicios básicos de programación con condicionales y estructuras simples.
- Semana3/: ejercicios de bucles, condicionales, cadenas y prácticas guiadas. Incluye la carpeta Practicas/ con ejercicios como SalarioEmpleado y una subcarpeta Evaluado/ con más ejercicios.
- Semana4/: ejercicios adicionales de práctica y repaso.
- Semana5/: ejemplos de modelado con tres casos temáticos:
  - Aeropuerto/
  - Fabrica/
  - Taller/
- Semana6/: ejercicios de clases y operaciones relacionadas con cálculo, calorías, energía cinética, estudiantes, instrumentos y luces.
- Semana7/: ejercicios de evaluación con clases como CuentaBancaria, Estudiante, Producto, Vehiculo y sus respectivos Main.
- Semana8/: contiene un ejemplo de estructura de modelo en la carpeta model/. No es el proyecto completo; corresponde a uno de los pasos o ejemplos del trabajo del curso.
- Semana9/, Semana10/, Semana11/, Semana12/ y Semana13/: carpetas preparadas para continuar el desarrollo del curso.
- Proyecto/: espacio destinado para el proyecto final.

## Contenido más relevante por semana

### Semana 2

- Ejercicios de práctica con Java básico.

### Semana 3

- Archivos como FOR.java, IF.java, WHILE.java, SWITCH.java y STRINGPRACTICA.java.
- Carpeta Practicas/ con ejercicios adicionales.

### Semana 4

- Ejercicios numerados del 1 al 13.

### Semana 5

- Ejemplos orientados a objetos en los subproyectos de Aeropuerto, Fabrica y Taller.

### Semana 6

- Archivos como CalculoFisico.java, Calorias.java, EnergiaCinetica.java, FichaEstudiante.java, Instrumento.java, LuzCasa.java y PromedioNotas.java.

### Semana 7

- Ejercicios con clases y métodos principales para probar lógica de negocio simple.

### Semana 8

- Se encuentra un ejemplo de modelo en la carpeta model/.
- Importante: esta carpeta no representa el proyecto final; es un ejemplo o un paso intermedio del proceso de desarrollo.

## Requisitos

- JDK instalado (Java 8 o superior recomendado).
- IDE opcional: IntelliJ IDEA, Eclipse o Visual Studio Code con extensión Java.

Verifica la instalación de Java en PowerShell:

```powershell
java -version
javac -version
```

## Compilar y ejecutar ejemplos

### Opción 1: compilar y ejecutar un archivo

```powershell
javac Semana3\FOR.java
java -cp Semana3 FOR
```

Reemplaza el archivo y la clase por los que necesites ejecutar.

### Opción 2: usar un IDE

- Abre la carpeta del repositorio en tu IDE.
- Busca el archivo .java que contiene public static void main.
- Ejecuta la clase desde el IDE.

### Opción 3: compilar varios archivos

```powershell
Get-ChildItem -Recurse -Filter '*.java' | ForEach-Object { javac $_.FullName }
```

## Buenas prácticas

- Mantener cada clase en su propio archivo con el mismo nombre de la clase pública.
- Usar paquetes cuando los ejercicios crezcan en complejidad.
- Organizar el código con nombres claros y comentarios cuando sea necesario.
- Preferir un IDE para trabajar con varios archivos y clases.

## Notas importantes

- Semana8 contiene un ejemplo de estructura de modelo, no el proyecto completo.
- Algunas carpetas como Semana9, Semana10, Semana11, Semana12, Semana13 y Proyecto aún pueden estar vacías o en desarrollo.

## Recursos recomendados

- Documentación oficial de Java: https://docs.oracle.com/javase/8/docs/
- Material del curso proporcionado por Universidad Fidelitas.

## Licencia y contacto

Este repositorio es de uso educativo y se comparte para apoyar el aprendizaje de Java.

Si deseas aportar mejoras, ejercicios o correcciones, puedes hacerlo mediante pull requests o issues.

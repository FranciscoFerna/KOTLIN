# Desafío del Concurso de Postres Mágicos

En el reino de **Dulcelandia**, se celebra un concurso anual de postres mágicos donde los mejores reposteros de todo el reino compiten por el título de **Gran Maestro Repostero**. Este año, el concurso ha introducido una serie de desafíos para evaluar no solo la creatividad en la cocina, sino también la lógica y habilidades matemáticas de los concursantes. Como aprendiz de mago repostero, se te ha encomendado la tarea de escribir un programa que evalúe el desempeño de los participantes. ¡Acepta el desafío y demuestra tu talento!

## Reglas del Concurso

1. **Evaluación de Postres**
   Cada concursante presenta un número de postres, y tú deberás evaluar su dulzura en una escala del 1 al 10. Un postre se considera:
  - **Delicioso** si la dulzura es mayor a 7.
  - **Agradable** si la dulzura está entre 4 y 7.
  - **Mejorable** si la dulzura es menor a 4.

2. **Descuento de Puntos**
   Cada postre presentado tiene un costo de 3 puntos. Si un postre es **Delicioso**, el concursante obtiene un bonus de 5 puntos. Si es **Agradable**, recibe un bonus de 3 puntos. No se otorgan puntos por postres **Mejorables**.

3. **Ronda de Repetición**
   Después de evaluar todos los postres de un concursante, se les pregunta si quieren volver a presentar otro postre. Si responden afirmativamente, deben ingresar el número de postres a evaluar nuevamente.

4. **Informe Final**
   Al finalizar todas las evaluaciones, debes mostrar un resumen con el puntaje total del concursante y el número de postres de cada categoría.

## Entrada

- La entrada comienza con un número entero `c`, que indica la cantidad de concursantes.
- Para cada concursante, sigue este formato:
  - Una línea que contiene un entero `p`, el número de postres que presentan.
  - Para cada postre, se ingresa un número entero que representa la dulzura del postre.
  - Pregunta si el concursante desea presentar más postres (respuestas: "SI" o "NO").

## Salida

- Para cada concursante, imprime el siguiente resumen:
  Concursante X: Puntuación Total: xxx Deliciosos: yyy Agradables: zzz Mejorables: www

## Ejemplo de Entrada

2 3 8 5 2 NO 4 9 7 3 SI 2 6 8 NO

## Ejemplo de Salida

Concursante 1: Puntuación Total: 3 Deliciosos: 1 Agradables: 1 Mejorables: 1

Concursante 2: Puntuación Total: 8 Deliciosos: 2 Agradables: 1 Mejorables: 1

## Objetivo
Crea un programa que simule el concurso de postres mágicos, utilizando `if`, `else`, `when`, `do-while`, y `for`. ¡Diviértete y demuestra tus habilidades mágicas en la programación!
# Enunciado

Eres el responsable de la organización de un evento especial y debes implementar un sistema para gestionar el acceso de los participantes, calcular sus puntuaciones y validar el tiempo de acceso.

## 1. Validación de la Edad:
Pide a los participantes que introduzcan su año de nacimiento y determina si pueden participar. Las personas nacidas en una década que termine en "90" pueden participar automáticamente. Si no es el caso, determina si tienen 20 años o más para dejarlos participar.

## 2. Sistema de Puntuación:
Cada participante debe introducir su puntuación en una prueba (un número entero del 0 al 10), y el sistema debe mostrar el nivel alcanzado según su puntuación:

- 0-4: "Suspenso"
- 5-6: "Aprobado"
- 7-8: "Notable"
- 9-10: "Excelente"

## 3. Validación del Tiempo de Acceso:
Cada participante debe introducir la hora en que accede al sistema (horas, minutos y segundos). El programa debe verificar si el tiempo es correcto según el formato de hora (horas de 0 a 23, minutos y segundos de 0 a 59).

## 4. Menú de Acciones:
Una vez validado, el sistema debe permitir que el participante elija una acción usando las siguientes opciones. Se debe utilizar un menú con un `switch` para gestionar las acciones:

- 'Q': Activar una habilidad especial 1.
- 'W': Activar una habilidad especial 2.
- 'E': Activar una habilidad especial 3.
- 'R': Activar la "ultimate".
- 'B': Volver a la pantalla inicial.
- 'D' o 'F': Mostrar un mensaje especial para usuarios novatos.
- Cualquier otra tecla: Mostrar un error y pedir una entrada válida.

## Entrada
- Un número entero que representa el año de nacimiento del participante.
- Un número entero del 0 al 10 que representa la puntuación del participante.
- Tres números enteros que representan la hora de acceso (horas, minutos y segundos).
- Una letra que representa la acción seleccionada del menú.

## Salida
- Para la validación del año, se dirá "SI" si el año termina en 90-99 o si el participante tiene 20 años o más, y "NO" si no puede participar.
- Para la puntuación, se mostrará el nivel correspondiente (Suspenso, Aprobado, Notable, Excelente).
- Para la validación del tiempo, se mostrará "SI" si la hora es válida y "NO" si no lo es.
- Para la acción seleccionada, se mostrará el resultado correspondiente según la tabla del menú.

## Ejemplo

### Entrada:
1991 8 14 30 45 R


### Salida:
SI Notable SI Ultimate


### Entrada:
2005 4 25 61 12 B


### Salida:
NO Suspenso NO Volver a la pantalla inicial



## Conceptos clave trabajados en este ejercicio:
- Condicionales simples y múltiples (`if`, `else if`, `else`, `switch`).
- Validación de entrada de horas y valores de puntuación.
- Procesamiento de entrada de caracteres.
- Control de flujo con un menú que gestiona diferentes acciones.
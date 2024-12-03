## **Tipos de Datos Básicos**

### 1. **Conversión de Temperaturas**
Escribe un programa que convierta una temperatura de grados Celsius a Fahrenheit. Pide al usuario el valor en Celsius y muestra el resultado en Fahrenheit.

**Fórmula**:  
\[
F = (C × 9/5) +32
\]

---

### 2. **Cálculo de Salario Semanal**
Crea un programa que calcule el salario semanal de un trabajador. Pide al usuario las horas trabajadas y el pago por hora. Si trabaja más de 40 horas, las horas extra se pagan al 1.5x.

---

### 3. **Operaciones con Números**
Pide al usuario dos números enteros y muestra:
- Su suma, resta, multiplicación y división entera.
- El mayor y el menor número.
- Si el primer número es divisible por el segundo.

---

## **Arrays**

### 1. **Promedio de Notas**
Pide al usuario 5 calificaciones, guárdalas en un array y calcula el promedio. Muestra si el promedio es aprobado (mayor o igual a 5) o suspenso.

---

### 2. **Mayor y Menor Elemento**
Crea un programa que encuentre el número mayor y el menor en un array de números enteros. Usa un array predefinido como `val numeros = arrayOf(3, 5, 1, 9, 2)`.

---

### 3. **Invertir un Array**
Pide al usuario 5 números, guárdalos en un array e imprime el array en orden inverso.

---

## **Matrices**

### 1. **Matriz Identidad**
Crea una matriz de 3x3 y rellénala como matriz identidad (1s en la diagonal principal y 0s en el resto). Muestra el resultado.

---

### 2. **Suma de Filas**
Pide al usuario los elementos de una matriz 2x3 (dos filas, tres columnas). Luego, suma los elementos de cada fila y muestra el resultado.

---

### 3. **Transpuesta de una Matriz**
Crea una matriz de 2x3 y genera su transpuesta (intercambiar filas por columnas). Muestra ambas matrices.

---

## **Strings**

### 1. **Palíndromo**
Escribe un programa que compruebe si una palabra introducida por el usuario es un palíndromo (se lee igual al derecho y al revés). Ejemplo: "anilina".

---

### 2. **Contar Vocales**
Pide una frase al usuario y muestra cuántas vocales contiene. Considera `a`, `e`, `i`, `o`, `u` (pueden ser mayúsculas o minúsculas).

---

### 3. **Buscar Subcadena**
Pide al usuario una frase y una palabra. Muestra si la palabra está contenida en la frase y en qué posición empieza.

---

## **Colecciones (Lists)**

### 1. **Lista de Compras**
Crea una lista mutable donde el usuario pueda:
1. Añadir productos.
2. Ver la lista completa.
3. Eliminar un producto por su nombre.

---

### 2. **Frecuencia de Elementos**
Crea una lista de enteros y cuenta cuántas veces aparece cada número. Por ejemplo:  
`val numeros = listOf(1, 2, 2, 3, 1, 4, 2)` debería mostrar:  
`1: 2 veces, 2: 3 veces, 3: 1 vez, 4: 1 vez`.

---

### 3. **Ordenar una Lista**
Pide al usuario 5 números, guárdalos en una lista y muestra la lista ordenada de forma ascendente y descendente.

---

## **Programación Orientada a Objetos (POO)**

### 1. **Clase Rectángulo**
Crea una clase `Rectangulo` con atributos `base` y `altura`. Añade métodos para:
- Calcular el área.
- Calcular el perímetro.

Prueba la clase creando varios rectángulos.

---

### 2. **Gestión de Empleados**
Crea una clase `Empleado` con atributos `nombre` y `sueldo`. Añade un método para mostrar si el sueldo es mayor al promedio (supón un sueldo promedio de 2000 €).

---

### 3. **Herencia: Vehículos**
Crea una clase base `Vehiculo` con atributos `marca` y `modelo`. Luego, crea clases derivadas como `Coche` y `Moto`, y añade métodos específicos para cada tipo.

---

## **Funciones Lambda y de Orden Superior**

### 1. **Filtrar Números Pares**
Usa una función lambda para filtrar los números pares de una lista de enteros. Ejemplo:  
Entrada: `listOf(1, 2, 3, 4)`  
Salida: `[2, 4]`.

---

### 2. **Suma con Reduce**
Dada una lista de enteros, usa `reduce` para calcular su suma. Ejemplo:  
Entrada: `listOf(1, 2, 3)`  
Salida: `6`.

---

### 3. **Operaciones con Map**
Dada una lista de números, usa `map` para obtener una nueva lista con sus cuadrados. Ejemplo:  
Entrada: `listOf(2, 3, 4)`  
Salida: `[4, 9, 16]`.

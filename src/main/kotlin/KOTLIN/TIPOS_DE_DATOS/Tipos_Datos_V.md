# Tipos de Datos V en Kotlin - Matrices

## Introducción

En Kotlin, una **matriz** es una estructura de datos bidimensional que permite almacenar valores organizados en filas y columnas. Se puede pensar en una matriz como un array de arrays.

### Características principales de las matrices:

- Los datos se almacenan en ubicaciones de memoria contiguas.
- Acceso a los elementos mediante índices (`matriz[fila][columna]`).
- Son mutables (se pueden modificar los valores almacenados).
- Su tamaño es fijo (no se puede cambiar una vez creada).

---

## **Crear Matrices**

Podemos crear matrices en Kotlin especificando su tamaño (número de filas y columnas) y un valor inicial para sus elementos.

### Creación con tamaño y valor:
Para crear matrices de números o booleanos, utilizamos `Array` combinándolo con tipos específicos como `IntArray`, `FloatArray`, etc.

#### Ejemplo:
```kotlin
val matrizEntera: Array<Array<Int>> = Array(3) { Array(4) { 0 } }
val matrizBooleana: Array<Array<Boolean>> = Array(2) { Array(3) { false } }
```

### Matrices de Strings:
Para matrices de texto, podemos inicializarlas con valores específicos o usando un valor predeterminado.

#### Ejemplo:
```kotlin
val matrizTexto: Array<Array<String>> = Array(2) { Array(3) { "" } }
val nombres: Array<Array<String>> = Array(2) { arrayOf("Juan", "Ana", "Luis") }
```

---

## **Acceder y Modificar Matrices**

### Acceder a elementos:
Para obtener un valor de la matriz, indicamos el índice de la fila y el de la columna entre corchetes (`[fila][columna]`).

#### Ejemplo:
```kotlin
val nombres: Array<Array<String>> = Array(3) { arrayOf("Juan", "Ana", "Luis", "Eva") }
println(nombres[0][2])  // Imprime "Luis"
```

### Modificar elementos:
Podemos cambiar el valor de un elemento específico utilizando sus índices o el método `set()`.

#### Ejemplo:
```kotlin
val nombres: Array<Array<String>> = Array(3) { arrayOf("Juan", "Ana", "Luis", "Eva") }
nombres[1][1] = "Pedro"  // Cambia "Ana" por "Pedro"
println(nombres[1][1])   // Imprime "Pedro"
```

Con `set()`:
```kotlin
nombres[2].set(1, "Marta")
println(nombres[2][1])  // Imprime "Marta"
```

---

## **Propiedades de las Matrices**

### Tamaño de la matriz:
Podemos usar `size` para conocer el número de filas, y `size` en una fila específica para obtener el número de columnas.

#### Ejemplo:
```kotlin
val nombres: Array<Array<String>> = Array(3) { arrayOf("Juan", "Ana", "Luis", "Eva") }
println(nombres.size)       // Imprime "3" (número de filas)
println(nombres[0].size)    // Imprime "4" (número de columnas en la primera fila)
```

---

## **Iterar Matrices**

### Iterar por índice:
Podemos recorrer todos los elementos de una matriz usando bucles anidados con índices.

#### Ejemplo:
```kotlin
val coches: Array<Array<String>> = Array(2) { arrayOf("Volvo", "BMW", "Ford") }
for (f in 0 until coches.size) {
    for (c in 0 until coches[f].size) {
        println(coches[f][c])
    }
}
```

### Iterar por valor:
Para simplificar el recorrido, podemos usar un bucle `for` que itere directamente sobre las filas y los elementos.

#### Ejemplo:
```kotlin
val coches: Array<Array<String>> = Array(2) { arrayOf("Volvo", "BMW", "Ford") }
for (fila in coches) {
    for (coche in fila) {
        print("$coche ")
    }
}
```

---

## **Mostrar Matrices**

Para imprimir matrices completas de manera legible, podemos usar funciones como `contentDeepToString()`.

#### Ejemplo:
```kotlin
val matriz: Array<Array<Int>> = Array(2) { Array(3) { 0 } }
println(matriz.contentDeepToString())  // Imprime "[[0, 0, 0], [0, 0, 0]]"
```

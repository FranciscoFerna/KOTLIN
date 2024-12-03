# Tipos de Datos IV en Kotlin - Arrays

## Introducción

Un **array** en Kotlin es una estructura de datos que permite almacenar múltiples valores en una sola variable. Los arrays son ideales para organizar datos relacionados y acceder a ellos fácilmente mediante índices.

### Características principales de los arrays:

- Los elementos se almacenan en ubicaciones de memoria contiguas.
- Acceso a elementos mediante índices (`array[índice]`).
- Son mutables (los valores pueden cambiar).
- Su tamaño es fijo (no se puede modificar una vez creado).

---

## **Crear Arrays**

Kotlin ofrece varias maneras de crear arrays dependiendo de nuestras necesidades.

### Creación con valores:
Podemos inicializar un array directamente con valores usando la función `arrayOf()`.

#### Ejemplo:
```kotlin
val numeros: Array<Int> = arrayOf(1, 2, 4, -5, 8, 0)
val coches: Array<String> = arrayOf("Volvo", "BMW", "Ford", "Mazda")
```

### Creación específica por tipo:
Kotlin dispone de funciones optimizadas para cada tipo de dato, como `intArrayOf()`, `floatArrayOf()`, etc.

#### Ejemplo:
```kotlin
val enteros: IntArray = intArrayOf(0, 1, 2, 3, 4)
val booleanos: BooleanArray = booleanArrayOf(true, false, true)
val caracteres: CharArray = charArrayOf('a', 'b', 'c')
```

### Creación con tamaño:
Podemos crear un array especificando su tamaño. Cada elemento tendrá un valor por defecto según el tipo.

#### Ejemplo:
```kotlin
val numeros: IntArray = IntArray(5)  // Todos los elementos inicializados a 0
val palabras: Array<String?> = arrayOfNulls(3)  // [null, null, null]
```

### Creación con tamaño y valores:
Podemos usar un constructor para asignar valores a cada elemento del array.

#### Ejemplo:
```kotlin
val numeros: FloatArray = FloatArray(5) { Random.nextFloat() }
val palabras: Array<String> = Array(3) { "" }  // Array de 3 cadenas vacías
```

---

## **Acceder y Modificar Arrays**

### Acceder a elementos:
Para acceder a un elemento, usamos su índice dentro de corchetes (`[]`). **Nota**: Los índices comienzan en 0.

#### Ejemplo:
```kotlin
val coches: Array<String> = arrayOf("Volvo", "BMW", "Ford", "Mazda")
println(coches[0])  // Imprime "Volvo"
```

### Modificar elementos:
Podemos cambiar el valor de un elemento utilizando su índice o el método `set()`.

#### Ejemplo:
```kotlin
val coches: Array<String> = arrayOf("Volvo", "BMW", "Ford")
coches[0] = "Audi"  // Cambia "Volvo" por "Audi"
println(coches[0])  // Imprime "Audi"
```

---

## **Propiedades y Operaciones con Arrays**

### Tamaño del array:
La propiedad `size` devuelve la cantidad de elementos en un array.

#### Ejemplo:
```kotlin
val numeros: IntArray = intArrayOf(1, 2, 3)
println(numeros.size)  // Imprime "3"
```

### Verificar si contiene un elemento:
Podemos usar la palabra clave `in` para comprobar si un elemento está presente en el array.

#### Ejemplo:
```kotlin
val coches: Array<String> = arrayOf("Volvo", "BMW", "Ford")
if ("Volvo" in coches) println("Existe!")  // Imprime "Existe!"
```

---

## **Iterar Arrays**

### Iterar por índice:
Podemos recorrer un array utilizando un bucle `for` con índices.

#### Ejemplo:
```kotlin
val numeros: IntArray = intArrayOf(1, 2, 3, 4, 5)
for (i in 0 until numeros.size) {
    println(numeros[i])
}
```

### Iterar por valor:
También podemos iterar directamente sobre los valores del array.

#### Ejemplo:
```kotlin
val numeros: IntArray = intArrayOf(1, 2, 3, 4, 5)
for (numero in numeros) {
    println(numero)
}
```

---

## **Mostrar Arrays**

Kotlin incluye métodos útiles para mostrar arrays en formato de cadena:

- `contentToString()`: Muestra los elementos en un formato legible.
- `joinToString(separator)`: Combina los elementos en una cadena separada por el carácter especificado.

#### Ejemplo:
```kotlin
val numeros: IntArray = intArrayOf(1, 2, 3, 4, 5)
println(numeros.contentToString())  // Imprime "[1, 2, 3, 4, 5]"
println(numeros.joinToString(";"))  // Imprime "1;2;3;4;5"
```

---

## **Arrays en la Función `main`**

Cuando usamos la función `main` con el parámetro `args`, este se interpreta como un array de `String` que contiene los argumentos pasados al programa.

#### Ejemplo:
```kotlin
fun main(args: Array<String>) {
    for (arg in args) {
        println(arg)
    }
}
```

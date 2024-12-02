# Introducción a los Tipos de Datos en Kotlin

## Bienvenidos a Kotlin

Kotlin es un lenguaje de programación moderno y versátil, utilizado tanto para aplicaciones en Android como en otros sistemas multiplataforma. Es interoperable con Java, lo que permite trabajar con bibliotecas de Java y ejecutar el código en la Máquina Virtual de Java (JVM). Además, se puede compilar a JavaScript o incluso a código nativo para plataformas como iOS o Android.

### Estructura básica de un programa Kotlin

En Kotlin, el punto de entrada de un programa es la función `main()`, que contiene las instrucciones que se ejecutarán. En este bloque de código también podemos recibir argumentos, aunque en este momento no los usaremos.

#### Ejemplo de programa básico:
```kotlin
fun main() {
    println("¡Hola, Kotlin!") // Muestra un mensaje en consola
}
```

### Tipos de Datos en Kotlin

Kotlin ofrece varios tipos de datos que podemos utilizar para almacenar y procesar información:

- **Int**: Números enteros.
- **Double** y **Float**: Números decimales.
- **Boolean**: Valores de verdadero o falso.
- **Char**: Un solo carácter.

#### Ejemplo de declaración de variables:
```kotlin
val edad: Int = 25 // Variable de solo lectura (val)
var nombre: String = "Juan" // Variable de lectura y escritura (var)
```

## Tipos de Datos Primitivos

### `Int` - Números enteros

El tipo `Int` se utiliza para almacenar números enteros, positivos o negativos, sin decimales. Ocupa 32 bits de memoria y tiene un rango de valores de `-2,147,483,648` a `2,147,483,647`.

#### Ejemplo de uso:
```kotlin
fun main() {
    println(6) // Imprime el número 6
}
```

### Operaciones con `Int`

Kotlin permite realizar operaciones matemáticas básicas con enteros, como suma, resta, multiplicación, división y módulo (residuo de la división).

#### Ejemplo:
```kotlin
fun main() {
    val suma = 4 + 5
    val resta = 6 - 3
    val multiplicacion = 4 * 6
    val division = 11 / 2
    val modulo = 11 % 2
    println("Suma: $suma, Resta: $resta, Multiplicación: $multiplicacion, División: $division, Módulo: $modulo")
}
```

### `Long` - Números enteros grandes

Si necesitamos trabajar con números enteros más grandes que el rango de `Int`, podemos usar el tipo `Long`, que ocupa 64 bits.

#### Ejemplo:
```kotlin
fun main() {
    val numeroGrande: Long = 999999999999
    println(numeroGrande)
}
```

## Variables en Kotlin

En Kotlin, las variables son contenedores que almacenan datos. Para declarar una variable, debemos usar la palabra clave `var` o `val`, dependiendo de si queremos que la variable sea mutable o inmutable.

- **`var`**: Declara una variable que puede cambiar su valor.
- **`val`**: Declara una variable cuyo valor no puede cambiar (solo lectura).

### Inferencia de Tipo

Kotlin tiene una característica muy útil llamada "inferencia de tipo". Esto significa que, si inicializas una variable con un valor, Kotlin puede determinar automáticamente el tipo de la variable sin que lo especifiques.

#### Ejemplo de inferencia de tipo:
```kotlin
fun main() {
    var numero = 10 // Kotlin infiere que el tipo es Int
    println(numero)
}
```

### Variables de Solo Lectura

Las variables declaradas con `val` son inmutables. Una vez que les asignamos un valor, este no puede cambiar durante la ejecución del programa.

#### Ejemplo de `val`:
```kotlin
fun main() {
    val constante = 100
    // constante = 200 // Esto generaría un error, ya que `constante` es inmutable
}
```

### Identificadores de Variables

Es importante que los identificadores de las variables sean significativos y descriptivos. Además, se recomienda usar el estilo `lowerCamelCase`, donde la primera palabra comienza en minúscula y las siguientes en mayúscula.

#### Ejemplo de identificadores:
```kotlin
val edadDeUsuario = 25
val numeroDeEmpleado = 12345
```

## Primeros Programas

Aquí te dejo algunos ejemplos de programas que puedes hacer para familiarizarte con las variables y tipos de datos en Kotlin:

1. Mostrar tu nombre en pantalla.
2. Definir una variable con tu edad y otra con tu nombre, y usarlas para mostrar un mensaje que diga "Mi nombre es [nombre] y tengo [edad] años".
3. Jugar con las diferentes salidas que puedes obtener utilizando `print()` y `println()` para imprimir datos de diferentes maneras.

### Ejemplo de un programa sencillo:
```kotlin
fun main() {
    val nombre = "Juan"
    val edad = 25
    println("Mi nombre es $nombre y tengo $edad años")
}
```
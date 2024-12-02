# Tipos de Datos III en Kotlin - Strings

## Introducción

En Kotlin, el tipo de dato `String` se usa para representar cadenas de caracteres. Las cadenas de texto en Kotlin son muy flexibles y ofrecen muchas funciones útiles para manipular texto. A lo largo de esta sección, veremos cómo trabajar con cadenas, cómo usar caracteres especiales, realizar operaciones con ellas y cómo leer cadenas de texto desde el usuario.

---

## **Definición de un String**

Un `String` en Kotlin es una secuencia de caracteres que se escribe entre comillas dobles (`"`). Este tipo de dato es muy común para trabajar con texto.

### Ejemplo:
```kotlin
fun main() {
    println("Hola món!")  // Imprime "Hola món!"
}
```

---

## **Carácteres de Escape**

A veces necesitamos representar caracteres especiales dentro de un `String`, como saltos de línea o comillas. Kotlin nos permite usar secuencias de escape para hacerlo:

- `\t` – Tabulador
- `\b` – Retroceso
- `\n` – Nueva línea
- `\r` – Retorno de carro
- `\'` – Comilla simple
- `\"` – Comilla doble
- `\\` – Barra invertida
- `\$` – Símbolo de dólar

### Ejemplo:
```kotlin
fun main() {
    println("Hola!")  // Imprime "Hola!"
    println("Una línia\nDues Línies\nTres Línies")  // Imprime el texto en múltiples líneas
    println("Una contrabarra: \\")  // Imprime una barra invertida
}
```

---

## **String Multilínea**

Kotlin también nos permite definir un `String` de múltiples líneas sin necesidad de utilizar caracteres de escape. Esto se hace usando tres comillas dobles (`"""`).

### Ejemplo:
```kotlin
fun main() {
    val multipleLines = """Les tres cometes
ens deixen escriure
múltiples línies"""
    println(multipleLines)  // Imprime el texto en varias líneas
}
```

---

## **Operaciones con Strings**

Las cadenas de texto en Kotlin se pueden manipular mediante diversas operaciones:

- **Concatenación**: Usamos el operador `+` para juntar cadenas.
- **Comparación de igualdad**: Usamos `==` para verificar si dos cadenas son iguales.
- **String Templates**: Podemos insertar variables directamente dentro de un `String` usando `$` y realizar operaciones dentro de las plantillas con `${}`.

### Ejemplo de concatenación:
```kotlin
fun main() {
    println("Hola" + " a tothom")  // Imprime "Hola a tothom"
}
```

### Ejemplo de String Template:
```kotlin
fun main() {
    val number1 = 1
    val number2 = 2
    println("This is number1: $number1")  // Imprime "This is number1: 1"
    println("This is the result of adding both: ${number1 + number2}")  // Imprime "This is the result of adding both: 3"
}
```

---

## **Lectura de Strings desde el Usuario**

Para leer cadenas de texto desde el usuario, podemos usar la función `readln()` o la clase `Scanner`.

### Ejemplo con `Scanner`:
```kotlin
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    println("Introdueix un caràcter:")
    val userInputValue = scanner.next()  // Lee una palabra
    println("Aquest és el de l’string introduït:")
    println(userInputValue)
}
```

---

## **Propiedades y Métodos de String**

Kotlin proporciona varias propiedades y métodos útiles para trabajar con cadenas de texto:

- `s.length`: Devuelve la longitud de la cadena.
- `s.substring(start: Int)`: Devuelve la subcadena desde la posición `start` hasta el final.
- `s.substring(start: Int, end: Int)`: Devuelve la subcadena entre las posiciones `start` y `end`.
- `s.lowercase()`: Convierte la cadena a minúsculas.
- `s.uppercase()`: Convierte la cadena a mayúsculas.
- `s.get(i: Int)`: Obtiene el carácter en la posición `i` (base 0).
- `s.indexOf(sub: String)`: Devuelve la posición de la primera coincidencia de `sub` en la cadena. Si no se encuentra, devuelve `-1`.

### Ejemplo:
```kotlin
fun main() {
    val text = "Hola món!"
    println(text.length)  // Imprime la longitud de la cadena
    println(text.substring(0, 4))  // Imprime "Hola"
    println(text.lowercase())  // Imprime "hola món!"
    println(text.uppercase())  // Imprime "HOLA MÓN!"
}
```

---

## **Métodos Adicionales para Manipular Strings**

Kotlin también ofrece otros métodos útiles para trabajar con cadenas:

- `s.plus(s2)`: Concatenar dos cadenas, similar a `s + s2`.
- `s.compareTo(s2)`: Compara dos cadenas lexicográficamente.
- `s.split(c: Char)`: Divide la cadena en una lista de subcadenas utilizando un delimitador.
- `s.split(s2: String)`: Divide la cadena utilizando otro `String` como delimitador.
- `s.split(r: Regex)`: Divide la cadena utilizando una expresión regular.

### Ejemplo de `split`:
```kotlin
fun main() {
    val text = "Kotlin,Java,Python"
    val languages = text.split(",")
    println(languages)  // Imprime [Kotlin, Java, Python]
}
```
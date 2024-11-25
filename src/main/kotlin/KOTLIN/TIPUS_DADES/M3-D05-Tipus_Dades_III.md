# Kotlin Tipus de Dades III


1. **Uso de caracteres de escape**: Explicación de cómo utilizar caracteres especiales para formatear el texto, como nuevas líneas, tabuladores, y más.
2. **Cadenas multilínea con triples comillas**: Demostración de cómo crear strings con múltiples líneas sin necesidad de caracteres de escape.
3. **Concatenación de strings**: Cómo unir cadenas de texto en Kotlin.
4. **Comparación de strings**: Uso de la igualdad y comparación de cadenas.
5. **Uso de String Templates**: Inserción de variables y resultados de expresiones dentro de cadenas de texto.
6. **Métodos y propiedades de las cadenas**: Métodos útiles como `substring()`, `length`, y `split()` para manipular las cadenas de texto.

## Funcionalidades

### 1. **Caracteres de escape**
Los caracteres de escape permiten modificar el formato de las cadenas. El proyecto muestra cómo utilizar los siguientes caracteres:

- `\n`: Nueva línea
- `\t`: Tabulador
- `\\`: Contrabarra
- `\"`: Comillas dobles
- `\'`: Comillas simples

Ejemplo:

```kotlin
println("Hola!\n\tAquest és un exemple d'ús de caràcters d'escapada:")
```

### 2. **Cadenas multilínea con triples comillas**
En Kotlin, las triples comillas `"""` permiten definir cadenas de múltiples líneas de forma sencilla.

```kotlin
val multipleLines = """
    Benvingut al programa!
    Aquí pots veure diferents exemples d'ús de les cadenes
    en Kotlin. Espero que t'agradi!
""".trimIndent()
println(multipleLines)
```

### 3. **Concatenación de Strings**
Kotlin permite concatenar cadenas utilizando el operador `+`. En el siguiente ejemplo, se concatenan dos cadenas:

```kotlin
val string1 = "Hola"
val string2 = "World!"
println(string1 + string2)
println(string1 + " " + string2)
```

### 4. **Comparación de Strings**
Las cadenas se pueden comparar usando `==` o el método `compareTo()`, que devuelve un valor entero dependiendo de la comparación.

```kotlin
val str1 = "hola"
val str2 = "mon"
val compareResult = str1.compareTo(str2)
when {
    compareResult < 0 -> println("$str1 es menor que $str2")
    compareResult > 0 -> println("$str1 es mayor que $str2")
    else -> println("$str1 es igual a $str2")
}
```

### 5. **Uso de String Templates**
Puedes incluir variables y resultados de expresiones directamente dentro de cadenas utilizando los templates con `$`.

```kotlin
val name = "Fran"
val age = 18
println("Hola me llmo $name y tengo $age")
```

### 6. **Métodos y propiedades de las cadenas**
Se exploran varios métodos útiles de la clase `String`, como:

- `length`: Devuelve la longitud de la cadena.
- `substring(start, end)`: Extrae una subcadena de la cadena.
- `lowercase()`: Convierte la cadena a minúsculas.
- `uppercase()`: Convierte la cadena a mayúsculas.
- `split()`: Divide la cadena en una lista de subcadenas.

Ejemplo:

```kotlin
val s = "Hola Mundo!"
println("Longitud de la cadena: ${s.length}")
println("Subcadena (index 0 a 3): ${s.substring(0, 4)}")
println("Minuscules: ${s.lowercase()}")
```

### 7. **Entrada del Usuario**
Se solicita la entrada del usuario usando `Scanner` y se maneja la entrada de texto para realizar operaciones con ella.

```kotlin
val SCANNER: Scanner = Scanner(System.`in`)
println("Introduzca su nombre: ")
val surname = SCANNER.nextLine()
println("Hello $surname")
```

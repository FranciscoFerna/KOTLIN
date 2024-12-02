# Tipos de Datos II en Kotlin

## Introducción

En esta sección, profundizamos en los tipos de datos adicionales en Kotlin, como los booleanos, caracteres, números de precisión simple y doble, así como las operaciones que podemos realizar con ellos. También exploramos cómo trabajar con grandes números y realizar conversiones entre tipos de datos.

---

## **Boolean - Tipo Lógico**

El tipo `Boolean` se utiliza para representar valores lógicos, que pueden ser `true` (verdadero) o `false` (falso). Estos valores se utilizan en estructuras de control como condicionales y bucles.

### Ejemplo:
```kotlin
fun main() {
    println(true)  // Imprime "true"
    println(1 == 1)  // Compara si 1 es igual a 1, y imprime "true"
}
```

### Operaciones booleanas

Podemos realizar operaciones lógicas como AND (`&&`), OR (`||`), y NOT (`!`), que siguen las reglas de la lógica booleana.

#### Ejemplo de operación `AND`:
```kotlin
fun main() {
    val testAnd = true && false
    println(testAnd)  // Imprime "false"
}
```

### Comparaciones Booleanas

Las comparaciones entre valores devuelven un resultado booleano. Por ejemplo:

- Igual que ( `==` )
- Diferente que ( `!=` )
- Mayor que ( `>` )
- Menor que ( `<` )
- Mayor o igual que ( `>=` )
- Menor o igual que ( `<=` )

#### Ejemplo:
```kotlin
fun main() {
    println(3 == 2)  // false
    println(3 != 2)  // true
    println(3 > 2)   // true
}
```

---

## **Char - Carácter**

El tipo `Char` se usa para almacenar un único carácter, como una letra, número o símbolo. Los caracteres se escriben entre comillas simples (`'`).

### Ejemplo:
```kotlin
fun main() {
    println('C')  // Imprime "C"
}
```

### Operaciones con `Char`

Podemos comparar caracteres y realizar operaciones como:

- Igual (`==`)
- Diferente (`!=`)
- Menor que, mayor que, etc., según su valor Unicode.

#### Ejemplo de comparación de caracteres:
```kotlin
fun main() {
    val isEqual = 'a' == 'c'
    println(isEqual)  // Imprime "false"
}
```

---

## **Float y Double - Números Reales**

En Kotlin, usamos los tipos `Float` y `Double` para manejar números con decimales:

- `Float`: Precisión simple, hasta 6-7 decimales.
- `Double`: Precisión doble, hasta 15 decimales.

### Ejemplo de `Float`:
```kotlin
fun main() {
    val floatNumber: Float = 1.2f
    println(floatNumber)  // Imprime "1.2"
}
```

### Ejemplo de `Double`:
```kotlin
fun main() {
    val doubleNumber: Double = 4.4
    val anotherDouble: Double = 5.6
    println(doubleNumber + anotherDouble)  // Imprime "10.0"
}
```

### Operaciones con `Double`

Podemos realizar las mismas operaciones matemáticas que con enteros: suma, resta, multiplicación, y división.

---

## **Números Grandes y `Long`**

Para trabajar con números enteros grandes, usamos el tipo `Long`. Los valores de tipo `Long` pueden ser más grandes que los valores `Int`.

- `Int` va de `-2,147,483,648` a `2,147,483,647`.
- `Long` va de `-9,223,372,036,854,775,808` a `9,223,372,036,854,775,807`.

### Ejemplo de número grande:
```kotlin
fun main() {
    println(123_456_789)  // Imprime "123456789"
}
```

---

## **Operaciones en Variables**

En Kotlin, también podemos realizar operaciones directamente sobre las variables, como incremento (`++`), decremento (`--`), y operaciones aritméticas de asignación.

### Ejemplos:
```kotlin
fun main() {
    var num = 5
    num++  // Incrementa en 1
    println(num)  // Imprime "6"

    num--  // Decrementa en 1
    println(num)  // Imprime "5"
}
```

### Operaciones de asignación:
- `+=` (A += B es lo mismo que A = A + B)
- `-=` (A -= B es lo mismo que A = A - B)
- `*=` (A *= B es lo mismo que A = A * B)
- `/=` (A /= B es lo mismo que A = A / B)

---

## **Conversiones de Tipos**

Kotlin permite convertir entre diferentes tipos de datos, como convertir de `Int` a `Double`, o de `Char` a `Int`.

### Ejemplos de conversiones:
```kotlin
fun main() {
    val intFromDouble: Int = 34.6.toInt()  // Convierte Double a Int
    val doubleFromInt: Double = 342.toDouble()  // Convierte Int a Double
    val intFromChar: Int = 'a'.toInt()  // Convierte Char a Int (valor Unicode)
    val longFromInt: Long = 34.toLong()  // Convierte Int a Long
    println(intFromDouble)  // Imprime "34"
}
```

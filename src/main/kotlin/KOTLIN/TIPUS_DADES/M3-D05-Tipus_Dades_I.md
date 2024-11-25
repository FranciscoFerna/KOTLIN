# Apuntes sobre Tipos de Datos y Operaciones Básicas en Kotlin

## 1. ¿Qué es un Programa en Kotlin?

Un programa en Kotlin puede realizar operaciones con datos. En este caso, estoy trabajando con tipos de datos simples (primitivos) como enteros, números decimales, booleanos y caracteres, así como realizando operaciones aritméticas básicas.

## 2. Métodos para Imprimir en Kotlin

En Kotlin, hay dos formas principales de imprimir información en la consola:

- **`print()`**: Imprime información sin un salto de línea al final.
- **`println()`**: Imprime información con un salto de línea al final.

### Ejemplo:

```kotlin
println("Prova 1")
println("Prova 2")
print("Prova 3")
print("Prova 4")
```

Esto imprimirá:
```
Prova 1
Prova 2
Prova 3Prova 4
```

## 3. Tipos de Datos Simples (Primitivos)

Kotlin tiene varios tipos de datos simples que puedo usar en mis programas:

- **Números enteros** (`Int`): Representan valores numéricos sin decimales. Pueden ser positivos o negativos.
- **Números decimales** (`Double`, `Float`): Para valores con decimales.
- **Booleanos** (`Boolean`): Representan valores `true` o `false`.
- **Caracteres** (`Char`): Representan una sola letra o símbolo.

### Ejemplo de `Int`:
```kotlin
val numero: Int = 6
```

## 4. Operaciones Aritméticas Básicas

Puedo realizar operaciones como suma, resta, multiplicación, división y módulo (residuo). En Kotlin, las operaciones básicas son las siguientes:

- **Suma**: `4 + 5`
- **Resta**: `6 - 3`
- **Multiplicación**: `4 * 6`
- **División (entera)**: `11 / 2`
- **Módulo (residuo)**: `11 % 2`

### Ejemplo:

```kotlin
println(6 + 4)  // Suma de 6 más 4
```

## 5. Variables en Kotlin

Una **variable** es como una caja en la que guardo un valor temporalmente. En Kotlin, para usar una variable, primero la debo declarar. Existen dos tipos de variables:

- **Variables mutables** (`var`): Puedo cambiar el valor de estas variables en cualquier momento.
- **Variables inmutables** (`val`): Su valor no puede cambiar una vez asignado.

### Declaración de Variables:

```kotlin
var primerNumero = 15      // Declaración e inicialización
var segundoNumero = 7
var tercerNumero = 4
```

Si quiero que Kotlin infiera el tipo de la variable, puedo omitirlo al declararla, ya que Kotlin lo deduce automáticamente si la inicializo con un valor.

```kotlin
var sumaTotal = primerNumero + segundoNumero + tercerNumero // El tipo es inferido como Int
```

Si no inicializo la variable, debo especificar el tipo:

```kotlin
var tipoEspecifico: Int // Especifico el tipo si no la inicializo
```

### Variables de Solo Lectura:

```kotlin
val residuModul = primerNumero % segundoNumero  // El valor no puede cambiar
```

## 6. Guía de Estilo de Nombres de Variables

Kotlin sigue la convención **lowerCamelCase** para nombrar variables, lo que significa que la primera letra de la primera palabra es minúscula y las siguientes palabras comienzan con mayúscula.

Ejemplos de nombres válidos de variables:
- `primerNumero`
- `segundoNumero`
- `tercerNumero`
- `sumaTotal`

## 7. Ejemplo de Programa Completo

En el siguiente programa, voy a realizar los siguientes pasos:

1. Declarar tres variables de tipo entero (`Int`).
2. Sumar los tres números.
3. Crear una variable de solo lectura que calcule el residuo de la división entre el primer y segundo número.
4. Realizar una operación más compleja donde multiplico la suma de los tres números por la diferencia entre el segundo y tercer número.
5. Imprimir los resultados utilizando `print()` y `println()`.

### Código Completo:

```kotlin
fun main(args: Array<String>) {
    // Declarar tres variables enteras
    var primerNumero = 15
    var segundoNumero = 7
    var tercerNumero = 4

    // Sumar los tres números y guardarlo en una nueva variable
    var sumaTotal = primerNumero + segundoNumero + tercerNumero

    // Variable de sólo lectura para el residuo (módulo) de dividir el primer número entre el segundo
    val residuModul = primerNumero % segundoNumero

    // Crear una operación compleja: (sumaTotal * (segonNumero - tercerNumero))
    var resultatComplex = sumaTotal * (segundoNumero - tercerNumero)

    // Imprimir resultados utilizando print() y println()
    println("La suma dels números és: $sumaTotal")
    print("El residu (mòdul) de dividir $primerNumero per $segonNumero és: ")
    println(residuModul)
    println("El resultat de l'operació complexa (sumaTotal * (segonNumero - tercerNumero)) és: $resultatComplex")

    // Mostrar una operación adicional con paréntesis para ilustrar la prioridad de operaciones
    val operacioPrioritat = (primerNumero + segundoNumero) * tercerNumero
    println("El resultat de l'operació amb parèntesis ((primerNumero + segonNumero) * tercerNumero) és: $operacioPrioritat")
}
```

## 8. Resultados Esperados

Este programa imprimirá lo siguiente:

```
La suma dels números és: 26
El residu (mòdul) de dividir 15 per 7 és: 1
El resultat de l'operació complexa (sumaTotal * (segonNumero - tercerNumero)) és: 130
El resultat de l'operació amb parèntesis ((primerNumero + segonNumero) * tercerNumero) és: 88
```

## 9. Conceptos Clave

- **`var`**: Variable mutable, su valor puede cambiar.
- **`val`**: Variable inmutable, su valor no puede cambiar.
- **Operaciones Aritméticas**: `+`, `-`, `*`, `/`, `%`.
- **Inferencia de Tipos**: Kotlin infiere el tipo de la variable si la inicializas con un valor.

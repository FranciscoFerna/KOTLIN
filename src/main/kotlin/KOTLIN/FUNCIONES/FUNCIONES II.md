# README: Avanzando con las Funciones en Kotlin

---

## 📌 **Índice**

1. [Variables Locales y Globales](#variables-locales-y-globales)
2. [Funciones sin Parámetros](#funciones-sin-parámetros)
3. [Procedimientos](#procedimientos)

---

## 🔄 **1. Variables Locales y Globales**

### Variables Locales
- Declaradas **dentro del cuerpo de una función**.
- **Visibilidad restringida:** Solo pueden ser accedidas dentro de la función donde se definen.
- **Duración limitada:** Existen solo mientras la función está activa.

**Ejemplo:**
```kotlin
fun sumatorio(inicio: Int, fin: Int): Int {
    var resultado = 0
    var x = inicio // Variable local
    while (x <= fin) {
        resultado += x
        x++
    }
    return resultado
}
```

### Variables Globales
- Declaradas **fuera del cuerpo de cualquier función**.
- **Accesibles globalmente** después de su declaración.
- Pueden llevar a **efectos colaterales** si no se manejan con cuidado.

**Ejemplo:**
```kotlin
var x: Int = 1 // Variable global

fun doble(): Int {
    x *= 2 // Modifica la variable global
    return x
}

fun main() {
    println("Doble: ${doble()}") // Accede a la variable global
}
```

> ⚠️ **Consejo:** Usa variables locales siempre que sea posible para evitar confusiones y errores.

---

## 🎲 **2. Funciones sin Parámetros**

En Kotlin, puedes definir funciones sin parámetros dejando vacíos los paréntesis. Estas funciones son útiles para tareas generales, como generar valores o mostrar menús.

**Ejemplo 1: Generar un número aleatorio**
```kotlin
fun lanzarDado(): Int {
    return (1..6).random()
}

fun main() {
    println("Resultado del dado: ${lanzarDado()}")
}
```

**Ejemplo 2: Mostrar un menú interactivo**
```kotlin
fun mostrarMenu(): Int {
    var opcion: Int
    do {
        println("""
        ****** MENU ******
        1. Alta Usuario
        2. Consultar Usuario
        0. Salir
        """.trimIndent())
        opcion = readLine()?.toIntOrNull() ?: -1
    } while (opcion !in 0..2)
    return opcion
}

fun main() {
    val opcionSeleccionada = mostrarMenu()
    println("Opción seleccionada: $opcionSeleccionada")
}
```

> **Nota:** Incluso sin parámetros, las funciones pueden ser altamente útiles para encapsular lógica repetitiva.

---

## ✍️ **3. Procedimientos**

Un procedimiento es una función que **no retorna ningún valor**. Se utiliza para realizar acciones como mostrar mensajes o modificar variables.

### Declaración de Procedimientos
- Se usa `Unit` como tipo de retorno, aunque puede omitirse.
- **Usos comunes:** Imprimir mensajes o realizar cálculos sin devolver resultados.

**Ejemplo:**
```kotlin
fun saludar() {
    println("¡Hola, mundo!")
}

fun main() {
    saludar() // Llama al procedimiento
}
```

### Buenas Prácticas en Procedimientos
- **Evitar múltiples sentencias `return`:** Puede causar confusión y errores.
- **No abusar de variables globales:** Usa parámetros en lugar de acceder directamente a variables globales.
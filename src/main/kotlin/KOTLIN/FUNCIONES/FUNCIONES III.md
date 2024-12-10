# README: Funciones en Kotlin - Nivel Avanzado

---

## 📌 **Índice**

1. [Paso de Parámetros](#paso-de-parámetros)
2. [Valores por Defecto y Parámetros Nombrados](#valores-por-defecto-y-parámetros-nombrados)
3. [Argumentos Variables](#argumentos-variables)
4. [Funciones como Parámetros](#funciones-como-parámetros)
5. [Enumerados](#enumerados)
6. [Funciones de Extensión](#funciones-de-extensión)
7. [Sobrecarga de Funciones](#sobrecarga-de-funciones)

---

## 🔄 **1. Paso de Parámetros**

### **Paso por Valor**
En Kotlin, los parámetros primitivos se pasan **por valor**, lo que significa que los cambios realizados en los valores son **locales** a la función y no afectan al programa principal.

**Ejemplo:**
```kotlin
fun incrementar(valor: Int): Int {
    return valor + 1
}

fun main() {
    val numero = 5
    println("Incremento: ${incrementar(numero)}") // Salida: 6
    println("Original: $numero") // Salida: 5
}
```

### **Paso por Referencia**
Los objetos (no primitivos) se pasan **por referencia**. No se puede cambiar el objeto en sí, pero sí su contenido.

**Ejemplo:**
```kotlin
fun modificarLista(lista: MutableList<Int>) {
    lista.add(10)
}

fun main() {
    val numeros = mutableListOf(1, 2, 3)
    modificarLista(numeros)
    println(numeros) // Salida: [1, 2, 3, 10]
}
```

---

## 🛠️ **2. Valores por Defecto y Parámetros Nombrados**

### Valores por Defecto
Puedes asignar un valor predeterminado a los parámetros, lo que simplifica las llamadas a funciones.

**Ejemplo:**
```kotlin
fun saludar(nombre: String = "Mundo") {
    println("¡Hola, $nombre!")
}

fun main() {
    saludar()          // Salida: ¡Hola, Mundo!
    saludar("Fran")    // Salida: ¡Hola, Fran!
}
```

### Parámetros Nombrados
Permiten especificar valores de parámetros por su nombre, mejorando la claridad.

**Ejemplo:**
```kotlin
fun configurarUsuario(nombre: String = "Usuario", edad: Int = 18) {
    println("Nombre: $nombre, Edad: $edad")
}

fun main() {
    configurarUsuario(edad = 25) // Salida: Nombre: Usuario, Edad: 25
}
```

---

## 🎲 **3. Argumentos Variables**

El modificador `vararg` permite pasar un número indeterminado de argumentos como si fueran un array.

**Ejemplo:**
```kotlin
fun sumar(vararg numeros: Int): Int {
    return numeros.sum()
}

fun main() {
    println(sumar(1, 2, 3, 4)) // Salida: 10
}
```

---

## 🔗 **4. Funciones como Parámetros**

En Kotlin, las funciones pueden ser pasadas como parámetros, permitiendo un estilo funcional.

**Ejemplo:**
```kotlin
fun operar(a: Int, b: Int, operacion: (Int, Int) -> Int): Int {
    return operacion(a, b)
}

fun main() {
    val suma = operar(3, 4) { x, y -> x + y }
    println("Suma: $suma") // Salida: 7
}
```

---

## 🗂️ **5. Enumerados**

Los enumerados definen un conjunto limitado de valores posibles, proporcionando seguridad y claridad.

**Ejemplo:**
```kotlin
enum class Direccion {
    NORTE, SUR, ESTE, OESTE
}

fun mover(direccion: Direccion) {
    println("Moviendo hacia $direccion")
}

fun main() {
    mover(Direccion.NORTE) // Salida: Moviendo hacia NORTE
}
```

---

## 🛠️ **6. Funciones de Extensión**

Permiten añadir funcionalidades a clases existentes sin modificar su código fuente.

**Ejemplo:**
```kotlin
fun String.saludar(): String {
    return "Hola, $this"
}

fun main() {
    println("Mundo".saludar()) // Salida: Hola, Mundo
}
```

---

## ⚡ **7. Sobrecarga de Funciones**

Puedes definir múltiples funciones con el mismo nombre pero diferentes parámetros.

**Ejemplo:**
```kotlin
fun imprimir(mensaje: String) {
    println(mensaje)
}

fun imprimir(numero: Int) {
    println("Número: $numero")
}

fun main() {
    imprimir("Hola")  // Salida: Hola
    imprimir(123)     // Salida: Número: 123
}
```
# README: Introducción a las Funciones en Kotlin
---

## 📌 **¿Qué es una función?**

Una función es un fragmento de código parametrizado que realiza un cálculo o tarea específica. Puede retornar un valor o simplemente ejecutar acciones sin devolver resultados. Las funciones pueden tener efectos colaterales como modificar variables globales o mostrar información en pantalla.

**Ejemplo conceptual:**
> Una función es como una "caja negra" que recibe entradas, procesa datos y devuelve resultados, sin que necesitemos saber cómo funciona internamente.

---

## 🛠️ **Componentes de una Función**

Una función consta de los siguientes elementos principales:

1. **Nombre:** Identifica a la función (debe seguir la convención `lowerCamelCase`).
2. **Parámetros (opcional):** Valores que la función recibe como entrada.
3. **Cuerpo:** Contiene las instrucciones que realiza la función.
4. **Resultado (opcional):** Valor que la función retorna al finalizar.

**Ejemplo en Kotlin:**
```kotlin
fun sumaDosNumeros(numA: Int, numB: Int): Int {
    val resultado = numA + numB
    return resultado
}
```

---

## 🚀 **Declaración de Funciones en Kotlin**

Para definir una función en Kotlin usamos la palabra clave `fun`.

**Estructura general:**
```kotlin
fun nombreDeLaFuncion(parámetros: Tipo): TipoDeRetorno {
    // Cuerpo de la función
    return resultado
}
```

**Ejemplo:**
```kotlin
fun main() {
    val suma = sumaDosNumeros(3, 5)
    println("La suma es: $suma")
}
```

---

## ⚙️ **Tipos de Retorno y Parámetros**

### Tipos de Retorno
El tipo de retorno define el tipo de dato que la función devolverá. Si no devuelve nada, puede declararse como `Unit` (similar a `void` en Java), aunque es opcional.

**Ejemplo:**
```kotlin
fun imprimirMensaje(mensaje: String) {
    println(mensaje)
}
```

### Parámetros
Los parámetros se definen como una lista de pares `nombre: Tipo`. Estos son locales a la función y pueden tener valores por defecto.

**Ejemplo con parámetro opcional:**
```kotlin
fun saludar(nombre: String = "Mundo") {
    println("Hola, $nombre!")
}
```

---

## 💡 **Ventajas de Usar Funciones**

1. **Reutilización de Código:** Evitamos repetir código, mejorando la eficiencia.
2. **Estructuración:** Organiza el programa en bloques pequeños y comprensibles.
3. **Depuración y Mantenimiento:** Permiten localizar errores de forma más sencilla.
4. **Trabajo Colaborativo:** Facilitan dividir tareas entre equipos al trabajar en proyectos grandes.

---

## 📚 **Ejemplos Prácticos**

### Sumar dos números
```kotlin
fun sumar(a: Int, b: Int): Int {
    return a + b
}

fun main() {
    println("Resultado: ${sumar(10, 20)}")
}
```

### Función con Valor por Defecto
```kotlin
fun saludar(nombre: String = "Desarrollador") {
    println("¡Hola, $nombre!")
}

fun main() {
    saludar()               // Salida: ¡Hola, Desarrollador!
    saludar("Fran")         // Salida: ¡Hola, Fran!
}
```

---

## 📖 **Mejores Prácticas**

1. **Una Función, Una Tarea:** Cada función debe realizar una tarea única y bien definida.
2. **Evitar Efectos Colaterales:** Minimiza la dependencia de variables globales.
3. **Nombrado Claro:** Usa nombres descriptivos que reflejen la funcionalidad.
4. **Código Reutilizable:** Usa funciones para evitar duplicar código.

---

## 📎 **Notas Importantes sobre Kotlin**

- A diferencia de otros lenguajes como C, las funciones en Kotlin no necesitan ser definidas antes de ser llamadas.
- Es posible definir funciones públicas o importar paquetes para organizar mejor el código.

---

## 🌟 **¿Por Qué Kotlin?**

Kotlin es un lenguaje moderno que facilita la escritura de funciones gracias a su sintaxis concisa y poderosa, promoviendo prácticas como el uso de valores por defecto y tipos inmutables.
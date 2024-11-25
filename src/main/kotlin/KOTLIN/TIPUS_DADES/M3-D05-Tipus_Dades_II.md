## Tipos de Datos en Kotlin

### Boolean
- El tipo `Boolean` almacena valores lógicos: **`true`** o **`false`**.
- **Operadores lógicos:**
    - **NOT:** `!` (invierte el valor)
    - **AND:** `&&` (se cumple si ambas condiciones son verdaderas)
    - **OR:** `||` (se cumple si al menos una condición es verdadera)

**Comparaciones Booleanas:**
- `==`: Igual a
- `!=`: Diferente de
- `>`: Mayor que
- `<`: Menor que
- `>=`: Mayor o igual que
- `<=`: Menor o igual que

**Lectura de Booleanos con `Scanner`:**
- Se usa `nextBoolean()` para leer un valor booleano introducido por el usuario.
- Ejemplo con control de datos:

```kotlin
val userInputValue = if (SCANNER.hasNextBoolean()) {
    val booleanValue = SCANNER.nextBoolean()
    println("Este es el valor booleano introducido: $booleanValue")
    booleanValue
} else {
    println("ERROR404")
    null
}
```

### Char
- El tipo `Char` representa un solo carácter.
- Se escribe entre comillas simples, por ejemplo: `'a'`, `'1'`, `'%'`.

**Operaciones con Char:**
- Comparación: `'a' == 'b'`
- Comparaciones: `<`, `>`, `<=`, `>=`

**Lectura de un carácter con `Scanner`:**
- Para leer un solo carácter se puede usar `next().single()` o `next()[0]`.

```kotlin
val userInputValue = SCANNER.next().single()
```

**Gestión de errores en la lectura de un único carácter:**
```kotlin
val userInputValue = scanner.next()
if (userInputValue.length == 1) {
    println("Este es el carácter introducido: $userInputValue")
} else {
    println("ERROR: Introduce solo un carácter.")
}
```

### Float y Double
- **Double:** Número con precisión doble, hasta 15 decimales.
- **Float:** Número con precisión simple, hasta 6-7 decimales.

**Ejemplo con Float y Double:**

```kotlin
val floatNumber = 1.2f
val veryLongFloatNumber = 1.2345678901234567f
println(veryLongFloatNumber)
```

**Operaciones con Double:**
- Suma, resta, multiplicación, y división:
```kotlin
val doubleNumber = 4.4
val anotherDoubleNumber = 5.6
println(doubleNumber + anotherDoubleNumber)
```

**Lectura de Double:**
```kotlin
val userInputValue = SCANNER.nextDouble()
```

**Formateo de Floats y Doubles:**
- Se puede redondear un número o mostrarlo con un número específico de decimales usando `String.format()`:

```kotlin
println(String.format("%.2f", veryLongFloatNumber))
```

### Long
- **Int:** Rango de -2,147,483,648 a 2,147,483,647
- **Long:** Rango mucho más grande, de -9,223,372,036,854,775,808 a 9,223,372,036,854,775,807

### Operaciones con Variables
- **Incremento:** `variable++`
- **Decremento:** `variable--`

**Operaciones de asignación:**
- `A += B` es lo mismo que `A = A + B`
- `A -= B` es lo mismo que `A = A - B`
- `A *= B` es lo mismo que `A = A * B`
- `A /= B` es lo mismo que `A = A / B`
- `A %= B` es lo mismo que `A = A % B`

### Conversiones de Tipos
Puedes convertir entre diferentes tipos de datos:
- `Int` a `Double`
- `Double` a `Int`
- `Char` a `Int`

**Ejemplo de conversiones:**
```kotlin
val intFromDouble: Int = 34.6.toInt()
val doubleFromInt: Double = 342.toDouble()
val intFromChar: Int = 'a'.toInt()
val longFromInt: Long = 34.toLong()
```

---

## Ejercicio: Calculadora de Descuentos
Este ejercicio simula una calculadora que aplica un descuento a un precio original:

### Descripción del código:
1. **Entrada de datos:** El programa pide al usuario que introduzca el precio del producto y el porcentaje de descuento.
2. **Validación:** Si los valores introducidos son negativos, el programa muestra un error.
3. **Cálculo del descuento:** El precio final se calcula aplicando el porcentaje de descuento.
4. **Salida:** Muestra el precio original, el descuento aplicado y el precio final con dos decimales.

### Código:
```kotlin
fun main() {
    val SCANNER: Scanner = Scanner(System.`in`)

    // Entrada del precio del producto
    println("Introduce el precio original del producto: ")
    val precioProducto: Double = SCANNER.nextDouble()

    if (precioProducto < 0) {
        println("ERROR404")
        return
    }

    // Entrada del porcentaje de descuento
    println("Ahora, porfavor introduzca el porcentaje de descuento: ")
    val porcentajeDescuento: Double = SCANNER.nextDouble()

    if (porcentajeDescuento < 0) {
        println("ERROR404")
        return
    }

    // Cálculo del precio final
    val precioFinal = precioProducto - ((porcentajeDescuento * precioProducto) / 100)

    // Salida del resultado
    println("Precio original: $precioProducto")
    println("Porcentaje de descuento: $porcentajeDescuento")
    println("El precio final después de aplicar el descuento es: ${String.format("%.2f", precioFinal)}")
}
```
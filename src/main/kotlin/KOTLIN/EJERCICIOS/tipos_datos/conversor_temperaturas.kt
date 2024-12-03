package KOTLIN.EJERCICIOS.tipos_datos

import KOTLIN.SCANNER


fun main() {
    /* F = (C × 9/5) +32 */
    print("Bienvenido! Por favor, introduzca la temperatura en Celsius: ")
    var celsius: Float = SCANNER.nextFloat()
    val resultado: Float = (celsius * 9/5) + 32

    println("\nEl resultado de pasar de $celsius grados Celsius a Fahrenheit es $resultado")
}
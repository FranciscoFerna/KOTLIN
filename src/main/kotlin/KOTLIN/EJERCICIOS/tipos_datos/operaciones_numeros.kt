package KOTLIN.EJERCICIOS.tipos_datos

import KOTLIN.SCANNER

fun main() {
    println("Bienvenido al operador de numeros!")
    println("Porfavor introduzca dos valores:")
    print("Valor a: ")
    val a: Int = SCANNER.nextInt()
    print("Valor b: ")
    val b: Int = SCANNER.nextInt()
    println("La suma de los valores $a y $b es ${a+b}\nLa resta entre $a y $b es ${a-b}\nLa multiplicacion entre $a y $b es ${a*b}\nLa division entera entre $a y $b es ${a%b}")

    if (a > b) {
        print("\nMayor: $a, Menor: $b")
    } else {
        print("\nMayor: $b, Menor: $a")
    }

    if (a / b == 0) {
        println("\nEl primer numero es divisible por el segundo. Resultado ${a / b == 0}")
    }
}
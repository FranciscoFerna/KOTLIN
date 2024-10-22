package M3_EJERCICIOS

import java.util.Scanner
import kotlin.math.min

/*
Basandome en 5 ejercicios del Jo-El en donde se trabaja if, switch, control de datos con validaciones, estructuras de bucles para procesar multiples casos, y el uso de rangos numericos y cadenas de texto. He decidido hacer un enunciado con un problema que sea englobe todos los conecptos. Antes de mirar la solucion, te propongo que lo intentes tu!

Tienes el enunciado en M3_ENUNCIADO_EJERCICIO_1.md
println(if (year % 100 in 90..99) "SI" else "NO")
*/

fun main() {
    val SCANNER: Scanner = Scanner(System.`in`)

    val añoActual: Int = 2024
    var añoNacimiento: Int = SCANNER.nextInt()
    if (añoNacimiento % 100 in 90..99) {
        println("Puedes participar!")
    } else if ((añoActual - añoNacimiento) >= 20) {
        println("Puedes participar ya que tienes 20, o mas años")
    } else {
        println("Losiento no puedes participar")
        return // Termina el programa si no puede participar
    }

    print("Introduce su puntuación en una prueba (un valor 0 y 10)")
    var puntuacionPrueba: Float = SCANNER.nextFloat()
    when {
        puntuacionPrueba in 0F..4F -> println("Suspenso")
        puntuacionPrueba in 5F..6F -> println("Aprobado")
        puntuacionPrueba in 7F..8F -> println("Notable")
        puntuacionPrueba in 9F..10F -> println("Excelente")
        else -> println("Puntuación no válida. Debe estar entre 0 y 10.")
    }

    print("Introduce la hora en la accedes al sistema: ")
    var hora: Int = SCANNER.nextInt()
    print("Introduce el minuto en que accedes al sistema: ")
    var minutos: Int = SCANNER.nextInt()
    print("Introduce el segundo en que accedes al sistema: ")
    var segundos: Int = SCANNER.nextInt()

    if (hora in 0..23 && minutos in 0..59 && segundos in 0..59) {
        println("El tiempo es correcto!")
    } else println("El formato es invalido, no engañes o sera engañado")

    println("'Q': Activar una habilidad especial 1.\n" +
            "'W': Activar una habilidad especial 2.\n" +
            "'E': Activar una habilidad especial 3.\n" +
            "'R': Activar la \"ultimate\".\n" +
            "'B': Volver a la pantalla inicial.\n" +
            "'D' o 'F': Mostrar un mensaje especial para usuarios novatos.")

    val opcion: Char = if (SCANNER.hasNext()) SCANNER.next()[0] else Char.MIN_VALUE
    when (opcion) {
        'Q' -> print("Activar una habilidad especial 1")
        'W' -> println("Activar una habilidad especial 2.")
        'E' -> print("Activar una habilidad especial 3.")
        'R' -> print("Activator la ultimate")
        'B' -> print("Volver a la pantalla inicial.")
        'D', 'F' -> println("Mensaje Especial para usuarios novatos")
        else -> ("ERROR, introduce un caracter valido!")
    }

}
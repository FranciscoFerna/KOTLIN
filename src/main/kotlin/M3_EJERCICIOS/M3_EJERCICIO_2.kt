package M3_EJERCICIOS

import java.util.Scanner
import kotlin.math.min

/*
Basandome en 5 ejercicios del Jo-El. He hecho este ejercicio, donde se trabajarán conceptos fundamentales de programación como condicionales (if, switch), bucles para procesar múltiples casos, validaciones de entrada y manejo de datos.

Tienes el enunciado en M3_ENUNCIADO_EJERCICIO_2.md

*/

fun main() {
    val SCANNER: Scanner = Scanner(System.`in`)

    // Leer el número de casos para imprimir números pares
    var numT: Int = SCANNER.nextInt()



    for (i in 1..numT) {
        var numN: Int = SCANNER.nextInt()

        // Imprimir divisores
        for (j in 1..numN) {
            if (j % 2 == 0) {
                print("$j ")
            }
        }
        println()
    }

    var totalNotes = 0
    var sumaNotes = 0.0
    var contadorExcelente = 0
    var contadorNotable = 0
    var contadorBien = 0
    var contadorSuficiente = 0
    var contadorInsuficiente = 0
    var contadorMoltDeficient = 0

    while (true) {
        val nota = SCANNER.nextInt()

        if (nota == -1) {
            break
        }

        if (nota in 0..10) {
            totalNotes++
            sumaNotes += nota

            when {
                nota >= 9 -> contadorExcelente++
                nota in 7..8 -> contadorNotable++
                nota == 6 -> contadorBien++
                nota == 5 -> contadorSuficiente++
                nota > 3 -> contadorInsuficiente++
                else -> contadorMoltDeficient++
            }
        }
    }
    val media = if (totalNotes > 0) sumaNotes / totalNotes else 0.0
    println("NOTES: $totalNotes MITJANA: %.7f E: $contadorExcelente N: $contadorNotable B: $contadorBien S: $contadorSuficiente I: $contadorInsuficiente MD: $contadorMoltDeficient".format(media))

    var casosPruebaM = SCANNER.nextInt()

    for (i in 1..casosPruebaM) {
        val pisos =  if (SCANNER.hasNextInt()) SCANNER.nextInt() else 0
        var totalBombones = 0

        for (n in 1..pisos) {
            totalBombones += n * n
        }
        println(totalBombones)
    }
    SCANNER.nextLine() // Consumir el salto de línea

    val nombre = SCANNER.nextLine().trim()

    val esValido: Boolean = nombre.all { it == nombre[0] }

    if (esValido) {
        println("NO")
    } else {
        println("SI")
    }

    val dañoInicial = SCANNER.nextInt()
    val vidaEnemigo = SCANNER.nextInt()

    var dañoTotal = 0
    var explosiones = 0
    var dañoActual = dañoInicial

    while (dañoTotal < vidaEnemigo) {
        dañoTotal += dañoActual
        dañoActual *= 2 // Aumentar el daño al 100%
        explosiones++
    }
    println(explosiones)
}
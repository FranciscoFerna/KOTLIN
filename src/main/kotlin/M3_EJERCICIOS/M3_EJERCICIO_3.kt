package M3_EJERCICIOS

import java.util.Scanner

/*
Tienes el enunciado en M3_ENUNCIADO_EJERCICIO_3.md
*/

fun main() {
    val SCANNER: Scanner = Scanner(System.`in`)

    println("Introduce la cantidad de concursantes: ")
    val cantidadConcursantes = SCANNER.nextInt()
    for (concursante in 1..cantidadConcursantes) {
        var puntuacionTotal: Int = 0
        var deliciosos: Int = 0
        var agradables: Int = 0
        var mejorables: Int = 0
        var deseaPresentarMasPostres: String

        do {
            println("Concursante $concursante, introduce el número de postres que deseas presentar:")
            var numeroPostres = SCANNER.nextInt()

            for (i in 1..numeroPostres) {
                println("Introduce la dulzura del postre $i:")
                val postre = SCANNER.nextInt()

                when {
                    postre > 7 -> {
                        puntuacionTotal += 5
                        deliciosos++
                    }
                    postre in 4..7 -> {
                        puntuacionTotal += 3
                        agradables++
                    }
                    postre < 4 -> {
                        mejorables++
                    }
                }
            }
            println("¿Quieres presentar más postres? (SI/NO):")
            deseaPresentarMasPostres = SCANNER.next().uppercase()
        } while (deseaPresentarMasPostres == "SI")

        println("Concursante $concursante: Puntuación Total: $puntuacionTotal Deliciosos: $deliciosos Agradables: $agradables Mejorables: $mejorables")
    }
}
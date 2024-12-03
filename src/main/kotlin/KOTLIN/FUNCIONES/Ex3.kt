package KOTLIN.FUNCIONES

import java.util.Scanner

/*
Crea un programa que llegeixi el valor del radi d’una esfera. Seguidament ha de calcular el seu volum i mostrar-lo per pantalla des de la funció main.

Recorda que el volum d’una esfera es calcula com 4/3 π r3

Extra: Amplia l’agoritme afegint-hi un menú i que permeti també calcular l’àrea del quadrat, del rectangle i del triangle.
*/

fun main() {
    val SCANNER: Scanner = Scanner(System.`in`)
    var continueProgram: Boolean = true
    val TEXT_MENU: String = "\nCalculadora d'arees\n" +
            "1. Calcular el volum d'una esfera.\n" +
            "2. Calcular l'area d'un quadrat.\n" +
            "3. Calcular l'area d'un rectangle\n" +
            "4. Calcular l'area d'un triangle\n" +
            "0. Sortir!\n"

    println("Benvingut!")
    while (continueProgram) {
        println(TEXT_MENU)
        println("Escull una opcio: ")
        var opcioValida = false
        var optionUser = 0

        if (SCANNER.hasNextInt()) {
            optionUser = SCANNER.nextInt()
            if (optionUser in 0..4) {
                opcioValida = true
                SCANNER.nextLine()
            }
        }

        if (!opcioValida) {
            println("Opcio no valida. Si us plau, introdueix un numero entre 0 i 4.")
            SCANNER.nextLine()
            continue
        }

        when (optionUser) {
            1 -> {
                println("Has escollit l'opcio de calcular el volum d'una esfera")
                println("Introdueix el radi de l'esfera: ")
                if (SCANNER.hasNextDouble()) {
                    val radi: Double = SCANNER.nextDouble()
                    println("El volum de l'esfera es: " + radiEsfera(radi))
                } else {
                    println("Entrada no valida. Si us plau, introdueix un numero.")
                    SCANNER.nextLine()
                }
            }
            2 -> {
                println("Has escollit l'opcio de calcular l'àrea d'un quadrat.")
                println("Introdueix la longitud d'un costat: ")
                if (SCANNER.hasNextDouble()) {
                    val longitud: Double = SCANNER.nextDouble()
                    println("L'area d'un cuadrat es: " + areaQuadrat(longitud))
                } else {
                    println("Entrada no valida. Si us plau, introdueix un numero.")
                    SCANNER.nextLine()
                }
            }
            3 -> {
                println("Has escollit l'opcio de calcular l'area d'un rectangle.")
                println("Introdueix la base i l'altura del rectangle: ")
                println("Introdueix la base: ")
                if (SCANNER.hasNextDouble()) {
                    val base: Double = SCANNER.nextDouble()
                    println("Introdueix l'altura: ")
                    val altura: Double = SCANNER.nextDouble()
                    println("L'area del rectangle es: " + areaRectangle(base, altura))
                } else {
                    println("Entrada no valida. Si us plau, introdueix un numero.")
                    SCANNER.nextLine()
                }
            }
            4 -> {
                println("Has escollit l'opció de calcular l'area d'un triangle.")
                println("Introdueix la base i l'altura del triangle: ")
                println("Introdueix la base: ")
                if (SCANNER.hasNextDouble()) {
                    val base: Double = SCANNER.nextDouble()
                    println("Introdueix l'altura: ")
                    if (SCANNER.hasNextDouble()) {
                        val altura: Double = SCANNER.nextDouble()
                        println("L'area del triangle es: " + areaTriangle(base, altura))
                    } else {
                        println("Entrada no vàlida. Si us plau, introdueix un número.")
                        SCANNER.nextLine()
                    }
                } else {
                    println("Entrada no valida. Si us plau, introdueix un numero.")
                    SCANNER.nextLine()
                }
            }
            0 -> {
                println("Sortint del programa...")
                continueProgram = false
            }
        }
    }
}

fun radiEsfera(radi: Double): String {
    val resultat = (4.0 / 3.0) * Math.PI * Math.pow(radi, 3.0)
    return String.format("%.2f", resultat)
}

fun areaQuadrat(a: Double): String {
    val resultat = a * a
    return String.format("%.2f", resultat)
}

fun areaRectangle(a: Double, b: Double): String {
    val resultat = a * b
    return String.format("%.2f", resultat)
}

fun areaTriangle(a: Double, b: Double): String {
    val resultat = 0.5 * a * b
    return String.format("%.2f", resultat)
}

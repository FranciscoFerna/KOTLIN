package KOTLIN.FUNCIONES

import KOTLIN.SCANNER

/*
Crea un programa que llegeixi el valor del radi d’una esfera. Seguidament ha de calcular el seu volum i mostrar-lo per pantalla des de la funció main.
*/


fun main() {
    val MENU_TEXT: String =
        "\n\t************" +
        "\n\t1. Suma" +
        "\n\t2. Resta" +
        "\n\t3. Multiplicació" +
        "\n\t4. Divisio" +
        "\n\t************"
    var num1: Int = solicitarNumero("Introdueix el primer número:")
    var num2: Int = solicitarNumero("Introdueix el segon número:")

    var opcMenu: Int = 0
    do {
       println(MENU_TEXT)
        opcMenu= solicitarNumero("Introduix la operació que vols fer (1-4):")
    } while (opcMenu<1 || opcMenu>4)

    when(opcMenu) {
        1 -> {
            val resultat: Int = sumar(num1, num2)
            println("El resultat de la suma es: $resultat")
        }
        2 -> {
            val resultat: Int = restar(num1, num2)
            println("El resultat de la resta es: $resultat")
        }
        3 -> {
            val resultat: Int = multiplicació(num1, num2)
            println("El resultat de la multiplicacio es: $resultat")
        }
        4 -> {
            val resultat: Int = divisio(num1, num2)
            println("El resultat de la divisio es: $resultat")
        }
    }
}

fun solicitarNumero(message:String):Int {
    do {
        println(message)
        val lecturaCorrecta: Boolean = SCANNER.hasNextInt()
        if (!lecturaCorrecta) {
            println("ERROR! Has d'introuit un número sencer")
            SCANNER.nextLine()
        }
    } while (!lecturaCorrecta)
    var numero:Int = SCANNER.nextInt()
    SCANNER.nextLine()
    return numero
}

fun sumar(numero1: Int, numero2: Int):Int {
    return numero1 + numero2
}
fun restar(numero1: Int, numero2: Int):Int {
    return numero1 - numero2
}
fun multiplicació(numero1: Int, numero2: Int):Int {
    return numero1 * numero2
}
fun divisio(numero1: Int, numero2: Int):Int {
    return numero1 / numero2
}
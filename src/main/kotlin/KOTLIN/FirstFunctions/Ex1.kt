package KOTLIN.FirstFunctions

import java.util.Scanner

/*
Crea un programa que llegeixi un nombre per teclat. Seguidament ha de cridar a una funció que torni el quadrat d’aquest número. El valor retornat s’haurà de mostrar per pantalla des de la funció main.
*/

fun main() {
    val SCANNER:Scanner = Scanner(System.`in`)
    println(quadratNumero(SCANNER.nextInt()))
}

fun quadratNumero(a: Int):Int {
    val resultado: Int = a * a
    return resultado
}
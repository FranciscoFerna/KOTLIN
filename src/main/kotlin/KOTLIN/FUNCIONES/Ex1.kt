package KOTLIN.FUNCIONES

import KOTLIN.SCANNER

/*
Crea un programa que llegeixi un nombre per teclat. Seguidament ha de cridar a una funció que torni el quadrat d’aquest número. El valor retornat s’haurà de mostrar per pantalla des de la funció main.
*/

fun main() {
    println(quadratNumero(SCANNER.nextInt()))
}

fun quadratNumero(a: Int):Int {
    val resultado: Int = a * a
    return resultado
}
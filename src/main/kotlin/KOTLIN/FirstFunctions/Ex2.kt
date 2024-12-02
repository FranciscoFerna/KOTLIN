package KOTLIN.FirstFunctions

import java.util.Scanner

/*
Crea un programa que llegeixi dos nombres per teclat. Seguidament ha de cridar a una funció que compari els números i torni un booleà indicant si el primer és major que el segon. El programa ha de mostrar per pantalla si el primer és major que el segon o no des de la funció main.
*/

fun main() {
    println(comparaNombres(7,6))
}

fun comparaNombres(a:Int, b:Int):Boolean {
    val resultado = if (a > b) {
        true
    } else {
        false
    }
    return resultado
}
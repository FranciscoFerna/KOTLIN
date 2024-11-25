package KOTLIN.TIPUS_DADES

import java.util.Scanner

/* M3-D07-Tipus de Dades III

String -> Cadena de Caràcters
S'escriuen entre ""

fun main() {
    println("Hola món")
}

String - Caracters d'escapada
Existeixen uns caràcters especials que et permeten presentar un string amb un format concret

\t -> tab
\b -> backspace
\n -> new line(LF)
\r -> carriage return (CR)
\' -> single quotation mark
\" -> double quotation mark
\\ -> backslash
\$ -> dollar sign

fun main() {
    println("Hola!")
    println("Una línia\nDues Linies\nTres Linies")
    println("Una contrabarra: \\")
}

String - Una altra forma
Pots definir un string amb triples cometes """
Aixo ens permetra escriure multiples linies sense caracters escapats

fun main() {
    val multipleLines = """Les tres cometes
    ense deixen escriure
    multiples linies"""
    println(multipleLines)
}

string - Operacions

Concatenar (+)
"Hola" + "a tothom"

Comparacio d'igualtat
"Hola" == "a tothom"

String Templates
Podem formatar un String i incloure-hi variables directament amb la seguent forma, fins i tot podem fer operacions en elles

fun main() {
    val number1 = 1
    val number2 = 2
    println("This is number1: $number1")
    println("This is number2: $number2")
    println("This is the result of adding both: ${number1 + number2}")
}

String - Input
Per llegir-les utilitzarem la funció readln() o la classe Scanner
next() -> Llegeix la seguent paraula
nextLine() -> Llegeix la seguent linia

import java.util.*
fun main() {
    val SCANNER: Scanner = Scanner(System.`in`)
    println("Introdueix un caracter: ")
    val userInputValue = SCANNER.next()
    println("Aquest es el de l'string introduit: ")
    println(userInputValue)
}

String - Propietats i metodes

Partirem de la definicio d'un objecte String de nom s
s.lenght -> Propietat que ens indica la longitud de l'string
s.substring(start: int): String -> Retorna la cadena s a partir de la posicio start i fins al final
s.sbstring(start: int, end: int): String -> Retorna la cadena s a partir de la posicio start i fins a la posicio end
s.substring(r: Range): String -> Retorna la subcadena s segons el rang indicat en r
s.lowercase(): String -> Retorna la cadena s convertida a minuscules
s.uppercase(): String -> Retorna la cadena s convertida a majuscules
s.get(i:Int): Char -> Retorna el caracter i (base 0) de la cadena s
s[i]: Char -> Retorna el caracter i (base 0) de la cadena s
s.indexOf("cadena"): Int -> Retorna -1 si no es troba la cadena dins l'string, o la posicio (base 0) de la cadena on troba la primera coincidencia
s.plus(s2): String -> Metode que retorrna un nou string que es la concatenacio de s i s2. L'string s no queda alterat. Tambe poden fer s+s2
s.compareeTo (s2: String): Int -> Compara s amb s2 i retorna
    <0 si s < s2 (proveu: println("a".compareTo("h")))
    0   si s = s2 (proveu: println("hola".compareTo("hola")))
    >0 si s > s2 (proveu: println("que tal?".compareTo("b")))
s.split(c: Char): list<String> -> Retorna la cadena s separada pel caracter c
s.split(s2: String): List<String> -> Retorna la cadena de s separada per l'String s2
s.split(r: Regex): List<String> -> Retorna la cadena s separada l'expressio regular

https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/
*/

fun main() {
    // Crea un programa que imprima varias líneas utilizando caracteres de escape.
    println("Hola!\n\tAquest és un exemple d'ús de caràcters d'escapada:")
    println("1. Nova línia\n2. \tTabulador")
    println("3. Contrabarra: \\")
    println("4. Cometes: \"Hola\" i \'Adéu\'")

    // Crea un programa que utilice triples comillas para definir un String multilínea.

    val multipleLines = """
        Benvingut al programa!
        Aquí pots veure diferents exemples d'ús de les cadenes
        en Kotlin. Espero que t'agradi!
    """.trimIndent()
    println(multipleLines)

    // Escribe un programa que concatene dos Strings y compare si son iguals.

    val string1 = "Hola"
    val string2 = "World!"

    println(string1 + string2)
    println(string1 + " " + string2)
    val isEqual = string1 == "Hola"
    println("El greeting és igual a 'Hola'? $isEqual")

    // Utiliza templates de Strings para imprimir variables en una cadena.
    val name = "Fran"
    val age = 18
    println("Hola me llmo $name y tengo $age")

    // Crea un programa que solicite al usuario un String y lo imprima.
    val SCANNER:Scanner = Scanner(System.`in`)
    println("Introduzca su nombre: ")
    val surname = SCANNER.nextLine()
    print("Hello $surname")

    // Utiliza diferentes propiedades y métodos de String para manipular cadenas.
    val s = "Hola Mundo!"

    println("Longitud de la cadena: ${s.length}")
    println("Subcadena (index 0 a 3) ${s.substring(0, 4)}")
    println("Minuscules: ${s.lowercase()}")
    println("Majuscules: ${s.uppercase()}")
    println("Caracter en index 5: ${s[5]}")
    println("Posico de 'Mundo': ${s.indexOf("Mundo")}")

    val parts = s.split(" ")
    println("Parts de la cadena $parts")

    // Compara varios Strings utilizando compareTo y muestra el resultado.
    val str1 = "hola"
    val str2 ="mon"
    val compareResult = str1.compareTo(str2)

    when {
        compareResult < 0 -> println("$str1 es menor que $str2")
        compareResult > 0 -> println("$str1 es major que $str2")
        else -> println("$str1 es igual a $str2")
    }

    // Crea un programa que combine varios conceptos, como entrada de usuario, concatenación, y uso de métodos de String.

    println("Introdueix la teva primera paraula: ")
    val word1 = SCANNER.nextLine()

    println("Introdueix la teva segona paraula: ")
    val word2 = SCANNER.nextLine()

    val combined = word1 + " " + word2
    println("La combinacion entre $word1 y $word2 es: $combined")

    println("La longitud total de la cadena es: ${combined.length}")
    println("La prinera paraula es igual a 'Hola'? ${word1 == "Hola"}")
}
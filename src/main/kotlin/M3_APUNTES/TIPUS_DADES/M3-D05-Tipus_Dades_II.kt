package M3_APUNTES.TIPUS_DADES

import java.util.*

/*
M3-D06 - Tipus de dades II
Boolean -> Valor de tipus lògic per tal d'establir certesa o falsedat

Té dos valors posibles
False -> 0
True -> 1

fun main() {
    print(true)
    println(1 == 1)
}

Boolean Operacions
NOT -> !
AND -> &&
OR -> ||

fun main() {
    // Anem a comprovar el funcionament del AND
    val testAnd = true && false
    println(testAnd)
}

Boolean Comparacions

Igual que -> ==
Diferent que -> !=
Major que -> >
Menor que -> <
Major o igual que -> >=
Menor o igual que -> <=

fun main() {
    println(3 == 2)
    println(3 != 2)
    println(3 > 2)
    println(3 < 2)
    println(3 >= 2)
    println(3 <= 2)
}

Boolean - Input
Per llegir-les utilitzarem la classe Scanner
Amb la funció nextBoolean() el programa esperara que l'usuari introdueixi un booleà per seguir amb l'execucio

import java.Util.Scanner

fun main(){
    val SCANNER:Scanner = Scanner(System.`in`)
    println("Introdueix un booleà: ")
    val userInputValue = SCANNER.nextBoolean()
    println("Aquest es el boolea introduit: ")
    println(userInputValue)
}

import java.util.*

fun main(){
    val SCANNER: Scanner = Scanner(System.`in`)
    println("Introdueix un booleà: ")
    val userInputValue = SCANNER.nextBoolean()
    println("Aquest es el boolea introduit: ")
    println(userInputValue)
    // Petaria ya que no estem utilitzant el metode hasNextBoolean() per comprovar si l'usuari ha escrit un valor booleà o no
}

Amb control de dades
fun main(){
    val SCANNER: Scanner = Scanner(System.`in`)
    println("Introdueix un booleà: ")

    val userInputValue = if (SCANNER.hasNextBoolean()) {
        val booleanValue = SCANNER.nextBoolean()
        println("Aquest es el booleà introduit: $booleanValue")
        booleanValue
    } else {
        println("ERROR404")
        null
    }

    println("Valor introduit: $userInputValue")
}

Char - Caràcter
Unitat fonamental de text usada en qualsevol alfabet
Se escriuen entre 'cometes simples'
'A'
'b'
'9'
'?'
Indetificador: Char

fun main() {
    println('C')
}

Igual -> 'a' == 'c'
Diferent 'a' != 'c'
>, <, >=, <=, +, -

Amb la funcio next().single() el programa esperara que l'usuri introduexi un caracter per seguir amb l'execució

import java.util.*
fun main() {
    val SCANNER:Scanner = Scanner(System.`in`)
    println("Introduiex un unic caracter: ")
    val userInputValue1 = SCANNER.next().single()
    *//* Petaria en cas de que en el primer valor no introdueixis un Char *//*
    println("Introdueix el valor que vulgis: ")
    val userInputValue2 = SCANNER.next()[0]
    println("Aquest es el caracter introduit: ")
    println(userInputValue1)
    println("Aquest es el caracter introduit: ")
    println(userInputValue2)
}

// + Como en el bingo -> BOLA PLUS:
Para gestionar los errores un ejemplo basic:


fun main() {
    val scanner: Scanner = Scanner(System.`in`)
    println("Introdueix un únic caracter: ")
    val userInputValue1 = scanner.next()

    if (userInputValue1.length == 1) {
        println("Aquest és el caracter que has introduït: $userInputValue1")
    } else {
        println("ERROR: Si us plau, introdueix només un únic caracter.")
    }

    println("Introdueix el valor que vulguis: ")
    val userInputValue2 = scanner.next()

    if (userInputValue2.isNotEmpty()) {
        println("Aquest és el caracter introduït: ${userInputValue2[0]}")
    } else {
        println("ERROR: Si us plau, introdueix almenys un valor.")
    }
}

Float

Double -> Real de precisió doble. 15 decimals
Float -> Real de precisió simple 6-7 decimals

fun main() {
    val floatNumber = 1.2f
    println(floatNumber)
    val veryLongFloatNumber = 1.2345678901234567f
    println(veryLongFloatNumber)
}

Double - Nombre real
Valor numeric, positiu o negatiu, amb decimals
23.23
19987.123
0.0
-274.42

Es poden fer las mateixes operacions que amb els enters, exceptuant el mòdul

Suma -> 4.4 + 5.6
Resta -> 6.123 - 3.123
Multiplicació -> 4.6 * 6.4
Divisió -> 10.0 / 2.1

fun main() {
    val doubleNumber = 4.4
    val anotherDoubleNumber = 5.6
    println(doubleNumber + anotherDoubleNumber)
}

Amb la funcio nextDouble() el programa esperara que l'usuari introdueixi un decimal per seguir amb l'execució

fun main() {
    val SCANNER: Scanner = Scanner(System.`in`)

    println("Introdueix un numero decimal: ")
    val userInputValue = SCANNER.nextDouble()
    println("Aquest és el numero introduit: ")
    println(userInputValue)
}

Formatear Floats i Doubles

Cuant tenim valor numerics amb molts decimals, els podem mostrar per pantalla arrodonits a enter o amb un cert nombre de decimals amb String.format()

import kotlin.math.roundToInt

fun main() {
    val floatNumber = 1.2f
    println(floatNumber.roundToInt())

    val veryLongFloatNumber = 1.2345678901234567f
    println(String.format("%.2f", veryLongFloatNumber))
}


Numeros grans
Podem escriure un enter
123123123
123_123_321

fun main() {
    println(123_456_789)
}

Long

Int -> -2.147.483.648 a 2.147.483.647
Long -> -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807

Variables - Altres Operacions

Increment variable
variable++

Decrement variable
variable--

Variables - Operacions a l'assignacio
A += B - és el mateix que fer A = A + B
A -= B - és el mateix que fer A = A - B
A *= B - és el mateix que fer A = A * B
A /= B - és el mateix que fer A = A / B
A %= B - és el mateix que fer A = A % B

Conversions de tipus
Podem convertir un valor entre diferents tipus
Int to Double
Double to Int
Long to Int
Int to Long
Char to Int
...

Conversiones

fun main() {
    val intFromDouble: Int = 34.6.toInt()
    println(intFromDouble)
    val doubleFromInt: Double = 342.toDouble()
    println(doubleFromInt)
    val intFromChar: Int = 'a'.toInt()
    println(intFromChar)
    val longFromInt: Long = 34.toLong()
    println(longFromInt)
}
*/

// EJERCICIO -> Calculadora de Descuentos
fun main() {
    val SCANNER:Scanner = Scanner(System.`in`)

    println("Introduce el precio original del producto: ")
    val precioProducto: Double = SCANNER.nextDouble()

    if (precioProducto < 0) {
        println("ERROR404")
        return
    }

    println("Ahora, porfavor introduzca el porcentaje de descuento: ")
    val porcentajeDescuento: Double = SCANNER.nextDouble()

    if (porcentajeDescuento < 0) {
        println("ERROR404")
        return
    }

    val precioFinal = precioProducto - ((porcentajeDescuento * precioProducto) / 100)

    println("Precio original: $precioProducto")
    println("Porcentaje de descuento: $porcentajeDescuento")
    println("El precio final después de aplicar el descuento es: ${String.format("%.2f", precioFinal)}")
}
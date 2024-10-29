package RETOS_PROGRAMACION

// https://oregoom.com/kotlin/operadores/

/*
 * EJERCICIO:
 * - Crea ejemplos utilizando todos los tipos de operadores de tu lenguaje:
 *   Aritméticos, lógicos, de comparación, asignación, identidad, pertenencia, bits...
 *   (Ten en cuenta que cada lenguaje puede poseer unos diferentes)
 * - Utilizando las operaciones con operadores que tú quieras, crea ejemplos
 *   que representen todos los tipos de estructuras de control que existan
 *   en tu lenguaje:
 *   Condicionales, iterativas, excepciones...
 * - Debes hacer print por consola del resultado de todos los ejemplos.
 *
 * DIFICULTAD EXTRA (opcional):
 * Crea un programa que imprima por consola todos los números comprendidos
 * entre 10 y 55 (incluidos), pares, y que no son ni el 16 ni múltiplos de 3.
 *
 * Seguro que al revisar detenidamente las posibilidades has descubierto algo nuevo.
 */

fun main() {
    /* Operadores Aritmeticos
    + -> Suma
    - -> Resta
    * -> Multiplicacion
    / -> Division
    % -> Modulo
    */

    var suma = 5 + 5
    println(suma)
    var resta = 5 - 5
    println(resta)
    var multiplicacion = 5 * 5
    println(multiplicacion)
    var division = 10 / 2
    println(division)
    var modulo = 144 % 2
    println(modulo)

    /* Operadores  de comparacion
    ==: Igualdad
    !=: Desigualdad
    <: Menor que
    <=: Menor o igual que
    >: Mayor que
    >=: Mayor o igual que
    */

    var numero1 = 10
    var numero2 = 20

    val sonIguales = numero1 == numero2
    println(sonIguales)

    val numero1EsMenor = numero1 < numero2
    println(numero1EsMenor)
}


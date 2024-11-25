package KOTLIN

import java.util.Scanner

/*/ Estructuras Condicionales
if -> Permite ejecutar un bloque de código si una condicion es verdadera
when -> Similar a un switch-case en otros lenguajes, pero mas versatil y poderoso. Define una expresion condicional con multiples ramificaciones
else -> La rama else, se evalua si no se cumple ninguna condicion.
*/

/* IF, ELSE

if (expresion) {
    Acciones si la expresion se cumple
}else if (expresion2) {
    Acciones si la expresion se cumple
} else {
    Acciones si nada se cumple
}

EJEMPLO:

fun main() {
    val level = 12

    if (level >= 45) {
        println("Aprendiste acrobacia!")
    } else {
        println("Ser requiere nivel 45. Nivel actual $level")
    }
}

// OUTPUT: Se requiere nivel 45. Nivel actual 12

EJEMPLO:

fun main() {
    val enemyHeroHealth = 16

    val cardAttack: Int
    if (enemyHeroHealth <= 15) {
        cardAttack = 9
    } else {
        cardAttack = 6
    }

    println("Ataque: $cardAttack")
}

El anterior uso del if como sentencia puede ser rescrito con la siguiente expresion:
val cardAttack = if (enemyHeroHealt <= 15) 9 else 6

De esta forma mejoras la legibilidad para un if cuyo propósito es muy simple para la sintaxis tradicional.

fun main() {
    val enemyHeroHealth = 16
    val cardAttack = if (enemyHeroHealth <= 15) 9 else 6

    println("Ataque:$cardAttack")
}

*/

/* WHEN

when se puede utilizar como una declaración con o sin rama else. Si se utiliza como una declaración, los valores de todas las ramas individuales se comparan secuencialmente con el argumento y se ejecuta la rama correspondiente donde la condición coincide. Si ninguna de las ramas cumple con la condición, se ejecutará la rama else.

fun main() {
    print("Introduce tu nombre de usuario: ")
    var name = readln()!!.toString()

    when (name) {
        "Fran" -> print("Hola Fran!")
        "Lucas" -> print("Hola Lucas!")
        "Bryant Mayers" -> print("Hola Bryant Mayers!")
        else -> println("Si no te llamas de ninguna de las maneras, eres un sucio!")
    }
}

Lo podemos poner directamente que se almacene en una variable

var month= when(monthOfYear) {
        1->"January"
        2->"February"
        3->"March"
        4->"April"
        5->"May"
        6->"June"
        7->"July"
        8->"August"
        9->"September"
        10->"October"
        11->"November"
        12->"December"
        else-> "Not a month of year"
    }
    print(month)

La rama else es imprescindible sino dara error
Error:(6, 17) Kotlin: 'when' expression must be exhaustive, add necessary 'else' branch
"Error: (6, 17) Kotlin: la expresión 'when' debe ser exhaustiva, agregue la rama 'else' necesaria"

Tambien podemos combinar varias ramas en una sola:

fun main() {
    print("Enter name of the planet: ")
    val name = readln()!!.toString()
    when (name) {
        "Mercury","Earth","Mars","Jupiter",
        "Neptune","Saturn","Venus","Uranus" -> print("This is a planet")
        else -> print("This not a planet")
    }
}

Tambien podemos comprobar si un valor esta dentro del rango.

fun main() {
    print("Enter the month number of year: ")
    val number = readln()!!.toInt()
    when (number) {
        in 1..3 -> print("Spring season")
        in 4..6 -> print("Summer season")
        in 7..8 -> print("Rainy season")
        in 9..10 -> print("Autumn season")
        in 11..12 -> print("Winter season")
        !in 1..12 -> print("Enter valid month of year")
    }
}

Funciona tambien por si queremos comprobar si una variables es de un tipo u otro.

fun main() {
    var num: Any = "GeeksforGeeks"
    when (num) {
        is Int -> println("It is an Integer")
        is String -> println("It is a String")
        is Double -> println("It is a Double")
    }
}

*/


/* EJERCICIO: Juego de ataque de cartas basado en condiciones
Descripción:
Eres un jugador que tiene que atacar a diferentes enemigos usando cartas. Cada enemigo tiene una cantidad de vida, y tu carta puede hacer más o menos daño dependiendo del nivel de salud del enemigo. Además, puedes elegir el tipo de carta que deseas jugar: física, mágica o especial. El programa calculará el daño basado en la salud del enemigo y el tipo de carta que elijas.

Objetivo:
Implementa un programa en Kotlin que permita:

Leer la salud de un enemigo.
Escoger el tipo de carta que se usará para el ataque (física, mágica o especial).
Aplicar un sistema condicional if para calcular el daño basado en la salud del enemigo.
Utilizar when para elegir el tipo de carta y aplicar un multiplicador de daño basado en el tipo de carta.

Instrucciones:
Si la salud del enemigo es mayor a 50, la carta hace 15 puntos de daño.
Si la salud del enemigo está entre 20 y 50, la carta hace 10 puntos de daño.
Si la salud del enemigo es menor o igual a 20, la carta hace 5 puntos de daño.
Si el enemigo tiene 0 de salud, se debe mostrar que ya está derrotado.

El multiplicador de daño varía según el tipo de carta:
Carta física: multiplicador de 1x.
Carta mágica: multiplicador de 1.5x.
Carta especial: multiplicador de 2x.
Finalmente, muestra el daño final infligido al enemigo.
*/
fun main() {
    val SCANNER: Scanner = Scanner(System.`in`)

    // Leer la salud de un enemigo.
    print("Introduce la salud del enemigo: ")
    var saludEnemigo = SCANNER.nextInt()

    if (saludEnemigo <= 0) {
        println("El enemigo ya ha sido derrotado!")
        return
    }

    // Escoger el tipo de carta que usara para el ataque
    println("Introduce el tipo de carta que vas a usar para atacar!")
    val tipoCarta = SCANNER.nextInt()

    val multiplicador = when (tipoCarta) {
        1 -> 1F // Carta Fiscia
        2 -> 1.5F // Carta Magica
        3 -> 2F // Carta Especial
        else -> {
            println("Introduce un valor valido para el tipo de carta!")
            return
        }
    }

    // Determinar el daño base segun la salud del enemigo
    val dañoBase = when {
        saludEnemigo > 50 -> 15
        saludEnemigo in 20..50 -> 10
        else -> 5
    }

    // Calcuar el daño totla aplicando el multiplicador
    val dañoTotal = (dañoBase * multiplicador).toInt()

    // Aplicar el daño a la salud del enemigo
    saludEnemigo -= dañoTotal

    // Verificamos si el enemigo ha sido derrotado
    if ( saludEnemigo <= 0) {
        println("Has derrotado al enemigo!")
    } else {
        println("La salud restante del enemigo es: $saludEnemigo")
    }
}
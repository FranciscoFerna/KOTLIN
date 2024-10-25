package RETOS_PROGRAMACION

/*
 * ¿Preparad@ para aprender o repasar el lenguaje de programación que tú quieras?
 * - Recuerda que todas las instrucciones de participación están en el
 *   repositorio de GitHub.
 *
 * Lo primero... ¿Ya has elegido un lenguaje?
 * - No todos son iguales, pero sus fundamentos suelen ser comunes.
 * - Este primer reto te servirá para familiarizarte con la forma de participar
 *   enviando tus propias soluciones.
 *
 * EJERCICIO:
 * - Crea un comentario en el código y coloca la URL del sitio web oficial del
 *   lenguaje de programación que has seleccionado.
 * - Representa las diferentes sintaxis que existen de crear comentarios
 *   en el lenguaje (en una línea, varias...).
 * - Crea una variable (y una constante si el lenguaje lo soporta).
 * - Crea variables representando todos los tipos de datos primitivos
 *   del lenguaje (cadenas de texto, enteros, booleanos...).
 * - Imprime por terminal el texto: "¡Hola, [y el nombre de tu lenguaje]!"
 *
 * ¿Fácil? No te preocupes, recuerda que esta es una ruta de estudio y
 * debemos comenzar por el principio.
 */

fun main() {
    // https://kotlinlang.org/ -> URL Kotlin

    /*
    Comentario de bloque
    */

    var variable: Int
    val CONSTANTE: Int

    // Tipos Enteros
    var level: Byte = 50
    var health: Short = 150
    var missionPoints: Int = 40000
    var experience: Long = 45121365412
    var monsterExecuted = 9990001522L // La 'L' especifica al tipo Long

    // Números Reales
    var attackSpeed: Float = 0.5f
    var dodgeChance: Double = 0.2

    // Literales reales
    val exp1 = 3.211e2
    val exp2 = .0001e10
    val exp3 = 48e5
    val exp4 = 10e-4

    // Caracteres
    var response: Char = 'Y'


    /* Caracteres De Escape
    \t: Tabulación
    \b: Retroceso
    \r: Retorno de carro
    \n: Salto de línea
    \': Apostrofe
    \": Comilla doble
    \\: Backslash
    \$: Símbolo de dólar
    \u+XXXX: Símbolo Unicode con 4 dígitos hexadecimales
    */

    // Boolean
    var gloablMapEnable: Boolean = true

    print("Hello, Kotlin!")
}


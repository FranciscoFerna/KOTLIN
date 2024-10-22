package M3_APUNTES/*
Hi ha dos mètodes per imprimir informació per pantalla:
print() - La comanda print imprimeix per pantalla
println() - En canvi, println imprimeix per pantalla i afegeix un salt de línia al final

EXEMPLE:

fun main() {
    println("Prova 1")
    println("Prova 2")
    print("Prova 3")
    print("Prova 4")
}

Un programa pot manipular i processar dades
Tipus de dades simples (primitives):
Nombres enters (Int)
Nombres reals o decimals (Double, Float)
Verdader o fals, booleà (Boolean)
Lletres o caràcters (Char)

Valor numèric, positiu o negatiu, sense cap decimal.
35
203920
0
-3222
Identificador: Int
Utilitza 32 bits de memòria, per tant, pot emmagatzemar nombres en el rang -2.147.483.648 a 2.147.483.647 (-2^31 to 2^31-1)
Si necessitem nombres més grans, podem utilitzar Long, amb 64 bits.

EXEMPLE:
fun main() {
    // Escriu el número 6
    println(6)
}

Suma
4 + 5
Resta
6 - 3
Multiplicació
4 * 6
Divisió (entera)
11 / 2
Mòdul (residu)
11 % 2

Podem usar operacions encadenades usant parèntesis
(33 + 4) * (3 - 9)
Les prioritats entre operacions són les mateixes que en les matemàtiques convencionals.
2 * 3 + 4 = 4 + 2 * 3 = 10
En cas d'empat, es resolen d'esquerra a dreta.
5 * 3 / 4 ≠ 3 / 4 * 5

Recomanació: En cas de dubte…  feu servir parèntesis

EXEMPLE:
fun main() {
    // Escriu la suma de 6 més 4
    println(6+4)
}

Que es una variable? -> Contenidor (caixa) on podem guardar temporalment una dada
                        En l'àmbit de l’ordinador és un espai al sistema d’emmagatzematge

Abans de poder utilitzar una variable s'ha de declarar
Per declarar una variable hem de definir:
Utilitzar la paraula clau var
Identificador (o nom)
Tipus de dada a guardar
També podem assignar-li un valor inicial (o no).

Kotlin té una característica que el seu predecessor Java no tenia, la inferència de tipus

Aquesta propietat fa que, si en el moment de declarar una variable la inicialitzes amb un valor, ja no cal que l’indiquis de quin tipus és aquella variable

En cas que no vulguis inicialitzar la variable, sí que hauràs d’indicar de quin tipus és

fun main() {
    var number: Int 		// Estic declarant la variable
    number = 6         	// Aquí li dono un valor a la variable
    var typeInfered = 10  // Puc declarar i inicialitzar alhora
    // En el cas de typeInfered el tipus és inferit
    var allOptions: Int = 4 	// Puc posar tota la informació
    var mistery     			// Aquest exemple és incorrecte
}

A Kotlin també existeixen unes variables que són de només lectura
Aquestes variables utilitzen la paraula clau val
El seu valor no pot canviar en cap moment de l’execució

fun main() {
    val a: Int = 1  // Declaració formal completa
    val b = 2       // El tipus Int és inferit
    val c: Int      // Es requereix indicar tipus si no s'inicialitza
    c = 3           // Es pot inicialitzar després de declarar-la
    c = 4           // Aquesta instrucció és incorrecta
}

L’identificador d’una variable ha de ser significatiu. Això vol dir que ha de descriure el valor que representa.
Guia d’estil:
    lowerCamelCase
Primer caràcter en minúscula
La primera lletra de cada paraula en Majúscula
Exemples:
    yearOfBirth, dayOfMonth, boxNumber, age

fun main() {
    val firstValue = 6
    val secondValue = 4
    val totalValue = firstValue + secondValue
    println(totalValue) // Que ens retornarà el print?
}
*/

/* ENUNCIADO
Declara tres variables que representen números enteros (Int) y asígnales valores.
Crea una variable que contenga la suma de estos tres números.
Declara una variable de sólo lectura (val) que represente el residuo (módulo) de dividir el primer número por el segundo.
Crea una operación más compleja donde multipliques la suma de los tres números por la resta del segundo y tercer número.
Utiliza tanto print() como println() para mostrar los resultados, observando las diferencias.
Asegúrate de seguir la guía de estilo lowerCamelCase al nombrar las variables.

*/
// La funcion main es on ficarem totes les instruccions d'un programa ( de moment )
// args -> es el lloc on vindran els arguments del programa
fun main(args: Array<String>) {
    // Declarar tres variables enteras
    var primerNumero = 15
    var segonNumero = 7
    var tercerNumero = 4

    // Sumar los tres números y guardarlo en una nueva variable
    var sumaTotal = primerNumero + segonNumero + tercerNumero

    // Variable de sólo lectura para el residuo (módulo) de dividir el primer número entre el segundo
    val residuModul = primerNumero % segonNumero

    // Crear una operación compleja: (sumaTotal * (segonNumero - tercerNumero))
    var resultatComplex = sumaTotal * (segonNumero - tercerNumero)

    // Imprimir resultados utilizando print() y println()
    println("La suma dels números és: $sumaTotal")
    print("El residu (mòdul) de dividir $primerNumero per $segonNumero és: ")
    println(residuModul)
    println("El resultat de l'operació complexa (sumaTotal * (segonNumero - tercerNumero)) és: $resultatComplex")

    // Mostrar una operación adicional con paréntesis para ilustrar la prioridad de operaciones
    val operacioPrioritat = (primerNumero + segonNumero) * tercerNumero
    println("El resultat de l'operació amb parèntesis ((primerNumero + segonNumero) * tercerNumero) és: $operacioPrioritat")
}
import java.util.Scanner

/* Bucle FOR

El bucle for en Kotlin  se utiliza para iterar sobre un rango, una coleccion o una secuencia. Este bucle se repite el bloque de codigo un numero de veces conocido de antemano

for (variable in rango) {
    // Codigo a ejecutar
}

EJEMPLO:
fun main() {
    for (i in 1..5) {
        println(i)
    }
}

El bucle recorre  el rango 1..5, imprimiendo todos los numeros del 1 al 5

Modificadores:
step -> permite saltar elementos
downTo -> permite iterar hacia atras
until -> excluye el ultimo valor

for (i in 10 downTo 1 step 2) {
    println(i)
}
*/

/* Bucle WHILE

El bucle while se ejecuta mientras una condicion sea verdadera. Si la condicion es falsa desde el principio no se ejecutara.

while (condicion) {
    // Codigo a ejecutar mientras la condicion sea verdadera
}

EJEMPLO:
fun main(){
    var i = 1
    while (i > 5) {
        print(i)
        i++
    }
}

El bucle imprime los números del 1 al 5 mientras la condición i <= 5 sea verdadera.
*/

/* Bucle DO-WHILE
El bucle do-while es similar a while, pero la principal diferencia es que siempre ejecuta el bloque de código al menos una vez, ya que la condición se evalúa después de ejecutar el bloque.

do {
    // Codigo a ejecutar
} while (condicion)

EJEMPLO:
fun main() {
    var i = 1
    do {
        println(i)
        i++
    } while (i >= 5)
}
Imprime los números del 1 al 5, y aunque i fuera 6 al inicio, se ejecutaría al menos una vez.
*/

/* Bucle REPEAT
El bucle repeat es una forma más concisa de ejecutar un bloque de código un número fijo de veces.

repeat (numero) {
    // Codigo a ejecutar
}

fun main() {
    repeat(5) {
        println("Hola")
    }
}
Imprime la palabra "Hola" 5 veces.
*/

/*
En realidad, no existe un bucle llamado do de forma aislada en Kotlin. El único bucle do es el del tipo do-while. Si te refieres al bloque do dentro de un contexto de control de flujo (como en manejo de excepciones), ese es otro uso, pero no es un bucle.
*/


/*
Ejercicio:
Escribe un programa en Kotlin que realice lo siguiente:

Pida al usuario un número entero positivo.
Con ese número, realiza las siguientes operaciones utilizando diferentes tipos de bucles:
Bucle for: Sumar todos los números del 1 al número ingresado.
Bucle while: Contar cuántos números pares hay entre el 1 y el número ingresado.
Bucle do-while: Imprimir los números impares entre 1 y el número ingresado.
Bucle repeat: Imprimir el mensaje "Bucle repetido" tantas veces como el número ingresado.

Requisitos:
- El número ingresado debe ser mayor que 0. Si no lo es, vuelve a pedirlo.
- Usa diferentes tipos de bucles para cada operación.

Ejemplo de salida esperada:
Introduce un número entero positivo: 5

Suma de los números del 1 al 5: 15
Cantidad de números pares entre 1 y 5: 2
Números impares entre 1 y 5:
1
3
5
Bucle repetido
Bucle repetido
Bucle repetido
Bucle repetido
Bucle repetido
*/
fun main() {
    val SCANNER:Scanner = Scanner(System.`in`)

    print("Introduce un numero entero positivo: ")
    var numero: Int = SCANNER.nextInt()
    var suma: Int = 0

    // Bucle for: Sumar todos los números del 1 al número ingresado.
    for (i in 1..numero) {
        suma += i
    }
    println(suma)

    // Bucle while: Contar cuántos números pares hay entre el 1 y el número ingresado.
    var numerosPares: Int = 0
    var contador: Int = 1
    while (contador <= numero) {
        if (contador % 2 == 0) {
            numerosPares++
        }
        contador++
    }
    println("La cantidad de numeros pares que hay entre 1 y $numero son: $numerosPares")

    // Bucle do-while: Imprimir los números impares entre 1 y el número ingresado.
    // A la variable impares le asignamos 1 ya que el do-while como minimo se ejecutara una vez
    println("Los numeros impares entre 1 y $numero: ")
    var numeroImpar: Int = 1
    do {
        if (numeroImpar % 2 !=0) {
            println(numeroImpar)
        }
        numeroImpar++
    } while (numeroImpar <= numero) // Se ejecuta mientras que numeroImpar sea mas pequeño o igual a numero en el momento en el que ya no se cumpla saldra del bucle

    // Bucle repeat: Imprimir el mensaje "Bucle repetido" tantas veces como el número ingresado.
    repeat(numero) {
        println("Bucle repetido")
    }
}

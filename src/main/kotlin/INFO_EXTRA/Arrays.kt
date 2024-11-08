package INFO_EXTRA

/*¿Qué son los Arrays en Kotlin? */


// Un array es como una lista ordenada donde guardas varios datos relacionados y del mismo tipo bajo un solo nombre.


fun main(args: Array<String>) {
    val rainbowColors = arrayOf("Rojo", "Naranja", "Azul", "Rosa", "Lila", "Amarillo", "Violeta")
    // Un array es como una lista ordenada donde guardas varios datos relacionados y del mismo tipo bajo un solo nombre.

    // Accediendo por indice
    println("El primer color es: " + rainbowColors[0])
    println("El segundo color es: " + rainbowColors[1])
    println("El tercero color es: " + rainbowColors[2])

    // Usando get()
    val firstColor = rainbowColors.get(0)
    println("El primer color es $firstColor")


    // Modificiar un elemento utilizando su indice
    println(rainbowColors.get(5))
    rainbowColors[5] = "AzulPistacho"
    println("El ultimo elemento despues de modificarlo es ${rainbowColors.get(5)}")

    // si intentas acceder a una posición fuera del rango del array, obtendrás una excepción ArrayIndexOutOfBoundsException.

    // Comprobando el tamaño de la array
    if (rainbowColors.size > 5 ) {
        println(rainbowColors[5])
    } else {
        println("La array no tiene suficientes elementos")
    }

    // Podemos usar directamente .size()
    println("El tamaño del array es: ${rainbowColors.size}")

    // Otra manera seria el getOrNull()
    val color = rainbowColors.getOrNull(7)
    if  (color != null) {
        println(color)
    } else {
        println("La array no tiene suficiente elementos")
    }


    // Modificando valores dentro de la array
    // Cuando el array ya esté creado, puedes modificar sus valores con la función set() o directamente asignando un valor al índice.
    rainbowColors[0] = "Purple"
    rainbowColors.set(3, "Black")
    println(rainbowColors.joinToString())
    // Gracias a este cambio se modificó el array sin necesidad de crear uno nuevo, siempre y cuando los valores sean del mismo tipo.

    // ¿Cómo recorrer un Array en Kotlin?
    for (color in rainbowColors) {
        println(color)
    }

    // En caso de necesitar el indice hariamos esto:
    for (index in rainbowColors.indices) {
        println("Indice $index: ${rainbowColors[index]}")
    }

    // Otra forma que también te sirve para acceder tanto al índice como al valor es con withIndex():
    for ((index, color) in rainbowColors.withIndex()) {
        println("Posicion: $index Color: $color")
    }

    // Inicialización de Arrays con valores predeterminados
    val number = Array(5) {0}
    println(number.joinToString()) // Imprime: 0, 0, 0, 0, 0

    // Array con tipos primitivos:

    /*
    IntArray para enteros.
    DoubleArray para números de punto flotante.
    CharArray para caracteres.
    BooleanArray para valores booleanos.
    */

    val intArray = intArrayOf(1, 2, 3, 4, 5)
    println(intArray.joinToString()) // Imprime: 1, 2, 3, 4, 5

    // Uso de funciones de orden superior en Arrays:
    // Usando map para transformar elementos
    val squaredNumbers = intArray.map { it * it }
    println(squaredNumbers.joinToString()) // Imprime: 1, 4, 9, 16, 25

    // Usando filtrer para filtrar los elementos
    val evenNumbers = intArray.filter { it % 2 == 0 }
    println(evenNumbers.joinToString()) // Imprime: 2, 4

    // Usando forEach para recorrer y aplicar una acción
    rainbowColors.forEach { color -> println("Color: $color") }

    // Array de Arrays:
    val matrix = arrayOf(
        arrayOf(1, 2, 3),
        arrayOf(4, 5, 6),
        arrayOf(7, 8, 9)
    )
    println(matrix[0][1]) // Imprime: 2 (primer array, segundo elemento)

    // Comparación de Arrays:
    val array1 = arrayOf(1, 2, 3)
    val array2 = arrayOf(1, 2, 3)

    println(array1 == array2) // true (compara el contenido)
    println(array1 === array2) // false (compara la identidad, ya que son arrays distintos)

    // Conversión entre Listas y Arrays:
    // Convertir Array en Lista:
    val colorList = rainbowColors.toList()
    println(colorList)

    // Convertir Lista en Array:
    val newArray = colorList.toTypedArray()
    println(newArray.joinToString())

    // Arrays en Kotlin y Null Safety:
    val nullableArray = arrayOfNulls<String>(3) // Array de Strings que puede contener valores nulos
    nullableArray[0] = "Rojo"
    nullableArray[1] = null
    println(nullableArray[1] ?: "Elemento nulo") // Usando el operador Elvis para manejar nulls

    // Funciones copyOf() y copyOfRange():
    // Usando copyOf() para copiar todo el array
    val rainbowCopy = rainbowColors.copyOf()
    println(rainbowCopy.joinToString())

    // Usando copyOfRange() para copiar un rango en especifico
    val rangeCopy = rainbowColors.copyOfRange(1, 4)
    println(rangeCopy.joinToString())

    // Operadores para Array:
    val newColors = rainbowColors + "Turquesa"
    println(newColors.joinToString()) // Imprime: Purple, Naranja, Azul, Black, Lila, AzulPistacho, Violeta, Turquesa


    // Array de longitud dinámica: ArrayList:
    val dynamicArray = arrayListOf("Rojo", "Naranja", "Azul")
    dynamicArray.add("Rosa")
    println(dynamicArray.joinToString()) // Imprime: Rojo, Naranja, Azul, Rosa
}

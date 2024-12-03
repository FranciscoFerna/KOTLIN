package KOTLIN.EJERCICIOS.tipos_datos

import KOTLIN.SCANNER


fun main() {
    val MAXIMO_HORAS: Float = 40.toFloat()
    print("Bienvenido! Por favor introduce las horas que usted ha trabajado: ")
    val horasTrabajadas: Float = SCANNER.nextInt().toFloat()
    print("Por favor introduce cuanto te pagan por hora trabajada: ")
    val pagoHora: Float = SCANNER.nextFloat()

    val horasExtras: Float = horasTrabajadas - MAXIMO_HORAS

    val sueldo = if (horasTrabajadas < 40) {
        horasTrabajadas * pagoHora
    } else {
        (horasTrabajadas * pagoHora) + (horasExtras * 1.5)
    }

    println("Su sueldo seria segun $horasTrabajadas horas trabajadas, y un pago de $pagoHora euros la hora. Su sueldo es de: $sueldo euros!")
}
package com.binarydodo.androidmaster.sintaxis

fun main() {
    print(getSemetre(2))
}

fun resultado(value: Any) {
    when(value){
        is Int -> print(value + value)
        is String -> println(value)
        is Boolean -> if(value == true) print("Hola")
    }
}

/**
 * Ejemplo de rangos en el when
 */
fun getSemetre(month: Int):String = when (month) {
        in 1..6 -> "Primer semestre"
        in 7..12 -> "Segundo semestre"
        !in 1..12 -> "Semestre no valido"// Negación si no está en el rango indicado
        else -> "Semestre no valido"
    }


fun getTrimester(month: Int) {
    getMonth(month)
    when (month) {
        1, 2, 3 -> println("Primer trimestre")
        4, 5, 6 -> println("Segundo trimestre")
        7, 8, 9 -> println("Tercer trimestre")
        10, 11, 12 -> println("Cuarto trimestre")
        else -> println("Trimestre no valido")
    }
}

fun getMonth(month: Int) {
    when (month) {
        1 -> println("enero")
        2 -> println("febreo")
        3 -> println("marzo")
        4 -> println("abril")
        5 -> println("mayo")
        6 -> println("junio")
        7 -> println("julio")
        8 -> println("agosto")
        9 -> println("septiembre")
        10 -> println("octubre")
        11 -> println("noviembre")
        12 -> println("diciembre")
        else -> println("No es un mes valido")

    }


}
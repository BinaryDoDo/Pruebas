package com.binarydodo.androidmaster.sintaxis

fun main() {
//    inmutableList()
    mutableList()

}

fun mutableList() {

    var weekDays:MutableList<String> = mutableListOf("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo")
    weekDays.add(3,"DavidDays") //En el add puedes poner un indice para que se añada en esa posición
    println(weekDays)
    

    if (weekDays.isNotEmpty()){
        weekDays.forEach{ weekDay -> println(weekDay)}
    }
}

fun inmutableList() {

    val readOnly: List<String> =
        listOf("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo")

    println(readOnly.size)
    println(readOnly)// Esto llama al toString de la lista
    println(readOnly[0])
    println(readOnly.last())
    println(readOnly.first())

    //Filtrar
    val example = readOnly.filter { it.contains("a") } //Sensible a mayusculas y minusculas
    println(example)

    //For each
    readOnly.forEach { weekDay -> println(weekDay) }
}


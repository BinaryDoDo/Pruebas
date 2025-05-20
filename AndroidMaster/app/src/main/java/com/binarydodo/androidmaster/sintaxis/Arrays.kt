package com.binarydodo.androidmaster.sintaxis

fun main(){
    val weekDays = arrayOf("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo")

    println(weekDays.size)

    if(weekDays.size >= 8) {
        println(weekDays[7])
    }else{
        println("No hay más días de la semana")
    }

    //Bucles para Arrays

    //For 1
    for(i in weekDays.indices){
        println(weekDays[i])
    }

    //For 2
    for((position, value) in weekDays.withIndex()){
        println("La posoción $position, contiene $value")
    }

    //For 3
    for (i in weekDays){
        println("Ahora es $i")
    }
}
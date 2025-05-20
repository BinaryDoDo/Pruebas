package com.binarydodo.androidmaster.sintaxis

fun main(){

    //ifBasico()
    //ifAnidado()
    //ifBoolean()
    //ifMultiple()
    ifMultipleOr()
}

fun ifMultipleOr(){
    var pet = "cat"
    var isHappy = true

    if (pet == "dog" || (pet == "cat" && isHappy == true)){
        println("es un gato o un perro")
    }else{
        println("No es un gato ni un perro")
    }
}

fun ifMultiple(){
    var age = 18
    var parentPermission = true
    var imHappy = true

    if(age >= 18 && parentPermission && imHappy){
        println("Bebe cerveza")
    }else{
        println("Bebe jugo")
    }

}

fun ifBoolean(){
    var soyFeliz:Boolean = false

    if(soyFeliz){
        println("Estoy feliz")
    }else{
        println("Estoy triste")
    }
}

fun ifAnidado(){
    val animal = "cat"

    if (animal == "dog"){
        println("Es un perrito")
    }else if(animal == "cat"){
        println("Es un gato")
    }else if(animal == "bird"){
        println("Es un pajaro")
    }else{
        println("No es uno de los animales esperados")
    }
}

fun ifBasico(){

    val name = "Pablo"

    if(name == "Aris"){
        println("Oye, la variable name es Aris")
    }else{
        println("La variable name es $name")
    }
}
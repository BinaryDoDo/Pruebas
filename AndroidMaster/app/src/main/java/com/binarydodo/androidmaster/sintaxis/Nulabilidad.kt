package com.binarydodo.androidmaster.sintaxis

fun main(){
    var name: String? = "David"
    print(name?.get(3) ?: "Es nulo")
}
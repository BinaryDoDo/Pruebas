package com.binarydodo.androidmaster.sintaxis

/**
 * Las constantes se definen con val (Valor)
 * Las variables se definen von var (Variable)
 */

fun main() {

    variablesNumericas()

    /**
     * VARIABLES Alfanuméricas
     */

    //Char
    val charExample1: Char = 'e'
    val charExample2: Char = '2'
    val charExample3: Char = '@'

    //String
    val stringExample: String = "David"

    // Para enseñar con un println una concat de un string más una variable se utiliza $

    var stringConcatenada = "Hola soy"

    println("Ejemplos de concat en Kotlin: $stringConcatenada $stringExample")

    /**
     * VARIABLES Booleanas
     */


    //Boolean
    val booleanExample: Boolean = true
    val booleanExample2: Boolean = false

}

fun variablesNumericas() {
    /**
     * VARIABLES Numéricas
     */

    //Int
    val age: Int = 30
    var age2: Int = 30

    //Long
    val exampleLong: Long = 30

    //Float
    val exampleFloat: Float = 30.5f

    //Double

    val exampleDouble: Double = 3056.3465

    println(age)
}
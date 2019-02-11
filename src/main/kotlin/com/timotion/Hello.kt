package com.timotion

fun main(args: Array<String>) {
//    println("Hello world")
//    Human().hello();
    var h = Human()
    h.hello()
}

class Human{
    fun hello(){
        println("Hello kotlin");
    }
}
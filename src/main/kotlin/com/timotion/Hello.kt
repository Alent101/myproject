package com.timotion

fun main(args: Array<String>) {
//    println("Hello world")
//    Human().hello();
    // command + / 快速註解
    var h = Human()
    h.hello()
    // var 可改變值 val 不可改變值
    var age = 19;
    var name:String = "Alent";
}

class Human{
    fun hello(){
        println("Hello kotlin");
    }
}
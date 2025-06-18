package com.carlosmiguel.learncompose.state

data class Test2(
    val id: String
)

class Test3(
    val id: String
){}

fun showHola(){
    val test = Test2("Hola")
    val test3 = Test3("Hola")

    test.toString()
    test3.toString()

}
package com.example.myapplication.project

fun main() {
    var score1 : Int? = null
    println(score1?.plus(4))

    score1 = 4

    println(score1?.plus(4))
}
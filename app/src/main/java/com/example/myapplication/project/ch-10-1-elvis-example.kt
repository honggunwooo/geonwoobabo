package com.example.myapplication.project

fun main() {
    var score: Int? = null
    println("내 점수는 ${score ?: 0}이야 ")

    score = 100
    println("내 점수는 ${score ?: 0}이야")
}
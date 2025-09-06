package com.example.myapplication.project

enum class Fruite{
    BNANA, APPLE
}

enum class Transport{
    BUS, CAR, BIKE
}
fun main(){
    val myWay: Transport = Transport.BUS
    println("오늘은 ${myWay}를 탔다")

    val myWay2 = "BUS"
    println("오늘은 ${myWay2}를 탔다")

    when(myWay){
        Transport.BUS -> {println("myWay bus")}
        Transport.CAR -> {println("myWay car")}
        Transport.BIKE -> {println("myWay bike")}
    }

    when(myWay2){
        "BUS" -> {println("myWay2 bus")}
        "CAR" -> {println("myWay2 car")}
        "BIKE" -> {println("myWay2 bike")}
    }
}
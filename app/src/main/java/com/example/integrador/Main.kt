package com.example.integrador
import java.util.*

fun main() {

    var vehicleList: MutableList<Vehicle> = mutableListOf()
    val car = Vehicle("123ABC", VehicleType.CAR, Calendar.getInstance(), "123456" )
    val moto = Vehicle("111ABC", VehicleType.MOTORCYCLE, Calendar.getInstance(),  )
    val minibus = Vehicle("222ABC", VehicleType.MINIBUS, Calendar.getInstance(), "123456" )
    val bus = Vehicle("333ABC", VehicleType.BUS, Calendar.getInstance(),)
    val car2 = Vehicle("123AAA", VehicleType.CAR, Calendar.getInstance(), "123456" )
    val car3 = Vehicle("123BBB", VehicleType.CAR, Calendar.getInstance(), "123456" )
    val car4 = Vehicle("123CCC", VehicleType.CAR, Calendar.getInstance(), "123456" )

    val parking = Parking(mutableSetOf(), 4)

    vehicleList.addAll(listOf(car, moto, minibus, bus, car2, car3))
    vehicleList.forEach<Vehicle>( parking::addVehicle )

    println(parking.vehicles.contains(car)) //true
    println(parking.vehicles.contains(moto)) //true
    println(parking.vehicles.contains(minibus)) //true
    println(parking.vehicles.contains(bus)) //true
    println(parking.vehicles.contains(car2)) //false

}
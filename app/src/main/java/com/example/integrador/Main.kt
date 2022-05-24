package com.example.integrador
import java.util.*

fun main() {

    val car = Vehicle("123ABC", VehicleType.CAR, Calendar.getInstance(), "123456" )
    val moto = Vehicle("123ABC", VehicleType.MOTORCYCLE, Calendar.getInstance(),  )
    val minibus = Vehicle("222ABC", VehicleType.MINIBUS, Calendar.getInstance(), "123456" )
    val bus = Vehicle("333ABC", VehicleType.BUS, Calendar.getInstance(),  )

    val parking = Parking(mutableSetOf(car, ))
    parking.vehicles.add(moto)

    println(car.plate)
    println(moto.plate)

    println(parking.vehicles.contains(car))
    println(parking.vehicles.contains(moto))
    println(parking.vehicles.contains(minibus))
    println(parking.vehicles.contains(bus))


}
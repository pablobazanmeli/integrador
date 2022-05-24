package com.example.integrador
import java.util.*

fun main() {

    val car = Vehicle("123ABC", VehicleType.CAR, Calendar.getInstance(), "123456" )
    val moto = Vehicle("111ABC", VehicleType.MOTORCYCLE, Calendar.getInstance(),  )
    val minibus = Vehicle("222ABC", VehicleType.MINIBUS, Calendar.getInstance(), "123456" )
    val bus = Vehicle("333ABC", VehicleType.BUS, Calendar.getInstance(),  )

    val parking = Parking(mutableSetOf(car, moto,), 4)

    val car2 = Vehicle("123AAA", VehicleType.CAR, Calendar.getInstance(), "123456" )
    val car3 = Vehicle("123BBB", VehicleType.CAR, Calendar.getInstance(), "123456" )
    val car4 = Vehicle("123CCC", VehicleType.CAR, Calendar.getInstance(), "123456" )


    parking.addVehicle(car2)
    parking.addVehicle(car3)

//    println(parking.vehicles.remove(car2))
//
//    println(parking.vehicles.contains(car)) //true
//    println(parking.vehicles.contains(moto)) //true
//    println(parking.vehicles.contains(minibus)) //true
//    println(parking.vehicles.contains(bus)) //true
//    println(parking.vehicles.contains(car2)) //false


}
package com.example.integrador

import java.util.*

fun main() {

    val car = Vehicle("123ABC", VehicleType.CAR, Calendar.getInstance(), "123456")
    val moto = Vehicle("111ABC", VehicleType.MOTORCYCLE, Calendar.getInstance())
    val minibus = Vehicle("222ABC", VehicleType.MINIBUS, Calendar.getInstance(), "123456")
    val bus = Vehicle("333ABC", VehicleType.BUS, Calendar.getInstance())
    val bus2 = Vehicle("333ABC", VehicleType.BUS, Calendar.getInstance())

    val parking = Parking(mutableSetOf(), 8)

    parking.addVehicle(car)
    parking.addVehicle(moto)

//    println(parking.vehicles.contains(car))
    val parkingSpace = ParkingSpace(vehicle = moto, parkedTime = 258, parking = parking)

//    parking.vehicles.remove()
    parkingSpace.checkOutVehicle(
        plate = "111ABC",
        onSuccess = {
            println("Value to be paid: $$it \nThanks you for visiting AlkeParking!")
        },
        onError = {
            println("An error has occurred")
        }
    )
}


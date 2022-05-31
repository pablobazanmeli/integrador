package com.example.integrador

import java.util.*

fun main() {

    val car = Vehicle("123ABC", VehicleType.CAR, Calendar.getInstance(), "123456")
    val moto = Vehicle("111ABC", VehicleType.MOTORCYCLE, Calendar.getInstance())
    val minibus = Vehicle("222ABC", VehicleType.MINIBUS, Calendar.getInstance(), "123456")
    val bus = Vehicle("333ABC", VehicleType.BUS, Calendar.getInstance())


    val vehicleList: MutableList<Vehicle> = mutableListOf(
        car, moto, minibus, bus,
        Vehicle("444ABC", VehicleType.BUS, Calendar.getInstance()),
        Vehicle("555ABC", VehicleType.BUS, Calendar.getInstance()),
        Vehicle("666ABC", VehicleType.BUS, Calendar.getInstance()),
        Vehicle("777ABC", VehicleType.BUS, Calendar.getInstance()),
        Vehicle("888ABC", VehicleType.BUS, Calendar.getInstance()),
        Vehicle("999ABC", VehicleType.BUS, Calendar.getInstance()),
    )

    val parking = Parking(mutableSetOf(), maxVehicle = 20)

    vehicleList.map {
        parking.addVehicle(it)
    }

    val parkingSpace = ParkingSpace(vehicle = car, parkedTime = 135, parking = parking)

    parkingSpace.checkOutVehicle(
        onSuccess = { println("Your fee is $it. Come back soon.") },
        onError = {
            println("Sorry, the check-out failed")
        }
    )

    parkingSpace.checkOutVehicle(
        plate = "111ABC",
        onSuccess = {
            println("Your fee is $$it. Come back soon.")
        },
        onError = {
            println("Sorry, the check-out failed")
        }
    )

    parking.getHistory()
    parking.listVehicles()
}

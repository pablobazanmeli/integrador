package com.example.integrador

import java.util.*

fun main() {

    val car = Vehicle("123ABC", VehicleType.CAR, Calendar.getInstance(), "123456")
    val moto = Vehicle("111ABC", VehicleType.MOTORCYCLE, Calendar.getInstance())
    val minibus = Vehicle("222ABC", VehicleType.MINIBUS, Calendar.getInstance(), "123456")
    val bus = Vehicle("333ABC", VehicleType.BUS, Calendar.getInstance())
    val parking = Parking(mutableSetOf(),)

    val vehicleList: MutableList<Vehicle> = mutableListOf(
        car, moto, minibus, bus,
        Vehicle("444ABC", VehicleType.BUS, Calendar.getInstance(), "123abc"),
        Vehicle("555ABC", VehicleType.CAR, Calendar.getInstance()),
        Vehicle("666ABC", VehicleType.MOTORCYCLE, Calendar.getInstance()),
        Vehicle("777ABC", VehicleType.BUS, Calendar.getInstance(), "123abc"),
        Vehicle("888ABC", VehicleType.MINIBUS, Calendar.getInstance()),
        Vehicle("999ABC", VehicleType.BUS, Calendar.getInstance(), "123abc"),
        Vehicle("221ABC", VehicleType.CAR, Calendar.getInstance()),
        Vehicle("223ABC", VehicleType.MOTORCYCLE, Calendar.getInstance()),
        Vehicle("224ABC", VehicleType.MINIBUS, Calendar.getInstance(), "123abc"),
        Vehicle("225ABC", VehicleType.BUS, Calendar.getInstance()),
        Vehicle("226ABC", VehicleType.CAR, Calendar.getInstance()),
        Vehicle("227ABC", VehicleType.MOTORCYCLE, Calendar.getInstance()),
        Vehicle("228ABC", VehicleType.MINIBUS, Calendar.getInstance(), "123abc"),
        Vehicle("229ABC", VehicleType.BUS, Calendar.getInstance()),
        Vehicle("321ABC", VehicleType.CAR, Calendar.getInstance()),
        Vehicle("322ABC", VehicleType.MINIBUS, Calendar.getInstance(), "123avc"),
        Vehicle("322ABC", VehicleType.MOTORCYCLE, Calendar.getInstance(), "123avc"),
        Vehicle("222ABC", VehicleType.BUS, Calendar.getInstance(), "123avc"),
    )

    //add a vehicle automatically
    vehicleList.map {
        parking.addVehicle(it)
    }
    //checkout vehicle and calculate fees if it's a success or a mistake
    parking.checkOutVehicle(car.plate, ::onSuccess, ::onError)
    parking.checkOutVehicle("444ABC", ::onSuccess, ::onError)
    parking.checkOutVehicle("777ABC", ::onSuccess, ::onError)
    parking.checkOutVehicle("777ABC", ::onSuccess, ::onError)
    parking.checkOutVehicle("555ABC", ::onSuccess, ::onError)
    parking.checkOutVehicle("666ABC", ::onSuccess, ::onError)
    parking.checkOutVehicle("888ABC", ::onSuccess, ::onError)
    parking.checkOutVehicle("881ABC", ::onSuccess, ::onError)

    //Give information on the parking's vehicles and fee totals
    parking.getHistory()

    //List of all vehicles in the parking
    parking.listVehicles()
}


fun onSuccess(fee: Int): Unit = println("Your fee is $fee. Come back soon.")
fun onError(): Unit = println("Sorry, the check-out failed")




package com.example.integrador
import java.util.*

fun main() {

    val car = Vehicle("123ABC", VehicleType.CAR, Calendar.getInstance(), "123456" )
    val moto = Vehicle("111ABC", VehicleType.MOTORCYCLE, Calendar.getInstance(),  )
    val minibus = Vehicle("222ABC", VehicleType.MINIBUS, Calendar.getInstance(), "123456" )
    val bus = Vehicle("333ABC", VehicleType.BUS, Calendar.getInstance(),)
    //val bus2 = Vehicle("333ABC", VehicleType.BUS, Calendar.getInstance(),)

    val vehicleList: MutableList<Vehicle> = mutableListOf(
        car, moto, minibus, bus,
        Vehicle("444ABC", VehicleType.BUS, Calendar.getInstance()),
        Vehicle("555ABC", VehicleType.BUS, Calendar.getInstance()),
        Vehicle("666ABC", VehicleType.BUS, Calendar.getInstance()),
        Vehicle("777ABC", VehicleType.BUS, Calendar.getInstance()),
        Vehicle("888ABC", VehicleType.BUS, Calendar.getInstance()),
        Vehicle("999ABC", VehicleType.BUS, Calendar.getInstance()),
    )



    val parking = Parking(mutableSetOf(), 8)
    vehicleList.map{
        parking.addVehicle(it)
    }


    val parkingSpace = ParkingSpace(parking.vehicles)
    parkingSpace.checkOutVehicle("444ABC", {it}, {} )


    println(parking.vehicles.contains(car)) //true
    println(parking.vehicles.contains(moto)) //true
    println(parking.vehicles.contains(minibus)) //true
    //println(parking.vehicles.contains()) //true



}



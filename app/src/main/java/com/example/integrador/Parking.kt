package com.example.integrador

data class Parking (val vehicles: MutableSet<Vehicle>, val maxVehicle: Int = 20) {

    fun addVehicle(vehicle: Vehicle) : Boolean {
        if(this.vehicles.size >= maxVehicle) {
            println("Sorry, the check-in failed")
            return false
        }
        if(this.vehicles.add(vehicle)) {
            println("Welcome to AlkeParking!")
            return true
        }

        println("Sorry, this vehicle is already in the parking")
        return false
    }

}
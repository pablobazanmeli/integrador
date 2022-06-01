package com.example.integrador

data class Parking(
    val vehicles: MutableSet<Vehicle>,
    val maxVehicle: Int = 20,
):ParkingSpace(vehicles)
{

    fun addVehicle(vehicle: Vehicle): Boolean {
        //checks if the vehicle takes place,returns a message if it enters or if not
        if (this.vehicles.size >= maxVehicle) {
            println("Sorry, the check-in failed")
            return false
        }
        if (this.vehicles.add(vehicle)) {
            println("Welcome to AlkeParking!")
            return true
        }

        println("Sorry, this vehicle is already in the parking")
        return false
    }

    fun getHistory() {
        //show the money and number of vehicles that have gone
        return println(
            "$countVehicle vehicles have checked out and have earnings of $${countFee}")
    }

    fun listVehicles(): List<String> {
        //show a list of plate in the parking
        return this.vehicles.map {
            println(it.plate)
            it.plate
        }
    }
}

package com.example.integrador

data class Parking(
    val vehicles: MutableSet<Vehicle>,
    val maxVehicle: Int = 20,
    var history: Pair<Int, Int> = Pair(0, 0))
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

    fun isInParking(plate: String): Boolean {
        return this.vehicles.any { it.plate == plate }
    }

    fun findVehicle(plate: String): Vehicle? {
        //search the vehicle by plate
        return this.vehicles.find { it.plate == plate }
    }

    fun deleteVehicle(plate: String): Boolean {
        //if the vehicle is in the parking,take it out
        if (isInParking(plate)) {
            val vehicle = findVehicle(plate)
            this.vehicles.remove(vehicle)
            return true
        }
        return false
    }

    fun addHistory(fee: Int) {
        //add the money generated and the amount of check outs
        history = Pair(history.first + fee, history.second + 1)
    }

    fun getHistory() {
        //show the money and number of vehicles that have gone
        return println(
            "${history.second} vehicles have checked out and have earnings of $${history.first}")
    }

    fun listVehicles(): List<String> {
        //show a list of plate in the parking
        return this.vehicles.map {
            println(it.plate)
            it.plate
        }
    }
}

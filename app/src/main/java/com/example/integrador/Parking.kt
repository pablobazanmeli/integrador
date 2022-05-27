package com.example.integrador

data class Parking(
    val vehicles: MutableSet<Vehicle>,
    val maxVehicle: Int = 20,
    var history: Pair<Int, Int> = Pair(0, 0)
) {

    fun addVehicle(vehicle: Vehicle): Boolean {
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

    fun deleteVehicle(plate: String): Boolean {
        if (isInParking(plate)) {
            val vehicle = findVehicle(plate)
            this.vehicles.remove(vehicle)
            return true
        }
        return false
    }

    fun findVehicle(plate: String): Vehicle? {
        return this.vehicles.find { it.plate == plate }
    }

    fun addHistory(fee: Int) {
        history = Pair(history.first + fee, history.second + 1)
    }

    fun getHistory() {
        return println("${history.second} vehicles have checked out and have earnings of $${history.first}")
    }

    fun listVehicles(): List<String> {
        return this.vehicles.map {
            println(it.plate)
            it.plate
        }
    }
}
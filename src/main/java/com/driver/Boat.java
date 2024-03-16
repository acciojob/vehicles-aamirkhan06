package com.driver;

public class Boat  implements WaterVehicle
{
//    name: String - The name of the boat.
//    capacity: int - The capacity of the boat.
//    Implement the following methods:
//
//    getVehicleName(): Returns the name of the boat.
//    getVehicleCapacity(): Returns the capacity of the boat.
    String name;
    int capacity;

    public Boat(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String getVehicleName() {
        return this.name;
    }

    @Override
    public int getVehicleCapacity() {
        return this.capacity;
    }
}

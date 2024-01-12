// Class representing a Vehicle

import java.util.ArrayList;
import java.util.List;

class Vehicle {
    private String vehicleNumber;
    private int seatingCapacity;
    private List<Trip> trips;

    // Constructor to initialize a Vehicle with a vehicle number and seating capacity
    public Vehicle(String vehicleNumber, int seatingCapacity) {
        this.vehicleNumber = vehicleNumber;
        this.seatingCapacity = seatingCapacity;
        this.trips = new ArrayList<>();
    }

    // Getter and setter methods for vehicle attributes
    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String newVehicleNumber) {
        vehicleNumber = newVehicleNumber;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public void setSeatingCapacity(int newSeatingCapacity) {
        seatingCapacity = newSeatingCapacity;
    }

    // Method to get the list of trips associated with the vehicle
    public List<Trip> getTrips() {
        return trips;
    }

    // Method to add a trip to the list of trips, if it doesn't already exist
    public void addTrip(Trip trip) {
        if (!getTrips().contains(trip)) {
            trips.add(trip);
        }
    }
}
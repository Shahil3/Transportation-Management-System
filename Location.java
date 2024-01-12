// Class representing a Location

import java.util.ArrayList;
import java.util.List;

class Location {
    private String name;
    private TransportService servicePtr;
    private List<Trip> trips;

    // Constructor to initialize a Location with a name and associated transport service
    public Location(String name, TransportService servicePtr) {
        this.name = name;
        this.servicePtr = servicePtr;
        this.trips = new ArrayList<>();
    }

    // Getter and setter methods for location attributes
    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public TransportService getServicePtr() {
        return servicePtr;
    }

    public void setServicePtr(TransportService newServicePtr) {
        servicePtr = newServicePtr;
    }

    // Method to add a trip to the location's list of trips if the pick-up location matches
    public void addTrip(Trip trip) {
        if (!trip.getPickUpLocation().equals(name)) {
            return;
        } else {
            trips.add(trip);
        }
    }
}

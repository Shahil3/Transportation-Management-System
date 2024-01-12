// Class representing a Travel Desk

import java.util.ArrayList;
import java.util.List;

class TravelDesk {
    public List<Vehicle> vehicles = new ArrayList<>();
    public List<Location> locations = new ArrayList<>();

    // Method to add a trip to the system
    public void addTrip(String vehicleNumber, int seatingCapacity, String pickUpLocation,
                        String dropLocation, int departureTime) {
        // Check if the vehicle already exists, if not, create a new one with the seating capacity
        Vehicle v1 = null;

        Trip trip = new Trip(v1, pickUpLocation, dropLocation, departureTime);

        for (Vehicle vehicle : vehicles) {
            if (vehicle.getVehicleNumber().equals(vehicleNumber)) {
                v1 = vehicle;
                break;
            }
        }

        int check1 = 0;
        if (v1 == null) {
            check1 = 1;
            v1 = new Vehicle(vehicleNumber, seatingCapacity);
            vehicles.add(v1);
            v1.addTrip(trip);
        } else {
            v1.addTrip(trip);
        }

        int check = 0;
        for (Location location : locations) {
            if (location.getName().equals(pickUpLocation)) {
                check = 1;
                if (check1 == 1) {
                    BinaryTreeNode btn = new BinaryTreeNode(departureTime, trip, null);
                    location.getServicePtr().add(btn);
                } else {
                    if (!v1.getTrips().contains(trip)) {
                        v1.addTrip(trip);
                    }
                }
            }
        }

        if (check == 0) {
            TransportService service = new TransportService(null, null);
            Location location = new Location(pickUpLocation, service);
            locations.add(location);
            service.setLocationPtr(location);
            BinaryTreeNode head = new BinaryTreeNode(departureTime, trip, null);
            service.setBSTHead(head);
        }
    }

    // Method to show trips within a specified time range for a given pick-up location
    public List<Trip> showTrips(String pickUpLocation, int afterTime, int beforeTime) {
        List<Trip> trips = new ArrayList<>();
        // Retrieve the relevant TransportService first, then iterate over the BST to find trips within a specified time range
        for (Location location : locations) {
            if (location.getName().equals(pickUpLocation)) {
                BinaryTreeNode head = location.getServicePtr().getBSTHead();
                dfs(head, trips, afterTime, beforeTime);
                return trips;
            }
        }
        return new ArrayList<>();
    }

    // Method to perform depth-first search on the BST and find trips within the specified time range
    public void dfs(BinaryTreeNode head, List<Trip> trips, int a, int b) {
        if (head == null) {
            return;
        }
        if (head.getDepartureTime() > a && head.getDepartureTime() < b) {
            trips.add(head.getTripNodePtr());
        }
        dfs(head.getLeftPtr(), trips, a, b);
        dfs(head.getRightPtr(), trips, a, b);
    }

    // Method to book a trip and update the booked seats
    public Trip bookTrip(String pickUpLocation, String dropLocation, String vehicleNumber, int departureTime) {
        // Find the corresponding trip to book the seat and have proper validation
        Vehicle v = null;
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getVehicleNumber().equals(vehicleNumber)) {
                v = vehicle;
                break;
            }
        }
        List<Trip> trips = v.getTrips();
        for (Trip trip : trips) {
            if (trip.getPickUpLocation().equals(pickUpLocation) && trip.getDropLocation().equals(dropLocation)) {
                if (v.getSeatingCapacity() > trip.getBookedSeats() && trip.getDepartureTime() >= departureTime) {
                    trip.setBookedSeats(trip.getBookedSeats() + 1);
                    return trip;
                }
            }
        }
        return null;
    }
}

import java.util.ArrayList;
import java.util.List;

// Class representing a Vehicle
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

// Class representing a Trip
class Trip {
    private Vehicle vehicle;
    private String pickUpLocation;
    private String dropLocation;
    private int departureTime;
    private int bookedSeats;

    // Constructor to initialize a Trip with vehicle, pickup/drop locations, departure time, and booked seats
    public Trip(Vehicle vehicle, String pickUpLocation, String dropLocation, int departureTime) {
        this.vehicle = vehicle;
        this.pickUpLocation = pickUpLocation;
        this.dropLocation = dropLocation;
        this.departureTime = departureTime;
        this.bookedSeats = 0;
    }

    // Getter and setter methods for trip attributes
    public Vehicle getVehicle() {
        return vehicle;
    }

    public String getPickUpLocation() {
        return pickUpLocation;
    }

    public void setPickUpLocation(String newPickUpLocation) {
        pickUpLocation = newPickUpLocation;
    }

    public String getDropLocation() {
        return dropLocation;
    }

    public void setDropLocation(String newDropLocation) {
        dropLocation = newDropLocation;
    }

    public int getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(int newDepartureTime) {
        departureTime = newDepartureTime;
    }

    public int getBookedSeats() {
        return bookedSeats;
    }

    public void setBookedSeats(int newBookedSeats) {
        bookedSeats = newBookedSeats;
    }
}

// Class representing a Location
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

// Class representing a Binary Tree Node
class BinaryTreeNode {
    private BinaryTreeNode leftPtr;
    private BinaryTreeNode rightPtr;
    private BinaryTreeNode parentPtr;
    private int departureTime;
    private Trip tripNodePtr;

    // Constructor to initialize a node with departure time, trip, and parent node
    public BinaryTreeNode(int departureTime, Trip tripNodePtr, BinaryTreeNode parentPtr) {
        this.leftPtr = null;
        this.rightPtr = null;
        this.parentPtr = parentPtr;
        this.departureTime = departureTime;
        this.tripNodePtr = tripNodePtr;
    }

    // Getter and setter methods for node attributes
    public BinaryTreeNode getLeftPtr() {
        return leftPtr;
    }

    public void setLeftPtr(BinaryTreeNode newLeftPtr) {
        leftPtr = newLeftPtr;
    }

    public BinaryTreeNode getRightPtr() {
        return rightPtr;
    }

    public void setRightPtr(BinaryTreeNode newRightPtr) {
        rightPtr = newRightPtr;
    }

    public BinaryTreeNode getParentPtr() {
        return parentPtr;
    }

    public void setParentPtr(BinaryTreeNode newParentPtr) {
        parentPtr = newParentPtr;
    }

    public int getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(int newDepartureTime) {
        departureTime = newDepartureTime;
    }

    public Trip getTripNodePtr() {
        return tripNodePtr;
    }

    public void setTripNodePtr(Trip newTripNodePtr) {
        tripNodePtr = newTripNodePtr;
    }
}

// Class representing a Binary Tree
class BinaryTree {
    protected BinaryTreeNode root;

    // Constructor to initialize a binary tree with a null root
    public BinaryTree() {
        root = null;
    }

    // Methods to get the height and number of nodes in the tree
    public int getHeight() {
        // Return the height of the tree
        return 0;
    }

    public int getNumberOfNodes() {
        // Return the number of nodes in the tree
        return 0;
    }
}

// Class representing a Binary Search Tree (extends BinaryTree)
class BinarySearchTree extends BinaryTree {
    // Constructor for Binary Search Tree
    public BinarySearchTree() {
    }

    // Methods specific to a Binary Search Tree
    // Methods to get the element with minimum/maximum key, search node with a key, and find successor/predecessor nodes
    public BinaryTreeNode getElementWithMinimumKey() {
        return null;
    }

    public BinaryTreeNode getElementWithMaximumKey() {
        return null;
    }

    public BinaryTreeNode searchNodeWithKey(int key) {
        // Find and return the node with the given key (or the node with the next larger key)
        return null;
    }

    public BinaryTreeNode getSuccessorNode(BinaryTreeNode node) {
        // Find and return the successor node of the given node
        return null;
    }

    public BinaryTreeNode getPredecessorNode(BinaryTreeNode node) {
        // Find and return the predecessor node of the given node
        return null;
    }
}

// Class representing a Transport Service
class TransportService {
    private Location locationPtr;
    private BinaryTreeNode BSTHead;

    // Constructor to initialize a transport service with a location and binary tree head
    public TransportService(Location locationPtr, BinaryTreeNode BSTHead) {
        this.locationPtr = locationPtr;
        this.BSTHead = BSTHead;
    }

    // Getter and setter methods for transport service attributes
    public Location getLocationPtr() {
        return locationPtr;
    }

    public void setLocationPtr(Location newLocationPtr) {
        locationPtr = newLocationPtr;
    }

    public BinaryTreeNode getBSTHead() {
        return BSTHead;
    }

    public void setBSTHead(BinaryTreeNode newBSTHead) {
        BSTHead = newBSTHead;
    }

    // Method to add a node to the binary search tree
    public void add(BinaryTreeNode btn) {
        BinaryTreeNode head = getBSTHead();
        if (head == null) {
            setBSTHead(btn);
        } else {
            while (true) {
                if (btn.getDepartureTime() <= head.getDepartureTime() && head.getLeftPtr() == null) {
                    head.setLeftPtr(btn);
                    return;
                } else if (btn.getDepartureTime() < head.getDepartureTime() && head.getLeftPtr() != null) {
                    head = head.getLeftPtr();
                } else if (btn.getDepartureTime() >= head.getDepartureTime() && head.getRightPtr() == null) {
                    head.setRightPtr(btn);
                    return;
                } else if (btn.getDepartureTime() > head.getDepartureTime() && head.getRightPtr() != null) {
                    head = head.getRightPtr();
                }
            }
        }
    }

    // Method to add a trip to the binary search tree with a specified key
    public void addTrip(int key, Trip trip) {
        // Add the trip to the BST
    }
}

// Class representing a Travel Desk
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

// Main test class
public class TransportServiceTest {
    public static void main(String[] args) {
        // Main class for testing the implemented functionality
    }
}

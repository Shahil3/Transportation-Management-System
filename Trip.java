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
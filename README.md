# Transportation-Management-System
<p>
The Transportation Management System is a Java-based system designed to manage vehicles, trips, and locations within a transportation service. The system is implemented using object-oriented principles and includes classes for vehicles, trips, locations, and a binary search tree for efficient retrieval of trips based on departure time.</p>
<br>

<h2>Classes</h2>
<h3>1. Vehicle</h3>
Represents a vehicle with attributes such as vehicle number and seating capacity.
Maintains a list of associated trips.
Includes methods for adding trips and accessing vehicle information.
<h3>2. Trip</h3>
Represents a trip with details like pickup/drop locations, departure time, and booked seats.
Associated with a specific vehicle.
Allows booking seats and updating trip details.
<h3>3. Location</h3>
Represents a location with a name and an associated transport service.
Maintains a list of trips associated with the location.
Provides methods to add trips based on pickup location.
<h3>4. BinaryTreeNode</h3>
Represents a node in a binary tree used for efficient search operations.
Associated with a departure time and a trip.
Includes references to left and right child nodes.
<h3>5. BinaryTree</h3>
Represents a basic binary tree with a root node.
<h3>6. BinarySearchTree</h3>
Extends BinaryTree and represents a binary search tree.
Implements methods specific to a binary search tree, such as finding nodes with minimum/maximum keys, searching for nodes, and finding successor/predecessor nodes.
<h3>7. TransportService</h3>
Represents a transport service associated with a location and a binary search tree.
Includes methods to add nodes to the binary search tree and add trips with specified keys.
<h3>8. TravelDesk</h3>
Main class for managing the entire transportation system.
Maintains lists of vehicles and locations.
Provides methods for adding trips, showing trips within a time range, and booking trips.
<br>
<h4>Usage:</h4>
The TransportServiceTest class serves as the entry point for testing the implemented functionality. It can be extended to include specific test cases and scenarios.

<h4>How to Use Vehicle and Trip Management:</h4>

Create instances of vehicles and trips.
Add trips to vehicles using the addTrip method.
Location and Transport Service:

<h4>Create locations and transport services.</h4>
Associate locations with transport services.
Add trips to the binary search tree of a transport service.
Travel Desk:

Create a TravelDesk instance to manage the overall transportation system.
Use the addTrip method to add trips to the system.
Use the showTrips method to retrieve trips within a specified time range for a given location.
Use the bookTrip method to book seats for a trip.


<h3>Contributors</h3>
shahil sharma

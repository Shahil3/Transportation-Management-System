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
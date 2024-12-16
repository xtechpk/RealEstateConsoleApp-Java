public class Property extends PropertyBase {
    String ownerName;

    Property(int propertyID, String description, double price, String ownerName) {
        super(propertyID, description, price);
        this.ownerName = ownerName;
    }

    @Override
    void viewDetails() {
        System.out.println("Property ID: " + propertyID + ", Description: " + description + 
                           ", Price: " + price + ", Owner: " + ownerName);
    }
}

class Bid {
    int bidID;
    int propertyID;
    int customerID;
    double amount;

    Bid(int bidID, int propertyID, int customerID, double amount) {
        this.bidID = bidID;
        this.propertyID = propertyID;
        this.customerID = customerID;
        this.amount = amount;
    }

    void placeBid() {
        System.out.println("Bid placed by customer ID " + customerID + " on property ID " + propertyID + 
                           " for amount $" + amount);
    }
}
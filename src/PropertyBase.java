public abstract class PropertyBase {
    int propertyID;
    String description;
    double price;

    PropertyBase(int propertyID, String description, double price) {
        this.propertyID = propertyID;
        this.description = description;
        this.price = price;
    }

    abstract void viewDetails();
}

public class Customer extends Person implements Manageable, PropertyActions {
    int customerID;
    double budget;

    Customer(int customerID, String name, String email, double budget) {
        super(name, email);
        this.customerID = customerID;
        this.budget = budget;
    }

    @Override
    public void register() {
        System.out.println("Customer " + name + " registered successfully.");
    }

    @Override
    public void updateInfo() {
        System.out.println("Customer " + name + " info updated.");
    }

    @Override
    public void addProperty() {
        System.out.println("Customer " + name + " added a property.");
    }

    @Override
    public void searchProperty() {
        System.out.println("Customer " + name + " is searching for properties.");
    }

    @Override
    public void purchaseProperty() {
        System.out.println("Customer " + name + " purchased a property.");
    }

    @Override
    void displayInfo() {
        System.out.println("Customer ID: " + customerID + ", Name: " + name + ", Budget: " + budget);
    }
}

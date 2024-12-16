import java.util.*;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Collections to store registered entities
        List<Person> persons = new ArrayList<>();
        List<PropertyBase> properties = new ArrayList<>();
        List<Bid> bids = new ArrayList<>();

        while (true) {
            System.out.println("\n--- Property Dealer Application ---");
            System.out.println("1. Register Dealer");
            System.out.println("2. Register Customer");
            System.out.println("3. Add Property");
            System.out.println("4. View All Dealers");
            System.out.println("5. View All Customers");
            System.out.println("6. List Properties");
            System.out.println("7. Place Bid");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                // Register Dealer
                case 1: 
                    System.out.print("Enter Dealer ID: ");
                    int dealerID = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Enter Dealer Name: ");
                    String dealerName = scanner.nextLine();
                    System.out.print("Enter Dealer Email: ");
                    String dealerEmail = scanner.nextLine();

                    Dealer dealer = new Dealer(dealerID, dealerName, dealerEmail);
                    persons.add(dealer);
                    dealer.register();
                    break;
                // Register Customer
                case 2: 
                    System.out.print("Enter Customer ID: ");
                    int customerID = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Enter Customer Name: ");
                    String customerName = scanner.nextLine();
                    System.out.print("Enter Customer Email: ");
                    String customerEmail = scanner.nextLine();
                    System.out.print("Enter Customer Budget: ");
                    double budget = scanner.nextDouble();

                    Customer customer = new Customer(customerID, customerName, customerEmail, budget);
                    persons.add(customer);
                    customer.register();
                    break;
                // Add Property
                case 3: 
                    System.out.print("Enter Property ID: ");
                    int propertyID = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Enter Property Description: ");
                    String description = scanner.nextLine();
                    System.out.print("Enter Property Price: ");
                    double price = scanner.nextDouble();
                    scanner.nextLine(); 
                    System.out.print("Enter Owner Name: ");
                    String ownerName = scanner.nextLine();

                    Property property = new Property(propertyID, description, price, ownerName);
                    properties.add(property);
                    System.out.println("Property added successfully.");
                    break;
                // View All Dealers
                case 4: 
                    System.out.println("\nRegistered Dealers:");
                    for (Person person : persons) {
                        if (person instanceof Dealer) {
                            person.displayInfo();
                        }
                    }
                    break;
                // View All Customers
                case 5: 
                    System.out.println("\nRegistered Customers:");
                    for (Person person : persons) {
                        if (person instanceof Customer) {
                            person.displayInfo();
                        }
                    }
                    break;
                // List Properties
                case 6: 
                    System.out.println("\nAvailable Properties:");
                    for (PropertyBase Property : properties) {
                        Property.viewDetails();
                    }
                    break;
                // Place Bid
                case 7: 
                    System.out.print("Enter Customer ID: ");
                    int bidCustomerID = scanner.nextInt();
                    System.out.print("Enter Property ID: ");
                    int bidPropertyID = scanner.nextInt();
                    System.out.print("Enter Bid Amount: ");
                    double amount = scanner.nextDouble();

                    Bid bid = new Bid(bids.size() + 1, bidPropertyID, bidCustomerID, amount);
                    bids.add(bid);
                    bid.placeBid();
                    break;
                 // Exit
                case 8:
                    System.out.println("Exiting the application...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

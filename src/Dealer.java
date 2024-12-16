public class Dealer extends Person implements Manageable {
    int dealerID;

    Dealer(int dealerID, String name, String email) {
        super(name, email);
        this.dealerID = dealerID;
    }

    @Override
    public void register() {
        System.out.println("Dealer " + name + " registered successfully.");
    }

    @Override
    public void updateInfo() {
        System.out.println("Dealer " + name + " info updated.");
    }

    @Override
    void displayInfo() {
        System.out.println("Dealer ID: " + dealerID + ", Name: " + name + ", Email: " + email);
    }
}


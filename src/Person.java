public abstract class Person {
    String name;
    String email;

    Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    abstract void displayInfo();
}

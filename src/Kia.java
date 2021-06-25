public class Kia extends Car {
    public Kia(String name, int bouwjaar) {
        super(name, bouwjaar);
    }

    public void drive() {
        System.out.println("Driving...");
    }

    // Polymorphism
    public void welcomeMessage() {
        System.out.println("Welcome to Kia.");
    }

    // Method Override
    @Override
    public void fullname() {
        System.out.println("Kia: " + getName() + " " + getBouwjaar());
    }
}

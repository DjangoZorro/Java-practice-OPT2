// Can be abstract, but then couldn't use in other classes.
public class Car {
    private String name;
    private int bouwjaar;

    public Car(String name, int bouwjaar) {
        this.name = name;
        this.bouwjaar = bouwjaar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBouwjaar() {
        return bouwjaar;
    }

    public void setBouwjaar(int bouwjaar) {
        this.bouwjaar = bouwjaar;
    }

    public void fullname() {
        System.out.println("Car details: " + name + " " + bouwjaar);
    }

    // toString()
    public String toString(){ //overriding the toString() method
        return name + " " + bouwjaar;
    }

    // Polymorphism
    public void welcomeMessage() {
        System.out.println("Welcome to Car.");
    }
}

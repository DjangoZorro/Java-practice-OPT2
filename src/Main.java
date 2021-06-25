public class Main {
    public static void main(String[] args) {
        Car mycar = new Kia("hoefnieperce,alsniehebt", 1999);
        // instantie/referentie myCar
        ((Kia) mycar).drive();

        // Wide Cast
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double
        System.out.println(myInt);      // Outputs 9
        System.out.println(myDouble);   // Outputs 9.0
        // Narrow Cast
        double myDouble1 = 9.78d;
        int myInt1 = (int) myDouble; // Manual casting: double to int
        System.out.println(myDouble1);   // Outputs 9.78
        System.out.println(myInt1);      // Outputs 9

        // instanceof
        Kia s = new Kia("test", 1999);
        System.out.println(s instanceof Car); //true
        // instanceof kan ook
        // Simple1 s = new Simple1();                       (example)
        // System.out.println(s instanceof Simple1); //true (example)

        // toString()
        Car car1 = new Kia("car1", 1999);
        System.out.println(car1);

        // Method Override
        car1.fullname();

        // Method Overload
        int myNum1 = Person.plusMethodInt(8, 5);
        double myNum2 = Person.plusMethodDouble(4.3, 6.26);
        System.out.println("int: " + myNum1);
        System.out.println("double: " + myNum2);

        // Polymorphism
        Car car2 = new Car("car1", 1999);
        car2.welcomeMessage();
        Car car3 = new Kia("car1", 1999);
        car3.welcomeMessage();
    }
}

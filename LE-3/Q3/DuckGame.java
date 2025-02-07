// Behavior Interface for Quacking
interface Quackable {
    void quack();
}

// Behavior Interface for Flying
interface Flyable {
    void fly();
}

// Behavior Interface for Squeaking
interface Squeakable {
    void squeak();
}

// Common behavior: Swimming (all ducks can swim)
interface Swimable {
    void swim();
}

public class DuckGame {
    public static void main(String[] args) {
        // Create instances of different ducks
        Swimable rubberDuck = new RubberDuck();
        Swimable woodenDuck = new WoodenDuck();
        Swimable redHeadDuck = new RedHeadDuck();
        Swimable lakeDuck = new LakeDuck();

        // Demonstrating Rubber Duck behavior
        rubberDuck.swim(); // Rubber Duck swims!
        ((Squeakable) rubberDuck).squeak(); // Rubber Duck squeaks!

        // Demonstrating Wooden Duck behavior
        woodenDuck.swim(); // Wooden Duck swims!

        // Demonstrating RedHead Duck behavior
        redHeadDuck.swim(); // RedHead Duck swims!
        ((Quackable) redHeadDuck).quack(); // RedHead Duck quacks!
        ((Flyable) redHeadDuck).fly(); // RedHead Duck flies!

        // Demonstrating Lake Duck behavior
        lakeDuck.swim(); // Lake Duck swims!
        ((Quackable) lakeDuck).quack(); // Lake Duck quacks!
        ((Flyable) lakeDuck).fly(); // Lake Duck flies!
    }
}

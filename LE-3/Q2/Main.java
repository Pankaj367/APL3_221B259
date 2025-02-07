// Concrete Class Test implementing Testable
class Test implements Testable {
    // Providing implementation of the display method
    @Override
    public void display() {
        System.out.println("Display method implemented in Test class.");
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an instance of Test
        Test test = new Test();
        test.display(); // Calling the display method
         // Create an instance of ConcreteTest (which is a subclass of AbsTest)
        ConcreteTest concreteTest = new ConcreteTest();
        concreteTest.display(); // Calling the display method
    }
}
// Abstract class AbsTest implementing Testable
abstract class AbsTest implements Testable {
    // Abstract class can provide an abstract method (which is implemented by subclasses)
    public abstract void display();
}

// Concrete subclass of AbsTest
class ConcreteTest extends AbsTest {
    // Providing implementation of the display method
    @Override
    public void display() {
        System.out.println("Display method implemented in ConcreteTest class.");
    }
}


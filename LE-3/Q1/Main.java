// Base class: Bharatvanshi (abstract class)
abstract class Bharatvanshi {
    protected String name;

    // Constructor
    public Bharatvanshi(String name) {
        this.name = name;
    }

    // Abstract method - every Bharatvanshi is a fighter
    public abstract void fight();
}


// Test the characters
public class Main {
    public static void main(String[] args) {
        // Create instances of the characters
        Bharatvanshi arjun = new Arjun();
        Bharatvanshi bheem = new Bheem();
        Bharatvanshi duryodhan = new Duryodhan();
        Bharatvanshi vikarn = new Vikarn();

        // Array of Bharatvanshi objects for easy iteration
        Bharatvanshi[] characters = {arjun, bheem, duryodhan, vikarn};

        // Iterate through each character and demonstrate their behavior
        for (Bharatvanshi character : characters) {
            System.out.println("Character: " + character.name);
            character.fight();
            if (character instanceof Pandav) {
                // If the character is a Pandav, call Pandav-specific methods
                ((Pandav) character).obey();
                ((Pandav) character).checkKindness();
            } else if (character instanceof Kaurav) {
                // If the character is a Kaurav, call Kaurav-specific methods
                ((Kaurav) character).disobey();
                ((Kaurav) character).checkCruelty();
            }
            System.out.println();  // Print a new line between characters
        }
    }
}

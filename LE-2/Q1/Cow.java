class Cow extends Animal {
    Cow() {
        super("Cow");
    }

    @Override
    void makeSound() {
        System.out.println("Moo");
    }
}
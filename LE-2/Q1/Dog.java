class Dog extends Animal {
    Dog() {
        super("Dog");
    }

    @Override
    void makeSound() {
        System.out.println("Woof");
    }
}
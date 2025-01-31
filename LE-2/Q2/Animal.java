 
 
 class Animal{
     
    String name;

    Animal(String name) {
        this.name = name;
    }

    void makeSound() {
        System.out.println("Some generic animal sound");
    }
 }
 
 
 
 
 class Cow extends Animal {
    Cow() {
        super("Cow");
    }

    @Override
    void makeSound() {
        System.out.println("Moo");
    }
}

class Dog extends Animal {
    Dog() {
        super("Dog");
    }

    @Override
    void makeSound() {
        System.out.println("Woof");
    }
}

class Pig extends Animal {
    Pig() {
        super("Pig");
    }

    @Override
    void makeSound() {
        System.out.println("Oink");
    }
}

class Goat extends Animal {
    Goat() {
        super("Goat");
    }

    @Override
    void makeSound() {
        System.out.println("Bleat");
    }
}

class Lion extends Animal {
    Lion() {
        super("Lion");
    }

    @Override
    void makeSound() {
        System.out.println("Roar");
    }
}
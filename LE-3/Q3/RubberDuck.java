class RubberDuck implements Swimable, Squeakable {
    @Override
    public void swim() {
        System.out.println("Rubber Duck swims!");
    }

    @Override
    public void squeak() {
        System.out.println("Rubber Duck squeaks!");
    }
}

class RedHeadDuck implements Swimable, Quackable, Flyable {
    @Override
    public void swim() {
        System.out.println("RedHead Duck swims!");
    }

    @Override
    public void quack() {
        System.out.println("RedHead Duck quacks!");
    }

    @Override
    public void fly() {
        System.out.println("RedHead Duck flies!");
    }
}

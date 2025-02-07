class LakeDuck implements Swimable, Quackable, Flyable {
    @Override
    public void swim() {
        System.out.println("Lake Duck swims!");
    }

    @Override
    public void quack() {
        System.out.println("Lake Duck quacks!");
    }

    @Override
    public void fly() {
        System.out.println("Lake Duck flies!");
    }
}

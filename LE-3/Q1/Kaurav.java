// Kaurav Class (derived from Bharatvanshi)
class Kaurav extends Bharatvanshi {
    protected boolean cruelty;
    protected boolean obedience;

    // Constructor for Kaurav
    public Kaurav(String name, boolean cruelty, boolean obedience) {
        super(name);
        this.cruelty = cruelty;
        this.obedience = obedience;
    }

    // Kaurav disobeys (method specific to Kaurav)
    public void disobey() {
        System.out.println(name + " is disobeying!");
    }

    // Override fight method for Kauravs
    @Override
    public void fight() {
        System.out.println(name + " is fighting fiercely!");
    }

    // Check cruelty
    public void checkCruelty() {
        System.out.println(name + " is cruel: " + cruelty);
    }
}
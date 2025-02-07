// Pandav Class (derived from Bharatvanshi)
class Pandav extends Bharatvanshi {
    protected boolean obedience;
    protected boolean kindness;

    // Constructor for Pandav
    public Pandav(String name, boolean obedience, boolean kindness) {
        super(name);
        this.obedience = obedience;
        this.kindness = kindness;
    }

    // Pandav obeys (method specific to Pandav)
    public void obey() {
        System.out.println(name + " is obeying!");
    }

    // Override fight method for Pandavs
    @Override
    public void fight() {
        System.out.println(name + " is fighting skillfully!");
    }

    // Check kindness
    public void checkKindness() {
        System.out.println(name + " is kind: " + kindness);
    }
}
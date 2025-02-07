// Specific Kaurav: Vikarn (special case, behaves like a Pandav)
class Vikarn extends Kaurav {
    public Vikarn() {
        super("Vikarn", false, true);  // Vikarn is kind and obedient
    }

    @Override
    public void fight() {
        System.out.println(name + " fights like a Pandav!");
    }
}
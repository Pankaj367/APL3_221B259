public class Application{
    public static void main(String[]args){
        Crow crow= new IndianCrow();
        Swan swan = new IndianSwan();
        CrowAdapter crowAdapter= new CrowAdapter(crow);
        client(crowAdapter);
    }
    public static void client(Swan swan){
        swan.eat();
        swan.swim();
        swan.sing();
    }
}
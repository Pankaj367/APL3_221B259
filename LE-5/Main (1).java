abstract class Offering{
     abstract int getPrice();
     abstract String getName();
}
public class Main
{
	public static void main(String[] args) {
		Offering offering =new Coffee();
		offering =new Rum(offering);
		offering =new Rum(offering);
		offering=new gin(offering);
		System.out.println(" "+ offering.getName()+" "+ offering.getPrice());
		
		Offering offering1 =new Tea();
		offering =new Rum(offering);
		offering =new Rum(offering);
		offering=new gin(offering);
		System.out.println(" "+ offering.getName()+" "+ offering.getPrice());
		
		Offering offering2 =new Icecream();
		offering =new Rum(offering);
		offering =new Rum(offering);
		offering=new gin(offering);
		System.out.println(" "+ offering.getName()+" "+ offering.getPrice());
		
		Offering offering3 =new Roohafza();
		offering =new Rum(offering);
		offering =new Rum(offering);
		offering=new gin(offering);
		System.out.println(" "+ offering.getName()+" "+ offering.getPrice());
	}
}

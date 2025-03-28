
abstract class beverages{
    protected void pour(int qty){
        System.out.println("pour " +qty + "ml of beverage  in a glass");
    }
    protected    void addCondiment(String item){
        System.out.println("Add "+item);
    }
    protected void stir(int time){
        System.out.println("Stir for "+time+"sec");
    }
    protected void serve(){
        System.out.println("serve through waiter");
    }
   
} 



public class Main
{
	public static void main(String[] args) {
	 
		Whiskey w=new Whiskey();
		w.templateMethod();
		
		Beer b=new Beer();
		b.templateMethod();
		
		Rum r=new Rum();
		r.templateMethod();
	}
}


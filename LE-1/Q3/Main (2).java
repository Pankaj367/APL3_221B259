public class Main
{
	public static void main (String args[]){
	    
    Mother m= new Mother();
    m.Show();
    
    Child ch=new Child();
    ch.Show(); 
    
    Mother m1= new Child();
    m1.Show();
 }
}
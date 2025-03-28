class Whiskey extends  beverages{
     
 
    public final void templateMethod(){
           System.out.println("For Whiskey");
        pour(30);
        addCondiment("ice");
        stir(27);
        serve();
    }
}


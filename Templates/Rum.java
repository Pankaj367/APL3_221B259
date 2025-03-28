class Rum extends  beverages{
    
    
    public final void templateMethod(){
         System.out.println("For Rum");
        pour(20);
        addCondiment("water");
        stir(30);
        serve();
    }
}

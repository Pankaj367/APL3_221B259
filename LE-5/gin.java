class gin extends Decorator{
    gin(Offering offering){
        this.offering=offering;
    }
    String getName(){
        return offering.getName()+ "with gin";
    }
    int getPrice(){
        return offering.getPrice()+25;
    }
}
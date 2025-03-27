abstract class Beverage{
    private void Pour(int qty){
        System.out.println("Pour " + qty + " ml of beverage in a glass");
    }
    protected abstract void addCondiment();
    protected void Stir(){}
    private void Serve(){
        System.out.println("Serve through waiter");
    }
    
    public void templateMethod(int qty){
        Pour(qty);
        addCondiment();
        Stir();
        Serve();
    }
}
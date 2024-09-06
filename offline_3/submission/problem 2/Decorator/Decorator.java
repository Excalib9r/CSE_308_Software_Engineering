public class Decorator implements Coffee{
    protected Coffee coffee;
    public Decorator(Coffee coffee){
        this.coffee = coffee;
    }
    @Override
    public int getPrice() {
        return coffee.getPrice();
    }

    @Override
    public String getDescriptions() {
        return coffee.getDescriptions();
    }
}

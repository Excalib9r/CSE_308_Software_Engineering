public class BlackCoffee extends Decorator{
    BlackCoffee(Coffee coffee) {
        super(coffee);
    }
    @Override
    public int getPrice() {
        return coffee.getPrice();
    }

    @Override
    public String getDescriptions() {
        return coffee.getDescriptions() + ", water";
    }

}

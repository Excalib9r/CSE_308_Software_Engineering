public class Americano extends Decorator{
    Americano(Coffee coffee) {
        super(coffee);
    }
    @Override
    public int getPrice() {
        return coffee.getPrice() + 30;
    }
    @Override
    public String getDescriptions() {
        return coffee.getDescriptions();
    }
}

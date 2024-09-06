public class Cappuccino extends Decorator{
    Cappuccino(Coffee coffee) {
        super(coffee);
    }
    @Override
    public int getPrice() {
        return coffee.getPrice() + 50;
    }
    @Override
    public String getDescriptions() {
        return coffee.getDescriptions() + ", cinnamon powder";
    }
}

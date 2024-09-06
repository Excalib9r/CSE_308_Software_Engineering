public class Mocha extends Decorator{
    Mocha(Coffee coffee) {
        super(coffee);
    }
    @Override
    public int getPrice() {
        return coffee.getPrice() + 60;
    }
    @Override
    public String getDescriptions() {
        return coffee.getDescriptions() + ", chocolate sauce";
    }
}

public class Espresso extends Decorator{
    Espresso(Coffee coffee) {
        super(coffee);
    }
    @Override
    public int getPrice() {
        return coffee.getPrice() + 40;
    }
    @Override
    public String getDescriptions() {
        return coffee.getDescriptions() + ", dairy cream";
    }
}

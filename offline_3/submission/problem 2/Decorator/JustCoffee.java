public class JustCoffee implements Coffee{
    @Override
    public int getPrice() {
        return 30;
    }
    @Override
    public String getDescriptions() {
        return "Coffee Ingredients: grinded coffee beans";
    }
}

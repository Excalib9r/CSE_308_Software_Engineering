public class Toyota_Man extends Manufacturer{
    @Override
    Car getCar() {
        return new Toyota();
    }
}
